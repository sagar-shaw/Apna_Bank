package com.lti.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Transaction
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "t_seq")
	@SequenceGenerator(sequenceName = "TRANS_SEQ", name = "t_seq", allocationSize = 1)
    int transactionId;//pk
	
	@ManyToOne
	@JoinColumn(name = "ACCOUNTNO")
	AccountDetails accountDetails;
	
    long recipentAccountNo;
    Timestamp transactionTime;
    float amount;
    String status;
    
    
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}


	public AccountDetails getAccountDetails() {
		return accountDetails;
	}


	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}


	public long getRecipentAccountNo() {
		return recipentAccountNo;
	}


	public void setRecipentAccountNo(long recipentAccountNo) {
		this.recipentAccountNo = recipentAccountNo;
	}

	public Timestamp getTransactionTime() {
		return transactionTime;
	}


	public void setTransactionTime(Timestamp transactionTime) {
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
		return "Transaction [transactionId=" + transactionId + ", accountDetails=" + accountDetails
				+ ", recipentAccountNo=" + recipentAccountNo + ", transactionTime=" + transactionTime + ", amount="
				+ amount + ", status=" + status + "]";
	}

    

}
