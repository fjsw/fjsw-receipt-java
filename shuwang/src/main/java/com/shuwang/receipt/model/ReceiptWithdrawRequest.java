package com.shuwang.receipt.model;

import javax.validation.constraints.NotNull;

public class ReceiptWithdrawRequest {
	@NotNull
	private Integer merchid;
	@NotNull
	private Integer withdrawWay;
	@NotNull
	private Integer amount;

	public Integer getMerchid() {
		return merchid;
	}

	public void setMerchid(Integer merchid) {
		this.merchid = merchid;
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
