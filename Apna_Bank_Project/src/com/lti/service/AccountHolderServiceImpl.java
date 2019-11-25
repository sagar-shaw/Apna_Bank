package com.lti.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.AccountHolder;
import com.lti.repository.AccountHolderRepository;

@Service("AccountHolderService")
public class AccountHolderServiceImpl implements AccountHolderService
{
	@Autowired
	AccountHolderRepository repository;
	AccountDetailsService accountDetailsService;
	public AccountHolderServiceImpl(AccountHolderRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public AccountHolder add(AccountHolder accountHolder) 
	{	
		return repository.add(accountHolder);	
	}
	
	@Override
	public AccountHolder update(AccountHolder accountHolder)
	{
		return repository.update(accountHolder);
	}
	
	@Override
	public AccountHolder delete(AccountHolder accountHolder)
	{
		return repository.delete(accountHolder);
	}
	@Override
	public AccountHolder findById(long customerId) 
	{
		return repository.findById(customerId);
	}
	@Override
	public List<AccountHolder> findAll()
	{
		return repository.findAll();
	}
	 

	
	

}
