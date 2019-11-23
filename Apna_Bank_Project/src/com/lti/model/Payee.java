package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Payee 
{
	@Id
    long payeeAccountNo;
    String ifscCode;
    float limit;
    String payeeName;
    
    @ManyToOne
	@JoinColumn(name = "ACCOUNTNO")
	AccountDetails accountDetails;
    
	public Payee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getPayeeAccountNo() {
		return payeeAccountNo;
	}

	public void setPayeeAccountNo(long payeeAccountNo) {
		this.payeeAccountNo = payeeAccountNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public float getLimit() {
		return limit;
	}

	public void setLimit(float limit) {
		this.limit = limit;
	}

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public AccountDetails getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}
	
	

}
