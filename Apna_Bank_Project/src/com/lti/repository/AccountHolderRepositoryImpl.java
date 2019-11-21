package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.AccountHolder;

@Repository("AccountHolderRespository")
public class AccountHolderRepositoryImpl implements AccountHolderRepository 
{
	@PersistenceContext
	  EntityManager em;

	@Override
	@Transactional
	public AccountHolder add(AccountHolder accountHolder) 
	{
		em.persist(accountHolder);
		System.out.println("insert persisted");
		return accountHolder;
		
	}
	@Override
	public AccountHolder update(AccountHolder accountHolder)
	{
		em.merge(accountHolder);
		return accountHolder;
	}
	
	@Override
	public AccountHolder delete(AccountHolder accountHolder)
	{
		em.remove(em.merge(accountHolder));
		return accountHolder;
	}
	@Override
	public AccountHolder findById(long customerId) 
	{
		return em.find(AccountHolder.class,new Long(customerId));
	}
	@Override
	public List<AccountHolder> findAll()
	{
		String q="Select a from AccountHolder a";
		TypedQuery<AccountHolder> query=em.createQuery(q,AccountHolder.class);
		List<AccountHolder> list=query.getResultList();
		return list;
	}
	 
	  
}
