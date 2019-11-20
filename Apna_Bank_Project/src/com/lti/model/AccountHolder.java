package com.lti.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Account_Holder")
public class AccountHolder
{
	@Id	
	int cutomerId;//pk
	String title;
	String fistName;
	String middleName;
	String lastName;
	String dateOfBirth;//dateOfBirth
	String gender;
	String emailId;
	long mobileNo;
	long adhaarCardNo;
	String panCardNo;
	int residentialAddressId;
	int permanentAddressId;
	String occupation;//fk
	String nationality;//fk
	long accountNo;//fk
	int documentId;
	@OneToMany(mappedBy="accountHolder")	
	List<AccountDetails> accountDetails;
	
	
public AccountHolder() {
	super();
	// TODO Auto-generated constructor stub
}

public AccountHolder(int cutomerId, String title, String fistName, String middleName, String lastName,
		String dateOfBirth, String gender, String emailId, long mobileNo, long adhaarCardNo, String panCardNo,
		int residentialAddressId, int permanentAddressId, String occupation, String nationality, long accountNo,
		int documentId, List<AccountDetails> accountDetails) {
	super();
	this.cutomerId = cutomerId;
	this.title = title;
	this.fistName = fistName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.dateOfBirth = dateOfBirth;
	this.gender = gender;
	this.emailId = emailId;
	this.mobileNo = mobileNo;
	this.adhaarCardNo = adhaarCardNo;
	this.panCardNo = panCardNo;
	this.residentialAddressId = residentialAddressId;
	this.permanentAddressId = permanentAddressId;
	this.occupation = occupation;
	this.nationality = nationality;
	this.accountNo = accountNo;
	this.documentId = documentId;
	this.accountDetails = accountDetails;
}

public int getCutomerId() {
	return cutomerId;
}

public void setCutomerId(int cutomerId) {
	this.cutomerId = cutomerId;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getFistName() {
	return fistName;
}

public void setFistName(String fistName) {
	this.fistName = fistName;
}

public String getMiddleName() {
	return middleName;
}

public void setMiddleName(String middleName) {
	this.middleName = middleName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public long getMobileNo() {
	return mobileNo;
}

public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}

public long getAdhaarCardNo() {
	return adhaarCardNo;
}

public void setAdhaarCardNo(long adhaarCardNo) {
	this.adhaarCardNo = adhaarCardNo;
}

public String getPanCardNo() {
	return panCardNo;
}

public void setPanCardNo(String panCardNo) {
	this.panCardNo = panCardNo;
}

public int getResidentialAddressId() {
	return residentialAddressId;
}

public void setResidentialAddressId(int residentialAddressId) {
	this.residentialAddressId = residentialAddressId;
}

public int getPermanentAddressId() {
	return permanentAddressId;
}

public void setPermanentAddressId(int permanentAddressId) {
	this.permanentAddressId = permanentAddressId;
}

public String getOccupation() {
	return occupation;
}

public void setOccupation(String occupation) {
	this.occupation = occupation;
}

public String getNationality() {
	return nationality;
}

public void setNationality(String nationality) {
	this.nationality = nationality;
}

public long getAccountNo() {
	return accountNo;
}

public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}

public int getDocumentId() {
	return documentId;
}

public void setDocumentId(int documentId) {
	this.documentId = documentId;
}

public List<AccountDetails> getAccountDetails() {
	return accountDetails;
}

public void setAccountDetails(List<AccountDetails> accountDetails) {
	this.accountDetails = accountDetails;
}

@Override
public String toString() {
	return "AccountHolder [cutomerId=" + cutomerId + ", title=" + title + ", fistName=" + fistName + ", middleName="
			+ middleName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender
			+ ", emailId=" + emailId + ", mobileNo=" + mobileNo + ", adhaarCardNo=" + adhaarCardNo + ", panCardNo="
			+ panCardNo + ", residentialAddressId=" + residentialAddressId + ", permanentAddressId="
			+ permanentAddressId + ", occupation=" + occupation + ", nationality=" + nationality + ", accountNo="
			+ accountNo + ", documentId=" + documentId + ", accountDetails=" + accountDetails + "]";
}


}

	
	


