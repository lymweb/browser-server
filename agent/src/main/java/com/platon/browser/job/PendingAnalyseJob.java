package com.platon.browser.job;

import com.platon.browser.filter.PendingFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * User: dongqile
 * Date: 2018/10/25
 * Time: 18:07
 */
@Component
public class PendingAnalyseJob {

    /**
     * 挂起交易同步任务
     * 1.根据web3j配置文件获取节点信息
     * 2.构建web3jclient
     * 3.同步链上挂起交易列表
     * 4.数据整合推送至rabbitMQ队列
     */

    private static Logger logger = LoggerFactory.getLogger(PendingAnalyseJob.class);
    @Autowired
    private PendingFilter pendingFilter;

    /**
     * 分析待处理交易
     */
    @Scheduled(cron = "0/1 * * * * ?")
    protected void analysePending() {
        logger.debug("*** In the PendingAnalyseJob *** ");
        try {
            pendingFilter.analyse();
            logger.debug("**************PendingTx Analysis end ***************");
        } catch (Exception e) {
            logger.error("PendingTxSynchronizeJob Exception:{}", e.getMessage());
        }
        logger.debug("*** End the PendingAnalyseJob *** ");
    }
}
