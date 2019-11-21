package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.lti.model.Admin;
import com.lti.model.CardDetails;

public class AdminRepositoryImpl implements AdminRepository {
	@PersistenceContext
	EntityManager em;
	@Override
	public void add(Admin admin) {
		em.persist(admin);
	}

	@Override
	public Admin update(Admin admin) {
		em.merge(admin);
		return admin;
	}

	@Override
	public Admin delete(Admin admin) {
		em.remove(em.merge(admin));
		return admin;
	}

	@Override
	public Admin findById(int empId) {
		return em.find(Admin.class, new Integer(empId));
	}

	@Override
	public List<Admin> findAll() {
		String q="Select all from CardDetails all";
		TypedQuery<Admin> query=em.createQuery(q,Admin.class);
		List<Admin> list=query.getResultList();
		return list;
	}

}
