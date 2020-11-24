package com.platon.browser.now.service.cache;

import com.platon.browser.dao.entity.NetworkStat;
import com.platon.browser.dto.transaction.TokenTransferRecordCacheDto;
import com.platon.browser.dto.transaction.TransactionCacheDto;
import com.platon.browser.elasticsearch.dto.Block;

import java.util.List;

/**
 * 缓存封装service
 *  @file StatisticCacheService.java
 *  @description 
 *	@author zhangrj
 *  @data 2019年8月31日
 */
public interface StatisticCacheService {
	
	/**
	 * 分页获取区块缓存数据
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public List<Block> getBlockCache(Integer pageNum, Integer pageSize);
	
	/**
	 * 根据开始结束获取区块缓存数据
	 * @return
	 */
	public List<Block> getBlockCacheByStartEnd(Long start, Long end);
	
	/**
	 * 获取缓存统计信息
	 * @method getNetworkStatCache
	 * @return
	 */
	public NetworkStat getNetworkStatCache();
	
	/**
	 * 分页获取交易缓存数据
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public TransactionCacheDto getTransactionCache(Integer pageNum, Integer pageSize);

	/**
	 * 分页获取代币交易记录列表
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public TokenTransferRecordCacheDto getTokenTransferRecordCache(Integer pageNum, Integer pageSize);
}
