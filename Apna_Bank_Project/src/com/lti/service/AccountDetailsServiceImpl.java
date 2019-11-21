package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.AccountDetails;
import com.lti.repository.AccountDetailsRepository;

@Service("AccountDetailsService")
public class AccountDetailsServiceImpl implements AccountDetailsService 
{
	@Autowired
	AccountDetailsRepository repository;

	public AccountDetailsServiceImpl(AccountDetailsRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public AccountDetails add(AccountDetails accountDetails) 
	{	
		return repository.add(accountDetails);	
	}
	
	@Override
	public AccountDetails update(long accountNo)
	{
		AccountDetails accountDetails=repository.findById(accountNo);
		return repository.update(accountDetails);
	}
	
	@Override
	public AccountDetails delete(long accountNo)
	{
		AccountDetails accountDetails=repository.findById(accountNo);
		return repository.delete(accountDetails);
	}
	@Override
	public AccountDetails findById(long accountNo) 
	{
		return repository.findById(accountNo);
	}
	@Override
	public List<AccountDetails> findAll()
	{
		return repository.findAll();
	}
	 

}
