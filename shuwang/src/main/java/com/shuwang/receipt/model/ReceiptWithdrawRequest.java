package com.shuwang.receipt.model;

import javax.validation.constraints.NotNull;

public class ReceiptWithdrawRequest {
	@NotNull
	private Integer merchid;     // 商户编码
	private Integer shopid;      // 商户分店编码
	private Long userid;         // 收银员(用户编码)
	@NotNull
	private Integer withdrawWay; // 提现账户（1=支付宝，2=微信)
	@NotNull
	private Integer amount;      // 提现金额（分）

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

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Integer getWithdrawWay() {
		return withdrawWay;
	}

	public void setWithdrawWay(Integer withdrawWay) {
		this.withdrawWay = withdrawWay;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

}
