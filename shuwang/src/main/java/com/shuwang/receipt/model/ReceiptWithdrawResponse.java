package com.shuwang.receipt.model;

import javax.validation.constraints.NotNull;

public class ReceiptWithdrawResponse {
	@NotNull
	private Long orderid;        // 订单号参数
	@NotNull
	private String result;       // 返回信息
	private Integer merchid;     // 商户编码
	private Integer withdrawWay; // 提现账户（1=支付宝，2=微信)
	private Integer amount;      // 提现金额（分）

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
