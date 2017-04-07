package com.shuwang.receipt.service;

import com.google.gson.Gson;
import com.shuwang.receipt.model.*;
import com.shuwang.receipt.util.ObjectDynamicCreator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class ReceiptPayService {
	protected final Logger log = LoggerFactory.getLogger(getClass());
	private Gson gson = new Gson();

	private String appid = null;
	private String appsecret = null;
	private String gatewayUrl = null;

	private GatewayProtocolService gatewayService;


	public boolean isInitialized() {
		return appid != null;
	}

	public void initial(String appid, String appsecret,String gatewayUrl) {
		this.appid = appid;
		this.appsecret = appsecret;
		this.gatewayUrl = gatewayUrl;
		gatewayService = new GatewayProtocolService();
	}

	public ReceiptAuthcodeResponse authcodePay(ReceiptAuthcodeRequest request) {
		Map<String, Object> params = ObjectDynamicCreator.getFieldVlaue(request);
		params.put("method", "receipt.scan.authcode");
		String result = gatewayService.callMethod(params,appid,appsecret,gatewayUrl);
		log.debug("authcodePay() result={}", result);
		ReceiptAuthcodeResponseWrap response = gson.fromJson(result, ReceiptAuthcodeResponseWrap.class);
		if (response.getCode() == 200) {
			return response.getResponse();
		}
		return null;
	}

	public ReceiptQuerypayResponse queryPayResult(ReceiptQuerypayRequest request) {
		Map<String, Object> params = ObjectDynamicCreator.getFieldVlaue(request);
		params.put("method", "receipt.scan.payresult");
		String result = gatewayService.callMethod(params,appid,appsecret,gatewayUrl);
		log.debug("queryPayResult() result={}", result);
		ReceiptQuerypayResponseWrap response = gson.fromJson(result, ReceiptQuerypayResponseWrap.class);
		if (response.getCode() == 200) {
			return response.getResponse();
		}
		return null;
	}

	public ReceiptAccountQueryResponse queryAccount(ReceiptAccountQueryRequest request) {
		Map<String, Object> params = ObjectDynamicCreator.getFieldVlaue(request);
		params.put("method", "receipt.account.query");
		String result = gatewayService.callMethod(params,appid,appsecret,gatewayUrl);
		log.debug("queryAccount() result={}", result);
		ReceiptAccountQueryResponseWrap response = gson.fromJson(result, ReceiptAccountQueryResponseWrap.class);
		if (response.getCode() == 200) {
			return response.getResponse();
		}
		return null;
	}

	public ReceiptWithdrawResponse withdrawAccount(ReceiptWithdrawRequest request) {
		Map<String, Object> params = ObjectDynamicCreator.getFieldVlaue(request);
		params.put("method", "receipt.account.withdraw");
		String result = gatewayService.callMethod(params,appid,appsecret,gatewayUrl);
		log.debug("withdrawAccount() result={}", result);
		ReceiptWithdrawResponseWrap response = gson.fromJson(result, ReceiptWithdrawResponseWrap.class);
		if (response.getCode() == 200) {
			return response.getResponse();
		}
		return null;
	}

	public ReceiptJsapipayResponse scanJsapiPay(ReceiptJsapipayRequest request){
		Map<String, Object> params = ObjectDynamicCreator.getFieldVlaue(request);
		params.put("method", "receipt.scan.jsapi");
		String result = gatewayService.callMethod(params,appid,appsecret,gatewayUrl);
		log.debug("scanJsapiPay() result={}", result);
		ReceiptJsapipayResponseWrap response = gson.fromJson(result, ReceiptJsapipayResponseWrap.class);
		if (response.getCode() == 200) {
			return response.getResponse();
		}
		return null;
	}
}
