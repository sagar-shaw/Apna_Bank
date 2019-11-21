package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import com.lti.model.AccountDetails;

@Repository("AccountDetailsRepository")
public class AccountDetailsRepositoryImpl implements AccountDetailsRepository 
{
	@PersistenceContext
	  EntityManager em;
	public AccountDetails add(AccountDetails accountDetails) 
	{
		em.persist(accountDetails);
		System.out.println("insert persisted");
		return accountDetails;
	}

	public AccountDetails update(AccountDetails accountDetails)
	{
		em.merge(accountDetails);
		return accountDetails;
	}
	

	public AccountDetails delete(AccountDetails accountDetails)
	{
		em.remove(em.merge(accountDetails));
		return accountDetails;
	}

	public AccountDetails findById(long accountNo) 
	{
		return em.find(AccountDetails.class,new Long(accountNo));
	}

	public List<AccountDetails> findAll()
	{
		String q="Select a from AccountDetails a";
		TypedQuery<AccountDetails> query=em.createQuery(q,AccountDetails.class);
		List<AccountDetails> list=query.getResultList();
		return list;
	}
	 
}
