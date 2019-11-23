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
	public void withdrawn(long accountNo,float amount);
	public void deposit(long accountNo,float amount);
}
