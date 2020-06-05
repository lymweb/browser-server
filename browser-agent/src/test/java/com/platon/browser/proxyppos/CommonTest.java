package com.platon.browser.proxyppos;

import org.junit.Test;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.Transfer;
import org.web3j.utils.Convert;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CommonTest extends TestBase {
    public static final String PROXY_CONTRACT_ADDRESS = "lax1ufjvfyxxxy6q3j5ayth97pcrn9pn475swqed9h";

    @Test
    public void deploy() throws Exception {
        String contractAddress = deployProxyContract();
    }

    @Test
    public void transfer() throws Exception {

        Credentials delegateCredentials = Credentials.create("5d7f539ac15de26de6abbb664291e613882842d3dbe4ec79b57af8bc6bb834aa");
        proxyContractAddress = delegateCredentials.getAddress(chainId);

        TransactionManager transactionManager = new RawTransactionManager(web3j, defaultCredentials, chainId);
        new Transfer(web3j,transactionManager).sendFunds(proxyContractAddress,new BigDecimal("50000000"), Convert.Unit.LAT,GAS_PRICE,GAS_LIMIT).send();
        System.out.println("balance="+ web3j.platonGetBalance(proxyContractAddress, DefaultBlockParameterName.LATEST).send().getBalance());
    }

    @Test
    public void blockNumber() throws Exception {
        BigInteger blockNumber = web3j.platonBlockNumber().send().getBlockNumber();
        System.out.println("Current Block Number:"+blockNumber);
    }
}
