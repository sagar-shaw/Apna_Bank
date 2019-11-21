package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.model.Payee;

@Repository("PayeeRepository")
public class PayeeRepositoryImpl implements PayeeRepository
{
	@PersistenceContext
	EntityManager em;
	
	
	public void add(Payee payee) {
		em.persist(payee);
		
		
	}

	
	public Payee update(Payee payee) 
	{
		em.merge(payee);
		return payee;
	}


	public Payee delete(Payee payee) 
	{
		em.remove(em.merge(payee));
		return payee;
	}


	public Payee findByPayeeAccountNo(long payeeAccountNo) 
	{
	return em.find(Payee.class, new Long(payeeAccountNo));
	}

	
	
	
}
