package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Requests;

@Repository("RequestRepository")
public class RequestRepositoryImpl implements RequestRepository
{
	@PersistenceContext
	EntityManager em;
	@Override
	@Transactional
	public Requests add(Requests requests) {
		em.persist(requests);
		return requests;
		
	}
	@Transactional
	@Override
	public Requests update(Requests requests) {
		em.merge(requests);
		return requests;
	}
	@Transactional
	@Override
	public Requests delete(Requests requests) {
		em.remove(em.merge(requests));
		return requests;
	}

	@Override
	public Requests findById(int requestId) {
		return em.find(Requests.class, new Integer(requestId));
	}

	@Override
	public List<Requests> findAll() {
		String q="Select all from Request all";
		TypedQuery<Requests> query=em.createQuery(q,Requests.class);
		List<Requests> list= query.getResultList();
		return list;
	}

}
