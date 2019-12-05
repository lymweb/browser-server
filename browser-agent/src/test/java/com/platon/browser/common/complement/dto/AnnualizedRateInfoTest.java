package com.platon.browser.common.complement.dto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Auther: dongqile
 * @Date: 2019/12/5 15:09
 * @Description: 年化率信息bean单元测试
 */
@RunWith(MockitoJUnitRunner.Silent.class)
public class AnnualizedRateInfoTest {

    @Test
    public void test(){
        PeriodValueElement  profit = new PeriodValueElement();
        profit.setPeriod(100L);
        profit.setValue(BigDecimal.TEN);
        List<PeriodValueElement> profitList = new ArrayList <>();
        profitList.add(profit);
        PeriodValueElement cost = new PeriodValueElement();
        cost.setPeriod(120L);
        cost.setValue(BigDecimal.TEN);
        List<PeriodValueElement> costList = new ArrayList <>();
        costList.add(cost);
        SlashInfo slash = new SlashInfo();
        slash.setSlashTime(new Date());
        slash.setBlockCount(BigInteger.ONE);
        slash.setBlockNumber(BigInteger.ONE);
        slash.setKickOut(false);
        slash.setSlashAmount(BigDecimal.TEN);
        slash.setSlashBlockCount(BigInteger.ONE);
        List<SlashInfo> slashList = new ArrayList <>();
        slashList.add(slash);
        AnnualizedRateInfo annualizedRateInfo = new AnnualizedRateInfo();
        annualizedRateInfo.setCost(profitList);
        annualizedRateInfo.setProfit(costList);
        annualizedRateInfo.setSlash(slashList);
        String annuaString = annualizedRateInfo.toJSONString();
    }


}
