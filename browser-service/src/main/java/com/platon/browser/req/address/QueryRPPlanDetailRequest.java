package com.platon.browser.req.address;

import lombok.Data;

import javax.validation.constraints.NotBlank;

import com.platon.browser.req.PageReq;

/**
 *  查询地址锁仓详情请求对象
 *  @file QueryDetailRequest.java
 *  @description 
 *	@author zhangrj
 *  @data 2019年8月31日
 */
@Data
public class QueryRPPlanDetailRequest extends PageReq{
    @NotBlank(message = "{address not null}")
    private String address;
}