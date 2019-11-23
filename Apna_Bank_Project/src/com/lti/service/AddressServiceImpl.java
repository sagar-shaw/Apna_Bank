package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Address;
import com.lti.repository.AddressRepository;
@Service("AddressService")

public class AddressServiceImpl  implements AddressService
{		
	@Autowired
	AddressRepository addressRepository;


	public AddressServiceImpl(AddressRepository addressRepository) {
		super();
		this.addressRepository = addressRepository;
	}

	@Override
	public Address add(Address address) 
	{
		return addressRepository.add(address);
		
	}

	@Override
	public Address update(int addressId) 
	{
		Address address=addressRepository.findById(addressId);
		return addressRepository.update(address);	
		}

	@Override
	public Address delete(int addressId) {
		Address address=addressRepository.findById(addressId);
		return addressRepository.delete(address);
	}
		

	@Override
	public Address findById(int addressId) {
		return addressRepository.findById(addressId);
	}

	@Override
	public List<Address> findAll() {
		return addressRepository.findAll();
	}

}
