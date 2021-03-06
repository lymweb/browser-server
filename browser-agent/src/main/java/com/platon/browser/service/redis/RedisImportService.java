package com.platon.browser.service.redis;

import com.platon.browser.dao.entity.NetworkStat;
import com.platon.browser.elasticsearch.dto.Block;
import com.platon.browser.elasticsearch.dto.ESTokenTransferRecord;
import com.platon.browser.elasticsearch.dto.Transaction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Redis数据批量入库服务
 * @Auther: Chendongming
 * @Date: 2019/10/25 15:12
 * @Description: ES服务
 */
@Slf4j
@Service
public class RedisImportService {
    @Resource
    private RedisBlockService redisBlockService;
    @Resource
    private RedisTransactionService redisTransactionService;
    @Resource
    private RedisStatisticService redisStatisticService;

    @Resource
    private RedisTransferTokenRecordService redisTransferTokenRecordService;

    private static final int SERVICE_COUNT = 4;

    private static final ExecutorService EXECUTOR = Executors.newFixedThreadPool(SERVICE_COUNT);

    private <T> void submit(RedisService<T> service, Set<T> data, boolean serialOverride, CountDownLatch latch){
        EXECUTOR.submit(()->{
            try {
                service.save(data,serialOverride);
            } catch (Exception e) {
                log.error("",e);
            }finally {
                latch.countDown();
            }
        });
    }

    @Retryable(value = Exception.class, maxAttempts = Integer.MAX_VALUE)
    public void batchImport(Set<Block> blocks, Set<Transaction> transactions, Set<NetworkStat> statistics) throws InterruptedException {
        log.debug("Redis批量导入:{}(blocks({}),transactions({}),statistics({})",Thread.currentThread().getStackTrace()[1].getMethodName(),blocks.size(),transactions.size(),statistics.size());
        long startTime = System.currentTimeMillis();
        try{
            Set<ESTokenTransferRecord> recordSet = retryRecordSet(transactions);
            CountDownLatch latch = new CountDownLatch(SERVICE_COUNT);
            submit(redisBlockService,blocks,false,latch);
            submit(redisTransactionService,transactions,false,latch);
            submit(redisStatisticService,statistics,true,latch);
            submit(redisTransferTokenRecordService, recordSet,false,latch);
            latch.await();
            log.debug("处理耗时:{} ms",System.currentTimeMillis()-startTime);
        }catch (Exception e){
            log.error("",e);
            throw e;
        }
    }

    /**
     * retry transfer record from transactions.
     */
    public Set<ESTokenTransferRecord> retryRecordSet(Set<Transaction> txSet){
        Set<ESTokenTransferRecord> recordSet = new HashSet<>();
        if (txSet != null && !txSet.isEmpty()) {
            for (Transaction tx : txSet) {
                if (null != tx && null != tx.getEsTokenTransferRecords() && !tx.getEsTokenTransferRecords().isEmpty()) {
                    recordSet.addAll(tx.getEsTokenTransferRecords());
                }
            }
        }
        return recordSet;
    }
}
