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
		ReceiptAuthcodeResponseWrap wrap = gson.fromJson(result, ReceiptAuthcodeResponseWrap.class);
		if (wrap!=null && wrap.getCode() == 200) {
			return wrap.getResponse();
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
		ReceiptQrcodeResponseWrap wrap = gson.fromJson(result, ReceiptQrcodeResponseWrap.class);
		if (wrap!=null && wrap.getCode() == 200) {
			return wrap.getResponse();
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
		ReceiptJsapipayResponseWrap wrap = gson.fromJson(result, ReceiptJsapipayResponseWrap.class);
		if (wrap!=null && wrap.getCode() == 200) {
			return wrap.getResponse();
		}
		// 处理失败情况, 将错误信息装入返回对象
		ReceiptErrorResponseWrap errorinfo = gson.fromJson(result, ReceiptErrorResponseWrap.class);
		ReceiptJsapipayResponse response = new ReceiptJsapipayResponse();
		response.setOriRespCode(errorinfo.getResponse().getCode().toString());
		response.setOriRespMsg(errorinfo.getResponse().getReason());
		response.setResult(errorinfo.getResponse().getReason());
		return response;
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
		ReceiptQuerypayResponseWrap wrap = gson.fromJson(result, ReceiptQuerypayResponseWrap.class);
		if (wrap!=null && wrap.getCode() == 200) {
			return wrap.getResponse();
		}
		return null;
	}

	/**
	 * 申请退款
	 * @param request 申请退款请求
	 * @return ReceiptRefundResponse
	 */
	public ReceiptRefundResponse refundPayOrder(ReceiptRefundRequest request) {
		Map<String, Object> params = ObjectDynamicCreator.getFieldVlaue(request);
		params.put("method", "receipt.scan.refund");
		String result = GatewayProtocolService.callMethod(params,appid,appsecret,gatewayUrl);
		log.debug("refundPayOrder() result={}", result);
		ReceiptRefundResponseWrap wrap = gson.fromJson(result, ReceiptRefundResponseWrap.class);
		if (wrap!=null && wrap.getCode() == 200) {
			return wrap.getResponse();
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
		ReceiptAccountQueryResponseWrap wrap = gson.fromJson(result, ReceiptAccountQueryResponseWrap.class);
		if (wrap!=null && wrap.getCode() == 200) {
			return wrap.getResponse();
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
		ReceiptWithdrawResponseWrap wrap = gson.fromJson(result, ReceiptWithdrawResponseWrap.class);
		if (wrap!=null && wrap.getCode() == 200) {
			return wrap.getResponse();
		}
		return null;
	}

}
