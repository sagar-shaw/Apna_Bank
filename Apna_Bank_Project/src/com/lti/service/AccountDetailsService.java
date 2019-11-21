package com.lti.service;

import java.util.List;

import com.lti.model.AccountDetails;

public interface AccountDetailsService {

	AccountDetails add(AccountDetails accountDetails);

	AccountDetails update(long customerId);

	AccountDetails delete(long customerId);

	AccountDetails findById(long customerId);

	List<AccountDetails> findAll();

}