package com.shuwang.receipt.model;

public class ReceiptAccountQueryResponse {
	private Integer totalAmount;
	private Integer allowWithdraw;

	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Integer getAllowWithdraw() {
		return allowWithdraw;
	}

	public void setAllowWithdraw(Integer allowWithdraw) {
		this.allowWithdraw = allowWithdraw;
	}
}
