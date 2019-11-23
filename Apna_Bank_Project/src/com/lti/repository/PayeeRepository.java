package com.lti.repository;

import java.util.List;

import com.lti.model.AccountHolder;
import com.lti.model.Payee;

public interface PayeeRepository {
	public Payee add(Payee payee);
	public Payee update(Payee payee);
	public Payee delete(Payee payee);
	public Payee findByPayeeAccountNo(long payeeAccountNo);
	List<Payee> findAll();
	

}
