package com.shuwang.receipt.model;

public class ReceiptWithdrawRequest {
	private Integer merchid;
	private Integer withdrawalsWay;
	private Integer amount;

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getMerchid() {
		return merchid;
	}

	public void setMerchid(Integer merchid) {
		this.merchid = merchid;
	}

	public Integer getWithdrawalsWay() {
		return withdrawalsWay;
	}

	public void setWithdrawalsWay(Integer withdrawalsWay) {
		this.withdrawalsWay = withdrawalsWay;
	}
}
