package com.shuwang.receipt.model;

import javax.validation.constraints.NotNull;

public class ReceiptQrcodeResponse {
	@NotNull
	private String orderid;
	private String outTradeNo;
	@NotNull
	private String qrcode;

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

	public String getQrcode() {
		return qrcode;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}
}
