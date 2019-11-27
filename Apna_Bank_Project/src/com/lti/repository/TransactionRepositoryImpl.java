package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Transaction;

@Repository("TransactionRepository")
public class TransactionRepositoryImpl implements TransactionRepository
{
	
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public Transaction add(Transaction transaction) 
	{
		System.out.println("---in repo---");
		em.persist(transaction);
		System.out.println(transaction);
		return transaction;
	}
	@Transactional
	@Override
	public Transaction update(Transaction transaction) {
		em.merge(transaction);
		return transaction;
	}
	@Transactional
	@Override
	public Transaction delete(Transaction transaction) {
		em.remove(em.merge(transaction));
		return transaction;
	}

	@Override
	public Transaction findById(int transactionId) {
		return em.find(Transaction.class, new Integer(transactionId));
	}

	@Override
	public List<Transaction> findAll()
	{
		String q="Select a from Transaction a";
		TypedQuery<Transaction> query=em.createQuery(q,Transaction.class);
		List<Transaction> list=query.getResultList();
		System.out.println(list);
		return list;
	}
	public List<Transaction> findByAccountNo(long accountNo)
	{
		String q="Select a from Transaction a where a.accountDetails.accountNo="+accountNo;
		TypedQuery<Transaction> query=em.createQuery(q,Transaction.class);
		List<Transaction> list=query.getResultList();
		System.out.println(list);
		return list;
	}

	
}
