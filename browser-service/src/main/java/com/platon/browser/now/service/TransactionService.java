package com.platon.browser.now.service;

import javax.validation.Valid;

import com.platon.browser.dto.RespPage;
import com.platon.browser.dto.account.AccountDownload;
import com.platon.browser.dto.transaction.TransactionDetail;
import com.platon.browser.req.PageReq;
import com.platon.browser.req.newtransaction.TransactionDetailNavigateReq;
import com.platon.browser.req.newtransaction.TransactionDetailsReq;
import com.platon.browser.req.newtransaction.TransactionListByAddressRequest;
import com.platon.browser.req.newtransaction.TransactionListByBlockRequest;
import com.platon.browser.req.transaction.TransactionDetailReq;
import com.platon.browser.res.transaction.TransactionDetailsResp;
import com.platon.browser.res.transaction.TransactionListResp;

public interface TransactionService {
    public TransactionDetail getDetail(TransactionDetailReq req);

    RespPage<TransactionListResp> getTransactionList(@Valid PageReq req);

    RespPage<TransactionListResp> getTransactionListByBlock(TransactionListByBlockRequest req);

    RespPage<TransactionListResp> getTransactionListByAddress(TransactionListByAddressRequest req);

    AccountDownload transactionListByAddressDownload(String address, String date);

	TransactionDetailsResp transactionDetails(@Valid TransactionDetailsReq req);

	TransactionListResp transactionDetailNavigate(@Valid TransactionDetailNavigateReq req);
}
