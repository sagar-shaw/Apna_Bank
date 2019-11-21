package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.model.Address;
import com.lti.model.InternetBanking;

@Repository("InternetBankingRepository")
public class InternetBankingRepositoryImpl implements InternetBankingRepository
{
	@PersistenceContext
	EntityManager em;
	@Override
	public void add(InternetBanking internetBanking) {
		em.persist(internetBanking);
		
		
	}

	@Override
	public InternetBanking update(InternetBanking internetBanking) {
		em.merge(internetBanking);
		return null;
	}

	@Override
	public InternetBanking delete(InternetBanking internetBanking) {
		em.remove(em.merge(internetBanking));
		return internetBanking;
	}

	@Override
	public InternetBanking findById(String userId ) {
		return em.find(InternetBanking.class,new String(userId));
		
	}	
	
}
