package com.shuwang.receipt.model;

public class ReceiptWithdrawResponse {
	private Long orderid;
	private String result;
	private Integer merchid;
	private Integer withdrawWay;
	private Integer amount;

	public Long getOrderid() {
		return orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

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
