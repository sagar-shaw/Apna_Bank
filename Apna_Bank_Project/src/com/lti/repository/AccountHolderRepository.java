package com.lti.repository;

import java.util.List;

import com.lti.model.AccountHolder;

public interface AccountHolderRepository
{

	void add(AccountHolder accountHolder);

	AccountHolder update(AccountHolder accountHolder);

	AccountHolder delete(AccountHolder accountHolder);

	AccountHolder findById(long customerId);

	List<AccountHolder> findAll();

}