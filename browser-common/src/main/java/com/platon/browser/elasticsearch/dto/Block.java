package com.platon.browser.elasticsearch.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Block {
    @JsonIgnore
    protected List<Transaction> transactions = new ArrayList<>();
    @JsonIgnore
    private Integer tokenQty = 0;
    private Long num;
    private String hash;
    private String pHash;
    private Date time;
    private Integer size;
    private String gasLimit;
    private String gasUsed;
    private Integer txQty;
    private Integer tranQty;
    private Integer sQty;
    private Integer pQty;
    private Integer dQty;
    private String txGasLimit;
    private String txFee;
    private String nodeName;
    private String nodeId;
    private String reward;
    private String miner;
    private Date creTime;
    private Date updTime;
    private String extra;

    /******** 把字符串类数值转换为大浮点数的便捷方法 ********/
    public BigDecimal decimalGasLimit() {
        return new BigDecimal(this.getGasLimit());
    }

    public BigDecimal decimalGasUsed() {
        return new BigDecimal(this.getGasUsed());
    }

    public BigDecimal decimalTxGasLimit() {
        return new BigDecimal(this.getTxGasLimit());
    }

    public BigDecimal decimalTxFee() {
        return new BigDecimal(this.getTxFee());
    }

    public BigDecimal decimalReward() {
        return new BigDecimal(this.getReward());
    }

}