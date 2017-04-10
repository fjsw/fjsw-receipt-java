package com.shuwang.receipt.model;

import javax.validation.constraints.NotNull;

public class ReceiptAccountQueryRequest {
	@NotNull
	private Integer merchid;
	private String tradetype = "0";

	public Integer getMerchid() {
		return merchid;
	}

	public void setMerchid(Integer merchid) {
		this.merchid = merchid;
	}

	public String getTradetype() {
		return tradetype;
	}

	public void setTradetype(String tradetype) {
		this.tradetype = tradetype;
	}
}
