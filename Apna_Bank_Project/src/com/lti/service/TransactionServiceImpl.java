package com.lti.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.CannotCreateTransactionException;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.AccountDetails;
import com.lti.model.Transaction;
import com.lti.repository.TransactionRepository;
import com.lti.model.Transaction;


@Service("Transcationservice")
public class TransactionServiceImpl implements TransactionService
{
	@Autowired
	TransactionRepository  transactionRepository;

	@Autowired
	AccountDetailsService ads;

	public TransactionServiceImpl(TransactionRepository transactionRepository)
	{
	super();
	this.transactionRepository = transactionRepository;
}

	@Override
	@Transactional
	public Transaction add(Transaction transaction)
	{
		Date date=new Date();
		Timestamp ts = new Timestamp(date.getTime());
		System.out.println(ts);
		transaction.setTransactionTime(ts);
		return transactionRepository.add(transaction);	
	}

	@Override
	public Transaction update(int transactionId) {
		// TODO Auto-generated method stub
		Transaction transaction=transactionRepository.findById(transactionId);
		return transactionRepository.update(transaction);
	}

	@Override
	public Transaction delete(int transactionId) {
		Transaction transaction=transactionRepository.findById(transactionId);
		return transactionRepository.delete(transaction);
	}

	@Override
	public Transaction findById(int transactionId) {
		return transactionRepository.findById(transactionId);
	}

	@Override
	public List<Transaction> findAll() {
		return transactionRepository.findAll();
	}

	@Override
	public Transaction IMPSTransaction(Transaction t) 
	{
		System.out.println("---in transaction service---\n");
		withdraw(t.getAccountDetails().getAccountNo(),t.getAmount());
		deposit(t.getRecipentAccountNo(), t.getAmount());	
		return null;
	}
	public Transaction NEFTTransaction(Transaction t)
	{
		float charge=0.0f;
		float amount=t.getAmount();
		if(amount > 200000)
				throw new CannotCreateTransactionException("Maximum limit for NEFT transfer is Rs. 2 Lacs");
			else if(amount <=10000)
				charge = 1.18f;
			else if(amount<10000 && amount>100000)
				charge= 2.36f;
			else if(amount<100000 && amount>200000)
				charge= 3.54f;
		withdraw(t.getAccountDetails().getAccountNo(),(t.getAmount()+charge));
		deposit(t.getRecipentAccountNo(), t.getAmount());	
		return null;
	}
	public Transaction RTGSTransaction(Transaction t)
	{
		float charge=0.0f;
		float amount=t.getAmount();
		if(amount < 200000) 
				throw new CannotCreateTransactionException("Minimum limit for RTGS transfer is Rs. 2 Lacs");
		else if(amount>= 200000 && amount<=500000)
				charge = 5.90f;
		else if(amount >=500000 && amount<=100000)
				charge=11.80f;
		withdraw(t.getAccountDetails().getAccountNo(),(t.getAmount()+charge));
		deposit(t.getRecipentAccountNo(), t.getAmount());
		return null;
	}

	@Override
	public void withdraw(long accountNo, float amount) 
	{
		AccountDetails ad=ads.findById(accountNo);
		System.out.println("\n\n---in withdraw---\n"+ad);
		ad.setBalance(ad.getBalance()-amount);
		System.out.println("\n\n Updated in object :"+ad);
		ad=ads.update(ad);
		System.out.println("\n\n Updated in DB :"+ad);
	}

	@Override
	public void deposit(long accountNo, float amount) 
	{
		AccountDetails ad=ads.findById(accountNo);
		System.out.println("---in deposit--\n"+ad);
		ad.setBalance(ad.getBalance()+amount);
		System.out.println("\n\n Updated in oject :"+ad);
		ad=ads.update(ad);
		System.out.println("\n\n Updated in DB :"+ad);
	}

	@Override
	public List<Transaction> findByAccountNo(long accountNo) {
		return transactionRepository.findByAccountNo(accountNo);
	}

}
