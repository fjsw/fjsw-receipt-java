package com.shuwang.receipt.model;

public class ReceiptRefundResponse {
	private String outRefundNo;
	private String orderRefundid;
	private Integer amount;
	private String resultMsg;
	private String status;

	public String getOutRefundNo() {
		return outRefundNo;
	}

	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}

	public String getOrderRefundid() {
		return orderRefundid;
	}

	public void setOrderRefundid(String orderRefundid) {
		this.orderRefundid = orderRefundid;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
