package com.shuwang.receipt.model;

public class ReceiptQuerypayResponse {

	private Integer amount;
	private String buyerAccount;
	private String oriRespMsg;
	private Integer isClearOrCancel;
	private String buyerId; // 购买者id
	private String oriRespCode;
	private String status;
	
	public boolean isSuccess() {
		return status==null ? false : status.equals("B");
	}
	public boolean isPaying() {
		return status==null ? false : status.equals("R");
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getBuyerAccount() {
		return buyerAccount;
	}

	public void setBuyerAccount(String buyerAccount) {
		this.buyerAccount = buyerAccount;
	}

	public String getOriRespMsg() {
		return oriRespMsg;
	}

	public void setOriRespMsg(String oriRespMsg) {
		this.oriRespMsg = oriRespMsg;
	}

	public Integer getIsClearOrCancel() {
		return isClearOrCancel;
	}

	public void setIsClearOrCancel(Integer isClearOrCancel) {
		this.isClearOrCancel = isClearOrCancel;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getOriRespCode() {
		return oriRespCode;
	}

	public void setOriRespCode(String oriRespCode) {
		this.oriRespCode = oriRespCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
