package com.platon.browser.resp.staking;

import java.math.BigDecimal;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.platon.browser.config.CustomLatSerializer;

/**
 * 地址锁仓列表返回对象
 *  @file DelegationListByAddressResp.java
 *  @description 
 *	@author zhangrj
 *  @data 2019年8月31日
 */
public class DelegationListByAddressResp {
	private String nodeId;            //节点id
    private String nodeName;          //节点名称
    private BigDecimal delegateValue;     //委托数量
    private BigDecimal delegateHas;       //未锁定委托（LAT）
    private BigDecimal delegateLocked;    //已锁定委托（LAT）
    private BigDecimal delegateUnlock;    //已解除委托（LAT） 
    private BigDecimal delegateReleased;  //赎回中委托（LAT） 
	public String getNodeId() {
		return nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	@JsonSerialize(using = CustomLatSerializer.class)
	public BigDecimal getDelegateValue() {
		return delegateValue;
	}
	public void setDelegateValue(BigDecimal delegateValue) {
		this.delegateValue = delegateValue;
	}
	@JsonSerialize(using = CustomLatSerializer.class)
	public BigDecimal getDelegateHas() {
		return delegateHas;
	}
	public void setDelegateHas(BigDecimal delegateHas) {
		this.delegateHas = delegateHas;
	}
	@JsonSerialize(using = CustomLatSerializer.class)
	public BigDecimal getDelegateLocked() {
		return delegateLocked;
	}
	public void setDelegateLocked(BigDecimal delegateLocked) {
		this.delegateLocked = delegateLocked;
	}
	@JsonSerialize(using = CustomLatSerializer.class)
	public BigDecimal getDelegateUnlock() {
		return delegateUnlock;
	}
	public void setDelegateUnlock(BigDecimal delegateUnlock) {
		this.delegateUnlock = delegateUnlock;
	}
	@JsonSerialize(using = CustomLatSerializer.class)
	public BigDecimal getDelegateReleased() {
		return delegateReleased;
	}
	public void setDelegateReleased(BigDecimal delegateReleased) {
		this.delegateReleased = delegateReleased;
	}
	
    
    
}
