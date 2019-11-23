package com.lti.service;

import java.util.List;

import com.lti.model.AccountHolder;
import com.lti.model.InternetBanking;

public interface AccountHolderService {

	AccountHolder add(AccountHolder accountHolder);

	AccountHolder update(long customerId);

	AccountHolder delete(long customerId);

	AccountHolder findById(long customerId);

	List<AccountHolder> findAll();

}