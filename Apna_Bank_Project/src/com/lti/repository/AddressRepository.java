package com.lti.repository;

import java.util.List;

import com.lti.model.Address;

public interface AddressRepository {
	public void add(Address address);
	public Address update(Address address);
	public Address delete(Address address);
	public Address findById(int addressId);
	List<Address> findAll();
	

}
