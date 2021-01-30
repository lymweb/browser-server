package com.platon.browser.bean;

import com.platon.browser.dao.entity.Address;
import lombok.Data;

/**
 * 合约地址详情
 *
 * @author huangyongpeng@matrixelements.com
 * @date 2021/1/27
 */
@Data
public class CustomAddressDetail extends Address {

    /**
     * 合约类型：erc20 | erc721
     */
    private String tokenType;

    /**
     * 合约符号
     */
    private String tokenSymbol;

    /**
     * 合约名称
     */
    private String tokenName;

}
