package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.AccountDetails;
import com.lti.repository.AccountDetailsRepository;

@Service("AccountDetailsService")
public class AccountDetailsServiceImpl implements AccountDetailsService 
{	
	AccountDetails ac=new AccountDetails();
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
	@Transactional
	public AccountDetails update(AccountDetails accountDetails)
	{
	//	AccountDetails accountDetails=repository.findById(accountNo);
		System.out.println("ads service");
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
