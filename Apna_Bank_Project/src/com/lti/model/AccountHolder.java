package com.lti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Account_Holder")
public class AccountHolder
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acc_seq")
	@SequenceGenerator(sequenceName = "accholder_seq", name = "acc_seq", allocationSize = 1)
	long customerId;//pk
	
	String title;
	String firstName;
	String middleName;
	String lastName;
	String dateOfBirth;//dateOfBirth
	String gender;
	String emailId;
	long mobileNo;
	long adhaarCardNo;
	String panCardNo;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="RESIDENTIALADDRESSID")
	Address residentialAddress;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="PERMANENTADDRESSID")
	Address permanentAddress;
	
	String occupation;//fk
	String nationality;//fk
	@OneToMany(mappedBy = "accountHolder")
	List<AccountDetails> accountDetails;
	
	
public AccountHolder() {
	super();
	// TODO Auto-generated constructor stub
}




public AccountHolder(long customerId, String title, String firstName, String middleName, String lastName,
		String dateOfBirth, String gender, String emailId, long mobileNo, long adhaarCardNo, String panCardNo,
		Address residentialAddress, Address permanentAddress, String occupation, String nationality) {
	super();
	this.customerId = customerId;
	this.title = title;
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.dateOfBirth = dateOfBirth;
	this.gender = gender;
	this.emailId = emailId;
	this.mobileNo = mobileNo;
	this.adhaarCardNo = adhaarCardNo;
	this.panCardNo = panCardNo;
	this.residentialAddress = residentialAddress;
	this.permanentAddress = permanentAddress;
	this.occupation = occupation;
	this.nationality = nationality;
}









public long getCustomerId() {
	return customerId;
}




public void setCustomerId(long customerId) {
	this.customerId = customerId;
}




public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}


public String getFirstName() {
	return firstName;
}




public void setFirstName(String firstName) {
	this.firstName = firstName;
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

public String getOccupation() {
	return occupation;
}
public Address getResidentialAddress() {
	return residentialAddress;
}



public void setResidentialAddress(Address residentialAddress) {
	this.residentialAddress = residentialAddress;
}



public Address getPermanentAddress() {
	return permanentAddress;
}



public void setPermanentAddress(Address permanentAddress) {
	this.permanentAddress = permanentAddress;
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


public List<AccountDetails> getAccountDetails() {
	return accountDetails;
}


public void setAccountDetails(List<AccountDetails> accountDetails) {
	this.accountDetails = accountDetails;
}











}

	
	


