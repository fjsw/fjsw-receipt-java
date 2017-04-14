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

	/**
	 * check whether initialized
	 * @return boolean
	 */
	public boolean isInitialized() {
		return appid != null;
	}

	/**
	 * initial service
	 * @param appid 应用编号
	 * @param appsecret 应用秘钥
	 * @param gatewayUrl 接口网关
	 */
	public void initial(String appid, String appsecret,String gatewayUrl) {
		this.appid = appid;
		this.appsecret = appsecret;
		this.gatewayUrl = gatewayUrl;
	}

	/**
	 * authcode payment
	 * @param request 条码支付请求
	 * @return ReceiptAuthcodeResponse
	 */
	public ReceiptAuthcodeResponse scanAuthcodePay(ReceiptAuthcodeRequest request) {
		Map<String, Object> params = ObjectDynamicCreator.getFieldVlaue(request);
		params.put("method", "receipt.scan.authcode");
		String result = GatewayProtocolService.callMethod(params,appid,appsecret,gatewayUrl);
		log.debug("scanAuthcodePay() result={}", result);
		ReceiptAuthcodeResponseWrap response = gson.fromJson(result, ReceiptAuthcodeResponseWrap.class);
		if (response.getCode() == 200) {
			return response.getResponse();
		}
		return null;
	}

	/**
	 * qrcode payment
	 * @param request 二维码支付请求
	 * @return ReceiptQrcodeResponse
	 */
	public ReceiptQrcodeResponse scanQrcodePay(ReceiptQrcodeRequest request){
		Map<String, Object> params = ObjectDynamicCreator.getFieldVlaue(request);
		params.put("method", "receipt.scan.qrcode");
		String result = GatewayProtocolService.callMethod(params,appid,appsecret,gatewayUrl);
		log.debug("scanQrcodePay() result={}", result);
		ReceiptQrcodeResponseWrap response = gson.fromJson(result, ReceiptQrcodeResponseWrap.class);
		if (response.getCode() == 200) {
			return response.getResponse();
		}
		return null;
	}

	/**
	 * jsapi payment
	 * @param request 公众号/服务窗支付请求
	 * @return ReceiptJsapipayResponse
	 */
	public ReceiptJsapipayResponse scanJsapiPay(ReceiptJsapipayRequest request){
		Map<String, Object> params = ObjectDynamicCreator.getFieldVlaue(request);
		params.put("method", "receipt.scan.jsapi");
		String result = GatewayProtocolService.callMethod(params,appid,appsecret,gatewayUrl);
		log.debug("scanJsapiPay() result={}", result);
		ReceiptJsapipayResponseWrap response = gson.fromJson(result, ReceiptJsapipayResponseWrap.class);
		if (response.getCode() == 200) {
			return response.getResponse();
		}
		return null;
	}

	/**
	 * query payment result
	 * @param request 支付结果查询请求
	 * @return ReceiptQuerypayResponse
	 */
	public ReceiptQuerypayResponse queryPayResult(ReceiptQuerypayRequest request) {
		Map<String, Object> params = ObjectDynamicCreator.getFieldVlaue(request);
		params.put("method", "receipt.scan.payresult");
		String result = GatewayProtocolService.callMethod(params,appid,appsecret,gatewayUrl);
		log.debug("queryPayResult() result={}", result);
		ReceiptQuerypayResponseWrap response = gson.fromJson(result, ReceiptQuerypayResponseWrap.class);
		if (response.getCode() == 200) {
			return response.getResponse();
		}
		return null;
	}

	/**
	 * query merchant account
	 * @param request 账户查询请求
	 * @return ReceiptAccountQueryResponse
	 */
	public ReceiptAccountQueryResponse queryAccount(ReceiptAccountQueryRequest request) {
		Map<String, Object> params = ObjectDynamicCreator.getFieldVlaue(request);
		params.put("method", "receipt.account.query");
		String result = GatewayProtocolService.callMethod(params,appid,appsecret,gatewayUrl);
		log.debug("queryAccount() result={}", result);
		ReceiptAccountQueryResponseWrap response = gson.fromJson(result, ReceiptAccountQueryResponseWrap.class);
		if (response.getCode() == 200) {
			return response.getResponse();
		}
		return null;
	}

	/**
	 * merchant withdraw account
	 * @param request 账户提现请求
	 * @return ReceiptWithdrawResponse
	 */
	public ReceiptWithdrawResponse withdrawAccount(ReceiptWithdrawRequest request) {
		Map<String, Object> params = ObjectDynamicCreator.getFieldVlaue(request);
		params.put("method", "receipt.account.withdraw");
		String result = GatewayProtocolService.callMethod(params,appid,appsecret,gatewayUrl);
		log.debug("withdrawAccount() result={}", result);
		ReceiptWithdrawResponseWrap response = gson.fromJson(result, ReceiptWithdrawResponseWrap.class);
		if (response.getCode() == 200) {
			return response.getResponse();
		}
		return null;
	}

}
