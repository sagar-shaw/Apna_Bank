package com.lti.repository;

import java.util.List;

import com.lti.model.AccountDetails;

public interface AccountDetailsRepository {

	AccountDetails add(AccountDetails accountDetails);

	AccountDetails update(AccountDetails accountDetails);

	AccountDetails delete(AccountDetails accountDetails);

	AccountDetails findById(long accountNo);

	List<AccountDetails> findAll();

}