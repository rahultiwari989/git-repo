package com.lti.model;

import java.time.LocalDate;

public class Transaction {
	int transactionId;
	LocalDate transaction;
	double amount;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public LocalDate getTransaction() {
		return transaction;
	}
	public void setTransaction(LocalDate transaction) {
		this.transaction = transaction;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

}
