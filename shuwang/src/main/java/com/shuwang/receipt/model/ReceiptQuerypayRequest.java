package com.shuwang.receipt.model;

import javax.validation.constraints.NotNull;

public class ReceiptQuerypayRequest {
	@NotNull
	private Integer merchid;   // 商户编码
	private String orderid;    // 订单编号
	private String outTradeNo; // 商户订单编号

	public Integer getMerchid() {
		return merchid;
	}

	public void setMerchid(Integer merchid) {
		this.merchid = merchid;
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

}
