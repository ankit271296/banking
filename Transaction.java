package com.learnclearly.banking;

public class Transaction {
	private int trannumber;
	private int actNumber;
	private int TranAmount;
	private String TransType;
	private int balanceAfterThisTransaction;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(int trannumber, int actNumber, int tranAmount, String transType,
			int balanceAfterThisTransaction) {
		super();
		this.trannumber = trannumber;
		this.actNumber = actNumber;
		TranAmount = tranAmount;
		TransType = transType;
		this.balanceAfterThisTransaction = balanceAfterThisTransaction;
	}
	public int getTrannumber() {
		return trannumber;
	}
	public void setTrannumber(int trannumber) {
		this.trannumber = trannumber;
	}
	public int getActNumber() {
		return actNumber;
	}
	public void setActNumber(int actNumber) {
		this.actNumber = actNumber;
	}
	public int getTranAmount() {
		return TranAmount;
	}
	public void setTranAmount(int tranAmount) {
		TranAmount = tranAmount;
	}
	public String getTransType() {
		return TransType;
	}
	public void setTransType(String transType) {
		TransType = transType;
	}
	public int getBalanceAfterThisTransaction() {
		return balanceAfterThisTransaction;
	}
	public void setBalanceAfterThisTransaction(int balanceAfterThisTransaction) {
		this.balanceAfterThisTransaction = balanceAfterThisTransaction;
	}
	
	
	
	

}
