package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.CardDetails;

@Repository("CardDetailsRepository")
public class CardDetailsRepositoryImpl implements CardDetailsRepository
{
	@PersistenceContext
	  EntityManager em;
	
	@Transactional
	@Override
	public CardDetails add(CardDetails cardDetails) 
	{
		em.persist(cardDetails);
		System.out.println("insert persisted");
		return cardDetails;
		
	}
	@Transactional
	@Override
	public CardDetails update(CardDetails cardDetails)
	{
		em.merge(cardDetails);
		return cardDetails;
	}
	@Transactional
	@Override
	public CardDetails delete(CardDetails cardDetails)
	{
		em.remove(em.merge(cardDetails));
		return cardDetails;
	}
	@Override
	public CardDetails findById(long cardNo) 
	{
		return em.find(CardDetails.class,new Long(cardNo));
	}
	@Override
	public List<CardDetails> findAll()
	{
		String q="Select all from CardDetails all";
		TypedQuery<CardDetails> query=em.createQuery(q,CardDetails.class);
		List<CardDetails> list=query.getResultList();
		return list;
	}
	
	 
}
