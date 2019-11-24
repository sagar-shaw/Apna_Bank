package com.lti.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CARD_DETAILS")
public class CardDetails 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "c_no_seq")
	@SequenceGenerator(sequenceName = "CARD_NO_SEQ", name = "c_no_seq", allocationSize = 10)
	long cardNo;//pk
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "ACCOUNTNO")
	AccountDetails accountDetails;
	
	
    String cardType;
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cvv_seq")
	@SequenceGenerator(sequenceName = "CVV_NO_SEQ", name = "cvv_seq", allocationSize = 1)
    int cvv;
    
    Date issueDate;
    Date expiryDate;
    String NameOnCard;
	public CardDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getCardNo() {
		return cardNo;
	}
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	public AccountDetails getAccountDetails() {
		return accountDetails;
	}
	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
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
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
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
		return "CardDetails [cardNo=" + cardNo + ", accountDetails=" + accountDetails + ", cardType=" + cardType
				+ ", cvv=" + cvv + ", issueDate=" + issueDate + ", expiryDate=" + expiryDate + ", NameOnCard="
				+ NameOnCard + "]";
	}

	

}
