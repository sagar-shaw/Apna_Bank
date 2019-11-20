package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CardDetails 
{
	@Id
	long cardNo;//pk
    long accountNo;//fk
    String cardType;
    int cvv;
    String issueDate;
    String expiryDate;
    String NameOnCard;
	public CardDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CardDetails(long cardNo, long accountNo, String cardType, int cvv, String issueDate, String expiryDate,
			String nameOnCard) {
		super();
		this.cardNo = cardNo;
		this.accountNo = accountNo;
		this.cardType = cardType;
		this.cvv = cvv;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
		NameOnCard = nameOnCard;
	}
	public long getCardNo() {
		return cardNo;
	}
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getNameOnCard() {
		return NameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		NameOnCard = nameOnCard;
	}
	@Override
	public String toString() {
		return "CardDetails [cardNo=" + cardNo + ", accountNo=" + accountNo + ", cardType=" + cardType + ", cvv=" + cvv
				+ ", issueDate=" + issueDate + ", expiryDate=" + expiryDate + ", NameOnCard=" + NameOnCard + "]";
	}
	

}
