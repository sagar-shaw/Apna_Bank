package com.lti.service;

import java.util.List;

import com.lti.model.Transaction;

public interface TransactionService {
	
	Transaction add(Transaction transaction);

	Transaction update(int transactionId);

	Transaction delete(int transactionId);

	Transaction findById(int transactionId);

	List<Transaction> findAll();
	
	public Transaction IMPSTransaction(Transaction t);
	
	public Transaction RTGSTransaction(Transaction t);
	
	public Transaction NEFTTransaction(Transaction t);
	
	public void withdraw(long accountNo,float amount);
	public List<Transaction> findByAccountNo(long accountNo);
	
	public void deposit(long accountNo,float amount);
}
