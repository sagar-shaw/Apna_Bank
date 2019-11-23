package com.lti.service;

import java.util.List;

import com.lti.model.Address;



public interface AddressService {
	Address add(Address address);

	Address update(int addressId);

	Address delete(int addressId);

	Address findById(int addressId);

	List<Address> findAll();

}
