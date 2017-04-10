package com.shuwang.receipt.model;

public class ReceiptQrcodeResponseWrap {
	private Integer code = 400;
	private ReceiptQrcodeResponse response;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public ReceiptQrcodeResponse getResponse() {
		return response;
	}

	public void setResponse(ReceiptQrcodeResponse response) {
		this.response = response;
	}
}
