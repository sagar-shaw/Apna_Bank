package com.lti.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Account_Details")
public class AccountDetails
{
		
		@Id
		long accountNo;//pk
		
		@ManyToOne
		@JoinColumn(name = "ACCOUNTTYPEID")
		AccountType accountType;
	
		String ifsccode;
		float balance;
		char internetBanking;
		String status;
		Date openingDate;
	

		@Override
		public String toString() {
			return "AccountDetails [accountNo=" + accountNo + ", accountType=" + accountType + ", ifsccode=" + ifsccode
					+ ", balance=" + balance + ", internetBanking=" + internetBanking + ", status=" + status
					+ ", openingDate=" + openingDate + ", accountHolder=" + accountHolder + "]";
		}


	

		
		
		@ManyToOne
		@JoinColumn(name = "customerId")
		AccountHolder accountHolder;
		
		
		public AccountType getAccountType() {
			return accountType;
		}



		public void setAccountType(AccountType accountType) {
			this.accountType = accountType;
		}



		public void setAccountHolder(AccountHolder accountHolder) {
			this.accountHolder = accountHolder;
		}



		public AccountDetails() 
		{
		
		}



		public long getAccountNo() {
			return accountNo;
		}


		public void setAccountNo(long accountNo) {
			this.accountNo = accountNo;
		}


		


		public String getIfsccode() {
			return ifsccode;
		}


		public void setIfsccode(String ifsccode) {
			this.ifsccode = ifsccode;
		}


		public float getBalance() {
			return balance;
		}


		public void setBalance(float balance) {
			this.balance = balance;
		}


		public char getInternetBanking() {
			return internetBanking;
		}


		public void setInternetBanking(char internetBanking) {
			this.internetBanking = internetBanking;
		}


		public String getStatus() {
			return status;
		}


		public void setStatus(String status) {
			this.status = status;
		}


	




		public Date getOpeningDate() {
			return openingDate;
		}



		public void setOpeningDate(Date openingDate) {
			this.openingDate = openingDate;
		}



		public AccountHolder getAccountHolder() {
			return accountHolder;
		}


		public void setAccountholder(AccountHolder accountHolder) {
			this.accountHolder = accountHolder;
		}


	
		
		
		
}
