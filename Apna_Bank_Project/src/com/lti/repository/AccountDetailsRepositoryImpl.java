package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.AccountDetails;

@Repository("AccountDetailsRepository")
public class AccountDetailsRepositoryImpl implements AccountDetailsRepository 
{
	@PersistenceContext
	  EntityManager em;
	
	
	@Transactional
	public AccountDetails add(AccountDetails accountDetails) 
	{
		em.persist(accountDetails);
		System.out.println("insert persisted");
		return accountDetails;
	}
	@Transactional
	public AccountDetails update(AccountDetails accountDetails)
	{  System.out.println("ads repo");
		em.merge(accountDetails);
		return accountDetails;
	}
	
	@Transactional
	public AccountDetails delete(AccountDetails accountDetails)
	{
		em.remove(em.merge(accountDetails));
		return accountDetails;
	}
	public AccountDetails findById(long accountNo) 
	{
		AccountDetails a= em.find(AccountDetails.class,accountNo);
		System.out.println("in repo"+a);
		 return a;
	}

	public List<AccountDetails> findAll()
	{
		String q="Select a from AccountDetails a";
		TypedQuery<AccountDetails> query=em.createQuery(q,AccountDetails.class);
		List<AccountDetails> list=query.getResultList();
		return list;
	}
	 
}
