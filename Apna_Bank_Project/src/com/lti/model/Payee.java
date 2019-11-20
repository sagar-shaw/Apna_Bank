package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payee 
{
	@Id
    long payeeAccountNo;
    String ifscCode;
    float limit;
    String payeeName;
    long AccountNo;
	public Payee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payee(long payeeAccountNo, String ifscCode, float limit, String payeeName, long accountNo) {
		super();
		this.payeeAccountNo = payeeAccountNo;
		this.ifscCode = ifscCode;
		this.limit = limit;
		this.payeeName = payeeName;
		AccountNo = accountNo;
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
	public long getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(long accountNo) {
		AccountNo = accountNo;
	}
	@Override
	public String toString() {
		return "Payee [payeeAccountNo=" + payeeAccountNo + ", ifscCode=" + ifscCode + ", limit=" + limit
				+ ", payeeName=" + payeeName + ", AccountNo=" + AccountNo + "]";
	}
	

}
