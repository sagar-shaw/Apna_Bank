package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InternetBanking 
{
		@Id
		String userId;//pk
		long accountNo;//fk
		String password;
		String profilePassword;
public InternetBanking() {
	super();
	// TODO Auto-generated constructor stub
}
public InternetBanking(String userId, long accountNo, String password, String profilePassword) {
	super();
	this.userId = userId;
	this.accountNo = accountNo;
	this.password = password;
	this.profilePassword = profilePassword;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getProfilePassword() {
	return profilePassword;
}
public void setProfilePassword(String profilePassword) {
	this.profilePassword = profilePassword;
}
@Override
public String toString() {
	return "InternetBanking [userId=" + userId + ", accountNo=" + accountNo + ", password=" + password
			+ ", profilePassword=" + profilePassword + "]";
}


}
