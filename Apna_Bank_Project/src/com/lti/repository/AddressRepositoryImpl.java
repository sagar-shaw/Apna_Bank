package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.lti.model.Address;
import com.lti.model.CardDetails;

@Repository("AddressRepository")
public class AddressRepositoryImpl implements AddressRepository
{
	@PersistenceContext
	EntityManager em;
	@Override
	public void add(Address address) {
		em.persist(address);
		
		
	}

	@Override
	public Address update(Address address) {
		em.merge(address);
		return null;
	}

	@Override
	public Address delete(Address address) {
		em.remove(em.merge(address));
		return address;
	}

	@Override
	public Address findById(int addressId) {
		return em.find(Address.class,new Integer(addressId));
		
	}
	@Override
	public List<Address> findAll() {
		String q="Select all from Address all";
		TypedQuery<Address> query=em.createQuery(q,Address.class);
		List<Address> list=query.getResultList();
		return list;
		
	}
	
	
	
	
	

}
