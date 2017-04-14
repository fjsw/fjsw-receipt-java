package com.shuwang.receipt.demo;

import java.util.Map;

import com.google.gson.Gson;
import com.shuwang.receipt.demo.custom.ReceiptCall;
import com.shuwang.receipt.demo.model.CallMajor;
import com.shuwang.receipt.service.GatewayProtocolService;
import com.shuwang.receipt.util.GsonUtils;

public class Application {
	public static void main(String[] args) {
    	System.out.println( "欢迎使用福建数网聚合收款SDK" );
    	String gatewayurl = "http://api.test.shuwang.info/receipt/rest";
    	String appid = "12345";
    	String appsecret = "12345";
    	//
    	doJsapiPay(gatewayurl, appid, appsecret);
    	//
    	onJsapiPayCallback("{\"sign\":\"0\"}", appsecret);
	}
	
	static void doJsapiPay(String gatewayurl, String appid, String appsecret) {
    	String method = "receipt.scan.jsapi";
    	String body = "{}";
        ReceiptCall receiptCall = new ReceiptCall();
        String response = receiptCall.receiptMajor(new CallMajor(appid,appsecret,method,gatewayurl,body));
        System.out.println( "response=" + response );
	}
	
	static void onJsapiPayCallback(String body, String appsecret) {
		Gson gson = GsonUtils.getGson();
		@SuppressWarnings("unchecked")
		Map<String,Object> response = gson.fromJson(body, Map.class);
		if (!GatewayProtocolService.checkSignEqual(response, appsecret)) {
			System.out.println( "sign not equal");
		} else {
			System.out.println( "sign OK!");
		}
	}
}
