package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="INTERNET_BANKING_ACCOUNT")
public class InternetBanking 
{
		@Id
		String userId;//pk
		
		@OneToOne(fetch=FetchType.EAGER)
		@JoinColumn(name="ACCOUNTNO")
		AccountDetails accountDetails;
		
		String password;
		String profilePassword;
		public InternetBanking() 
		{
			super();
	// TODO Auto-generated constructor stub
		}

		
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public AccountDetails getAccountDetails() {
			return accountDetails;
		}
		public void setAccountDetails(AccountDetails accountDetails) {
			this.accountDetails = accountDetails;
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
			return "InternetBanking [userId=" + userId + ", accountDetails=" + accountDetails + ", password=" + password
					+ ", profilePassword=" + profilePassword + "]";
		}

}
