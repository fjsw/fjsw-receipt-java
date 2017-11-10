package com.shuwang.receipt.model;

import javax.validation.constraints.NotNull;

public class ReceiptQrcodeResponse {
	@NotNull
	private String orderid;    // 订单号参数
	private String outTradeNo; // 商户订单编号
	@NotNull
	private String qrcode;     // 收款二维码内容地址，需要前端生成二维码

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
