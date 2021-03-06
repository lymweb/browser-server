package com.platon.browser.elasticsearch;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @Auther: Chendongming
 * @Date: 2019/10/25 15:12
 * @Description: 交易操作
 */
@Repository
public class TransactionESRepository extends ESRepository {
    @Value("${spring.elasticsearch.high-level-client.transactionIndexName}")
    private String indexName;

    @Override
    public String getIndexName() {
        return indexName;
    }
    
    public void setIndexName(String indexName) {
		this.indexName = indexName;
	}
}
