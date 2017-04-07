package com.shuwang.receipt.demo.custom;

import com.google.gson.Gson;
import com.shuwang.receipt.demo.model.CallMajor;
import com.shuwang.receipt.model.*;
import com.shuwang.receipt.service.ReceiptPayService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by w景洋
 * Time 2017/3/13.
 */
public class ReceiptCall {
    protected final Logger log = LoggerFactory.getLogger(getClass());
    private Gson gson = new Gson();
    private ReceiptPayService receiptPayService = new ReceiptPayService();

    public String receiptMajor(CallMajor call){
        log.debug("POST DATA:{}",call.getBody());
        String result = "";
        //
        if (!receiptPayService.isInitialized()) {
            receiptPayService.initial(call.getAppid(), call.getAppsecret(),call.getGatewayUrl());
        }
        String method = call.getMethod();
        if (method.equals("receipt.scan.authcode")) {
            ReceiptAuthcodeRequest request = gson.fromJson(call.getBody(),ReceiptAuthcodeRequest.class);
            ReceiptAuthcodeResponse response = receiptPayService.authcodePay(request);
            result = gson.toJson(response);
        } else if (method.equals("receipt.scan.payresult")) {
            ReceiptQuerypayRequest request = gson.fromJson(call.getBody(),ReceiptQuerypayRequest.class);
            ReceiptQuerypayResponse response = receiptPayService.queryPayResult(request);
            result = gson.toJson(response);
        } else if (method.equals("receipt.account.query")) {
            ReceiptAccountQueryRequest request = gson.fromJson(call.getBody(),ReceiptAccountQueryRequest.class);
            ReceiptAccountQueryResponse response = receiptPayService.queryAccount(request);
            result = gson.toJson(response);
        } else if (method.equals("receipt.account.withdraw")) {
            ReceiptWithdrawRequest request = gson.fromJson(call.getBody(),ReceiptWithdrawRequest.class);
            ReceiptWithdrawResponse response = receiptPayService.withdrawAccount(request);
            result = gson.toJson(response);
        } else if(method.equals("receipt.scan.jsapi")){
            ReceiptJsapipayRequest request = gson.fromJson(call.getBody(),ReceiptJsapipayRequest.class);
            ReceiptJsapipayResponse response = receiptPayService.scanJsapiPay(request);
            result = gson.toJson(response);
        } else {
            log.warn("no method matches({})", method);
        }
        //
        return result;
    }
}
