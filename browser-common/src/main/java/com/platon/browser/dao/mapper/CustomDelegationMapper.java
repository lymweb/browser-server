package com.platon.browser.dao.mapper;

import com.github.pagehelper.Page;
import com.platon.browser.bean.CustomDelegation;
import com.platon.browser.bean.DelegationAddress;
import com.platon.browser.bean.DelegationStaking;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomDelegationMapper {

    List<CustomDelegation> selectByNodeId ( @Param("nodeId") String nodeId );
    List<CustomDelegation> selectByNodeIdList ( @Param("nodeIds") List <String> nodeIds );
    Page<DelegationStaking> selectStakingByNodeId ( @Param("nodeId") String nodeId);
    Page<DelegationAddress> selectAddressByAddr ( @Param("delegateAddr") String delegateAddr );

}
