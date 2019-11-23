package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Admin;
import com.lti.model.CardDetails;

@Repository("AdminRepository")
public class AdminRepositoryImpl implements AdminRepository
{
	@PersistenceContext
	
	EntityManager em;
	@Override
	@Transactional
	public Admin add(Admin admin) {
		em.persist(admin);
		return admin;
	
	}
	@Transactional
	@Override
	public Admin update(Admin admin) {
		em.merge(admin);
		return admin;
	}
	@Transactional
	@Override
	public Admin delete(Admin admin) {
		em.remove(em.merge(admin));
		return admin;
	}
	@Transactional
	@Override
	public Admin findById(int empId) {
		return em.find(Admin.class, new Integer(empId));
	}
	@Transactional
	@Override
	public List<Admin> findAll() {
		String q="Select all from CardDetails all";
		TypedQuery<Admin> query=em.createQuery(q,Admin.class);
		List<Admin> list=query.getResultList();
		return list;
	}

}
