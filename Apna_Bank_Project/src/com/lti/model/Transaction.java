package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction
{
	@Id
    int transactionId;//pk
    long accountNo;//fk
    long recipentAccountNo;
    String transactionTime;
    float amount;
    String status;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(int transactionId, long accountNo, long recipentAccountNo, String transactionTime, float amount,
			String status) {
		super();
		this.transactionId = transactionId;
		this.accountNo = accountNo;
		this.recipentAccountNo = recipentAccountNo;
		this.transactionTime = transactionTime;
		this.amount = amount;
		this.status = status;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public long getRecipentAccountNo() {
		return recipentAccountNo;
	}
	public void setRecipentAccountNo(long recipentAccountNo) {
		this.recipentAccountNo = recipentAccountNo;
	}
	public String getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", accountNo=" + accountNo + ", recipentAccountNo="
				+ recipentAccountNo + ", transactionTime=" + transactionTime + ", amount=" + amount + ", status="
				+ status + "]";
	}
    
    

}
