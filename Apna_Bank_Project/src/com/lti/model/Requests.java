package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Requests
{
	@Id
    int requestId;
    long customerId;
    long accountId;
    String status;
	public Requests() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Requests(int requestId, long customerId, long accountId, String status) {
		super();
		this.requestId = requestId;
		this.customerId = customerId;
		this.accountId = accountId;
		this.status = status;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Requests [requestId=" + requestId + ", customerId=" + customerId + ", accountId=" + accountId
				+ ", status=" + status + "]";
	}

}
