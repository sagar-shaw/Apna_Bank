package com.lti.repository;

import java.util.List;

import com.lti.model.Transaction;

public interface TransactionRepository 
{
	public void add(Transaction transaction);
	public Transaction update(Transaction transaction);
	public Transaction delete(Transaction transaction);
	public Transaction findById(int transactionId);
	List<Transaction> findAll();

}
