package com.lti.service;

import java.util.List;

import com.lti.model.Payee;



public interface PayeeService {
	
	Payee add(Payee payee);

	Payee update(long payeeAccountNo);

	Payee delete(long payeeAccountNo);

	Payee findByPayeeAccountNo(long payeeAccountNo);

	List<Payee> findAll();

}
