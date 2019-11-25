package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Documents")
public class Documents
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doc_seq")
	@SequenceGenerator(sequenceName = "doc_no_seq", name = "doc_seq", allocationSize = 1)
	long documentId;
	
	/*@OneToOne
	@JoinColumn(name="accountNo")
	AccountDetails accountDetails;*/
	
	long accountNo;
	
	String adhaarCardNo;//file name
	String panCardNo;//file name
	String photo;//file name;
	
	public Documents() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Documents(long documentId, long accountNo, String adhaarCardNo, String panCardNo, String photo) {
		super();
		this.documentId = documentId;
		this.accountNo = accountNo;
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

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
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
		return "Documents [documentId=" + documentId + ", accountNo=" + accountNo + ", adhaarCardNo=" + adhaarCardNo
				+ ", panCardNo=" + panCardNo + ", photo=" + photo + "]";
	}
	
	

}
