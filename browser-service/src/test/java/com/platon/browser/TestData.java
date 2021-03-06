package com.platon.browser;

import com.alibaba.fastjson.JSON;
import com.platon.browser.bean.CustomDelegation;
import com.platon.browser.bean.CustomStaking;
import com.platon.browser.config.BlockChainConfig;
import com.platon.browser.dao.entity.*;
import com.platon.browser.elasticsearch.dto.Block;
import com.platon.browser.elasticsearch.dto.ESTokenTransferRecord;
import com.platon.browser.elasticsearch.dto.Transaction;
import com.platon.browser.v015.bean.AdjustParam;
import org.apache.commons.io.FileUtils;
import org.junit.Before;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestData {
    public static final String testDataDir = TestData.class.getClassLoader().getResource("./").getPath()+"../../../../../testdata/";
    private static String suffix=".json",encode="UTF8";
    private static String[] dataFile = {
            "transaction",
            "blockChainConfig",
            "networkstat",
            "address",
            "staking",
            "delegation",
            "node",
            "block",
            "erc20Token",
            "erc20TokenDetail",
            "erc20TokenAddressRel",
            "erc20TokenTransfer",
            "adjust-data"
    };
    protected List<Transaction> transactionList = Collections.emptyList();
    protected BlockChainConfig blockChainConfig = new BlockChainConfig();
    protected List<NetworkStat> networkStatList = new ArrayList<>();
    protected List<Address> addressList = Collections.emptyList();
    protected List<CustomStaking> stakingList= Collections.emptyList();
    protected List<CustomDelegation> delegationList= Collections.emptyList();
    protected List<Node> nodeList = new ArrayList<>();
    protected List<Block> blockList = Collections.emptyList();
    protected List<Erc20Token> erc20Tokens = Collections.emptyList();
    protected List<Erc20TokenDetailWithBLOBs> erc20TokenDetails = Collections.emptyList();
    protected List<ESTokenTransferRecord> esTokenTransferRecords = Collections.emptyList();
    protected List<Erc20TokenAddressRel> erc20TokenAddressRels = Collections.emptyList();
    protected List<AdjustParam> adjustParamList = new ArrayList<>();

    @Before
    public void init() {
        Arrays.asList(dataFile).forEach(fileName -> {
            try {
                File data = new File(testDataDir + fileName + suffix);
                String content = FileUtils.readFileToString(data, encode);
                switch (fileName) {
                    case "transaction":
                        this.transactionList = JSON.parseArray(content, Transaction.class);
                        break;
                    case "blockChainConfig":
                        this.blockChainConfig = JSON.parseObject(content, BlockChainConfig.class);
                        break;
                    case "networkstat":
                        this.networkStatList = JSON.parseArray(content, NetworkStat.class);
                        break;
                    case "address":
                        this.addressList = JSON.parseArray(content, Address.class);
                        break;
                    case "staking":
                        stakingList = JSON.parseArray(content, CustomStaking.class);
                        break;
                    case "delegation":
                        delegationList = JSON.parseArray(content, CustomDelegation.class);
                        break;
                    case "node":
                        this.nodeList = JSON.parseArray(content, Node.class);
                        break;
                    case "block":
                        this.blockList = JSON.parseArray(content, Block.class);
                        break;
                    case "erc20Token":
                        this.erc20Tokens = JSON.parseArray(content, Erc20Token.class);
                        break;
                    case "erc20TokenDetail":
                        this.erc20TokenDetails = JSON.parseArray(content, Erc20TokenDetailWithBLOBs.class);
                        break;
                    case "erc20TokenAddressRel":
                        this.erc20TokenAddressRels = JSON.parseArray(content, Erc20TokenAddressRel.class);
                        break;
                    case "erc20TokenTransfer":
                        this.esTokenTransferRecords = JSON.parseArray(content, ESTokenTransferRecord.class);
                        break;
                    case "adjust-data":
                        adjustParamList = JSON.parseArray(content, AdjustParam.class);
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
    
    public enum TestDataFileNameEnum {
        NODE("nodes-"),
        BLOCK("blocks-"),
        TRANSACTION("transactions-"),
        PENDINGTX("pendingTxes-");
        public String prefix;
        TestDataFileNameEnum(String prefix){
            this.prefix=prefix;
        }
    }
}
