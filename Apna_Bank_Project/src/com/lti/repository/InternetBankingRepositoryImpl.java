package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.AccountDetails;
import com.lti.model.Address;
import com.lti.model.InternetBanking;

@Repository("InternetBankingRepository")
public class InternetBankingRepositoryImpl implements InternetBankingRepository
{
	@PersistenceContext
	EntityManager em;
	@Override
	@Transactional
	public InternetBanking add(InternetBanking internetBanking) {
		em.persist(internetBanking);
		return internetBanking;
		
		
	}

	@Override
	@Transactional
	public InternetBanking update(InternetBanking internetBanking) {
		em.merge(internetBanking);
		return null;
	}

	@Override
	@Transactional
	public InternetBanking delete(InternetBanking internetBanking) {
		em.remove(em.merge(internetBanking));
		return internetBanking;
	}

	@Override
	public InternetBanking findById(String userId )
	{
		System.out.println("----in ib repo----");
		InternetBanking ib=em.find(InternetBanking.class,new String(userId));
		System.out.println(ib);
		return ib;
		
	}

	@Override
	public List<InternetBanking> findAll() {
		
		String q="Select a from InternetBanking a";
		TypedQuery<InternetBanking> query=em.createQuery(q,InternetBanking.class);
		List<InternetBanking> list=query.getResultList();
		return list;
	}

	@Override
	public InternetBanking findByAccountNo(long accountNo) {
		String q="select a from InternetBanking a where a.accountNo="+accountNo;
		TypedQuery<InternetBanking> query=em.createQuery(q,InternetBanking.class);
		InternetBanking i=query.getSingleResult();
		return i;
	}	
	
}
