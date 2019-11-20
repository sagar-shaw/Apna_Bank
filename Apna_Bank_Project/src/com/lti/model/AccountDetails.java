package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Account_Details")
public class AccountDetails
{
		
		@Id
		long accountNo;//pk
		int accountTypeId;
		String ifsccode;
		float balance;
		char internetBanking;
		String status;
		String openingDate;
		long customerId;//fk
		long cardNo;//fk
		@ManyToOne
		@JoinColumn(name = "customerId")
		AccountHolder accountHolder;
		
		
		public AccountDetails() 
		{
		
		}


		public AccountDetails(long accountNo, int accountTypeId, String ifsccode, float balance, char internetBanking,
				String status, String openingDate, long customerId, long cardNo, AccountHolder accountHolder) {
			super();
			this.accountNo = accountNo;
			this.accountTypeId = accountTypeId;
			this.ifsccode = ifsccode;
			this.balance = balance;
			this.internetBanking = internetBanking;
			this.status = status;
			this.openingDate = openingDate;
			this.customerId = customerId;
			this.cardNo = cardNo;
			this.accountHolder = accountHolder;
		}


		public long getAccountNo() {
			return accountNo;
		}


		public void setAccountNo(long accountNo) {
			this.accountNo = accountNo;
		}


		public int getAccountTypeId() {
			return accountTypeId;
		}


		public void setAccountTypeId(int accountTypeId) {
			this.accountTypeId = accountTypeId;
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


		public String getOpeningDate() {
			return openingDate;
		}


		public void setOpeningDate(String openingDate) {
			this.openingDate = openingDate;
		}


		public long getCustomerId() {
			return customerId;
		}


		public void setCustomerId(long customerId) {
			this.customerId = customerId;
		}


		public long getCardNo() {
			return cardNo;
		}


		public void setCardNo(long cardNo) {
			this.cardNo = cardNo;
		}


		public AccountHolder getAccountHolder() {
			return accountHolder;
		}


		public void setAccountholder(AccountHolder accountHolder) {
			this.accountHolder = accountHolder;
		}


		@Override
		public String toString() {
			return "AccountDetails [accountNo=" + accountNo + ", accountTypeId=" + accountTypeId + ", ifsccode="
					+ ifsccode + ", balance=" + balance + ", internetBanking=" + internetBanking + ", status=" + status
					+ ", openingDate=" + openingDate + ", customerId=" + customerId + ", cardNo=" + cardNo
					+ ", accountHolder=" + accountHolder + "]";
		}
		
		
		
		
		
}
