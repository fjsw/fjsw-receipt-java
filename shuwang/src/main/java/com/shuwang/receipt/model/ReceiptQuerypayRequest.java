package com.shuwang.receipt.model;

import javax.validation.constraints.NotNull;

public class ReceiptQuerypayRequest {
	@NotNull
	private Integer merchid;
	@NotNull
	private String orderid;

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

}
