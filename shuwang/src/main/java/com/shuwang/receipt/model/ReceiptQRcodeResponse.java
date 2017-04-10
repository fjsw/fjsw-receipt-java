package com.shuwang.receipt.model;

public class ReceiptQrcodeResponse {
	private String orderid;
	private String qrcode;

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getQrcode() {
		return qrcode;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}
}
