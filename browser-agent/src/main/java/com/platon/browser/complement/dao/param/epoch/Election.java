package com.platon.browser.complement.dao.param.epoch;

import com.platon.browser.common.enums.BusinessType;
import com.platon.browser.complement.dao.param.BusinessParam;
import com.platon.browser.dao.entity.Staking;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

/**
 * @Auther: dongqile
 * @Date: 2019/10/31
 * @Description: 选举周期切换参数入库
 */
@Data
@Builder
@Accessors(chain = true)
public class Election implements BusinessParam {
    //需要惩罚的列表
    private List <Staking> slashNodeList;
    //结算周期
    private int settingEpoch;
    //时间
    private Date time;
    // 是否惩罚上上轮
    private int isPrePreRound;
    //解质押需要经过的结算周期数
    private int unStakeFreezeDuration;

    @Override
    public BusinessType getBusinessType () {
        return BusinessType.ELECTION_EPOCH;
    }
}