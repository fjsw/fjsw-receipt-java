package com.shuwang.receipt.demo;

import com.shuwang.receipt.demo.custom.ReceiptCall;
import com.shuwang.receipt.demo.model.CallMajor;

public class Application {
	public static void main(String[] args) {
    	System.out.println( "欢迎使用福建数网聚合收款SDK" );
    	String gatewayurl = "http://api.test.shuwang.info/receipt/rest";
    	String appid = "12345";
    	String appsecret = "";
    	String method = "receipt.scan.jsapi";
    	String body = "{}";
        ReceiptCall receiptCall = new ReceiptCall();
        String response = receiptCall.receiptMajor(new CallMajor(appid,appsecret,method,gatewayurl,body));
        System.out.println( "response=" + response );
	}
}
