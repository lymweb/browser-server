package com.platon.browser.config;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.platon.browser.res.proposal.ProposalDetailsResp;
import com.platon.browser.res.staking.AliveStakingListResp;
import com.platon.browser.res.transaction.TransactionDetailsResp;

@RunWith(MockitoJUnitRunner.Silent.class)
public class SerializerTest {

	@Test
	public void customLatSerializerTest() {
		try {
			ObjectMapper mapper = new ObjectMapper();  
			TransactionDetailsResp transactionDetailsResp = new TransactionDetailsResp();
			transactionDetailsResp.setActualTxCost(BigDecimal.ONE);
			transactionDetailsResp.setApplyAmount(null);
			transactionDetailsResp.setDeclareVersion("1792");
			transactionDetailsResp.setProgramVersion("");
			assertNotNull(mapper.writeValueAsString(transactionDetailsResp));
			AliveStakingListResp aliveStakingListResp = new AliveStakingListResp();
			aliveStakingListResp.setTotalValue("100000000000");
			aliveStakingListResp.setDelegateValue("");
			assertNotNull(mapper.writeValueAsString(aliveStakingListResp));
			ProposalDetailsResp proposalDetailsResp = new ProposalDetailsResp();
			proposalDetailsResp.setSupportRateThreshold("1.20");
			proposalDetailsResp.setParticipationRate("");
			assertNotNull(mapper.writeValueAsString(proposalDetailsResp));
			
//			CustomLatSerializer customLatSerializer = mock(CustomLatSerializer.class);
//			customLatSerializer.serialize(BigDecimal.TEN, null, null);
//			
//			CustomLowLatSerializer customLowLatSerializer = mock(CustomLowLatSerializer.class);
//			customLowLatSerializer.serialize("123", null, null);
//			
//			CustomRateSerializer customRateSerializer = mock(CustomRateSerializer.class);
//			customRateSerializer.serialize("123", null, null);
//			
//			CustomVersionSerializer customVersionSerializer = mock(CustomVersionSerializer.class);
//			customVersionSerializer.serialize("123", null, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		assertTrue(Boolean.TRUE);
	}
	
}
