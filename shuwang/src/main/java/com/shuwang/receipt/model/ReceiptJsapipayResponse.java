package com.shuwang.receipt.model;

import javax.validation.constraints.NotNull;

/**
 * Created by w景洋
 * Time 2017/3/17.
 */
public class ReceiptJsapipayResponse {
	@NotNull
    private String orderid;
    private String outTradeNo;
	@NotNull
    private String merchid;
	@NotNull
    private String merchname;
	@NotNull
    private Integer amount;
    private String oriRespCode;
    private String oriRespMsg;
    private String status;
    private String wxjsapiStr;
    private String channelNo;
    private String jumpurl;
	@NotNull
    private String result;
	
	public boolean isSuccess() {
		if (status == null) {
			return false;
		}
		if (oriRespCode == null) {
			return false;
		}
		int code = Integer.parseInt(oriRespCode);
		return (code<400 || code>599);
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
