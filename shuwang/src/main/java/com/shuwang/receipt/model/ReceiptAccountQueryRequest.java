package com.shuwang.receipt.model;

import javax.validation.constraints.NotNull;

public class ReceiptAccountQueryRequest {
	@NotNull
	private Integer merchid; // 商户编码
	private Integer shopid;  // 商户分店编码
	@NotNull
	private String tradetype = "0"; // 账户类型 0=组合 1=支付宝  2=微信

	public Integer getMerchid() {
		return merchid;
	}

	public void setMerchid(Integer merchid) {
		this.merchid = merchid;
	}

	public Integer getShopid() {
		return shopid;
	}

	public void setShopid(Integer shopid) {
		this.shopid = shopid;
	}

	public String getTradetype() {
		return tradetype;
	}

	public void setTradetype(String tradetype) {
		this.tradetype = tradetype;
	}
}
