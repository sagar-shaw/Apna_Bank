package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Requests
{
	@Id
    int requestId;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CUSTOMERID")
	AccountHolder accountHolder;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="ACCOUNTNO")
	AccountDetails accountDetails;
	
    String status;
    
    
    
	public Requests() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}



	public AccountHolder getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(AccountHolder accountHolder) {
		this.accountHolder = accountHolder;
	}



	public AccountDetails getAccountDetails() {
		return accountDetails;
	}
	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}



	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
