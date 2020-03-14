package com.platon.browser.complement.dao.param.stake;

import com.platon.browser.common.enums.BusinessType;
import com.platon.browser.complement.dao.param.BusinessParam;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

import java.math.BigInteger;
import java.util.Date;

/**
 * @description: 退出质押 入库参数
 * @author: chendongming@juzix.net
 * @create: 2019-11-04 17:58:27
 **/
@Data
@Slf4j
@Builder
@Accessors(chain = true)
public class StakeExit implements BusinessParam {
    //节点id
    private String nodeId;
    //质押交易所在块高
    private BigInteger stakingBlockNum;
    //时间
    private Date time;
    //结算周期标识(撤销质押交易所在的结算周期轮数)
    private int stakingReductionEpoch;
    //解质押需要经过的结算周期数
    private int unStakeFreezeDuration;

    @Override
    public BusinessType getBusinessType() {
        return BusinessType.STAKE_EXIT;
    }
}
