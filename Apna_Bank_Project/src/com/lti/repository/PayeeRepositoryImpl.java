package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Payee;

@Repository("PayeeRepository")
public class PayeeRepositoryImpl implements PayeeRepository
{
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public Payee add(Payee payee) {
		em.persist(payee);
		return payee;
		
		
	}

	@Transactional
	public Payee update(Payee payee) 
	{
		em.merge(payee);
		return payee;
	}
	
	@Transactional

	public Payee delete(Payee payee) 
	{
		em.remove(em.merge(payee));
		return payee;
	}


	public Payee findByPayeeAccountNo(long payeeAccountNo) 
	{
	return em.find(Payee.class, new Long(payeeAccountNo));
	}


	@Override
	public List<Payee> findAll() {
		String q="Select a from AccountHolder a";
		TypedQuery<Payee> query=em.createQuery(q,Payee.class);
		List<Payee> list=query.getResultList();
		return list;
	}

	
	
	
}
