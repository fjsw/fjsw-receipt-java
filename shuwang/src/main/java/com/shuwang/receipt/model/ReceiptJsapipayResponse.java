package com.shuwang.receipt.model;

import javax.validation.constraints.NotNull;

/**
 * Created by w景洋
 * Time 2017/3/17.
 */
public class ReceiptJsapipayResponse {
	@NotNull
    private String orderid;     // 订单编号
    private String outTradeNo;  // 商户订单编号
	@NotNull
    private String merchid;     // 商户编码
	@NotNull
    private String merchname;   // 商户简称
	@NotNull
    private Integer amount;     // 支付金额（分）
    private String oriRespCode;
    private String oriRespMsg;
    private String status;
    private String wxjsapiStr;  // 微信调起JSAPI支付的参数
    private String channelNo;   // 支付宝调起JSAPI支付的渠道号
    private String jumpurl;     // 跳转支付地址
	@NotNull
    private String result;      // 支付结果信息
	
	public boolean isSuccess() {
		if (status == null) {
			return false;
		}
		if (wxjsapiStr != null && !wxjsapiStr.isEmpty()) {
			return true;
		}
		if (channelNo != null && !channelNo.isEmpty()) {
			return true;
		}
		if (jumpurl != null && !jumpurl.isEmpty()) {
			return true;
		}
		return false;
	}

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

    public String getMerchid() {
        return merchid;
    }

    public void setMerchid(String merchid) {
        this.merchid = merchid;
    }

    public String getMerchname() {
        return merchname;
    }

    public void setMerchname(String merchname) {
        this.merchname = merchname;
    }

	public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getOriRespCode() {
        return oriRespCode;
    }

    public void setOriRespCode(String oriRespCode) {
        this.oriRespCode = oriRespCode;
    }

    public String getOriRespMsg() {
        return oriRespMsg;
    }

    public void setOriRespMsg(String oriRespMsg) {
        this.oriRespMsg = oriRespMsg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWxjsapiStr() {
        return wxjsapiStr;
    }

    public void setWxjsapiStr(String wxjsapiStr) {
        this.wxjsapiStr = wxjsapiStr;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

    public String getJumpurl() {
        return jumpurl;
    }

    public void setJumpurl(String jumpurl) {
        this.jumpurl = jumpurl;
    }

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
