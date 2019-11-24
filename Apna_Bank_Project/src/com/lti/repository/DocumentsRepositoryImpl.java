package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Documents;

@Repository("DocumentsRepository")
public class DocumentsRepositoryImpl implements DocumentsRepository{
	@PersistenceContext
	EntityManager em;
	
	
	@Transactional
	@Override
	public Documents add(Documents documents) {
		em.persist(documents);
		return documents;
	}

}
