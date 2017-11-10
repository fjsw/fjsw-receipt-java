package com.shuwang.receipt.model;

import java.util.List;

import javax.validation.constraints.NotNull;

public class ReceiptAccountQueryResponse {
	@NotNull
	private Integer totalAmount;        // 账户总金额（分）
	@NotNull
	private Integer totalallowWithdraw; // 可提现金额（分）
	@NotNull
	private Float settleD0Discount;     // 商户提现费率（%）
	@NotNull
	private Float settleD0Fee;          // 商户提现清算费用
	@NotNull
	private List<ReceiptAccountSummaryItem> list; // 统计对象集合
	
	class ReceiptAccountSummaryItem {
		private Integer tradeNO;
		private String tradetype;
		private Integer amount;
		private Integer allowWithdraw;
		private Float drawAmount;
		private Float tradeFee;
		public Integer getTradeNO() {
			return tradeNO;
		}
		public void setTradeNO(Integer tradeNO) {
			this.tradeNO = tradeNO;
		}
		public String getTradetype() {
			return tradetype;
		}
		public void setTradetype(String tradetype) {
			this.tradetype = tradetype;
		}
		public Integer getAmount() {
			return amount;
		}
		public void setAmount(Integer amount) {
			this.amount = amount;
		}
		public Integer getAllowWithdraw() {
			return allowWithdraw;
		}
		public void setAllowWithdraw(Integer allowWithdraw) {
			this.allowWithdraw = allowWithdraw;
		}
		public Float getDrawAmount() {
			return drawAmount;
		}
		public void setDrawAmount(Float drawAmount) {
			this.drawAmount = drawAmount;
		}
		public Float getTradeFee() {
			return tradeFee;
		}
		public void setTradeFee(Float tradeFee) {
			this.tradeFee = tradeFee;
		}
	}

	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Integer getTotalallowWithdraw() {
		return totalallowWithdraw;
	}

	public void setTotalallowWithdraw(Integer totalallowWithdraw) {
		this.totalallowWithdraw = totalallowWithdraw;
	}

	public Float getSettleD0Discount() {
		return settleD0Discount;
	}

	public void setSettleD0Discount(Float settleD0Discount) {
		this.settleD0Discount = settleD0Discount;
	}

	public Float getSettleD0Fee() {
		return settleD0Fee;
	}

	public void setSettleD0Fee(Float settleD0Fee) {
		this.settleD0Fee = settleD0Fee;
	}

	public List<ReceiptAccountSummaryItem> getList() {
		return list;
	}

	public void setList(List<ReceiptAccountSummaryItem> list) {
		this.list = list;
	}

}
