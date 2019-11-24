package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Documents")
public class Documents
{
	@Id
	long documentId;
	
	@OneToOne
	@JoinColumn(name="accountNo")
	AccountDetails accountDetails;
	
	String adhaarCardNo;//file name
	String panCardNo;//file name
	String photo;//file name;
	
	public Documents() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Documents(long documentId, AccountDetails accountDetails, String adhaarCardNo, String panCardNo,
			String photo) {
		super();
		this.documentId = documentId;
		this.accountDetails = accountDetails;
		this.adhaarCardNo = adhaarCardNo;
		this.panCardNo = panCardNo;
		this.photo = photo;
	}
	public long getDocumentId() {
		return documentId;
	}
	public void setDocumentId(long documentId) {
		this.documentId = documentId;
	}
	public AccountDetails getAccountDetails() {
		return accountDetails;
	}
	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}
	public String getAdhaarCardNo() {
		return adhaarCardNo;
	}
	public void setAdhaarCardNo(String adhaarCardNo) {
		this.adhaarCardNo = adhaarCardNo;
	}
	public String getPanCardNo() {
		return panCardNo;
	}
	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "Documents [documentId=" + documentId + ", accountDetails=" + accountDetails + ", adhaarCardNo="
				+ adhaarCardNo + ", panCardNo=" + panCardNo + ", photo=" + photo + "]";
	}
	
	

}
