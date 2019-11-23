package com.lti.service;

import java.util.List;

import com.lti.model.AccountDetails;

public interface AccountDetailsService {

	AccountDetails add(AccountDetails accountDetails);

	AccountDetails update(AccountDetails accountDetails);

	AccountDetails delete(long accountNo);

	AccountDetails findById(long accountNo);

	List<AccountDetails> findAll();

}