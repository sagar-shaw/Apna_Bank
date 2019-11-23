package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CardDetails 
{
	@Id
	long cardNo;//pk
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "ACCOUNTNO")
	AccountDetails accountDetails;
	
	
    String cardType;
    int cvv;
    String issueDate;
    String expiryDate;
    String NameOnCard;
	public CardDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
