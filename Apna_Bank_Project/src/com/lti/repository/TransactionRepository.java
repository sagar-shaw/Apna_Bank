package com.lti.repository;

import java.sql.Timestamp;
import java.util.List;

import com.lti.model.Transaction;

public interface TransactionRepository 
{
	public Transaction add(Transaction transaction);
	public Transaction update(Transaction transaction);
	public Transaction delete(Transaction transaction);
	public Transaction findById(int transactionId);
	List<Transaction> findAll();
	public List<Transaction> findByAccountNo(long accountNo);
	public List<Transaction> getAccountStatement(long accountNo,Timestamp t1,Timestamp t2);
}
