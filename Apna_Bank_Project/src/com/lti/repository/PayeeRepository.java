package com.lti.repository;

import com.lti.model.Payee;

public interface PayeeRepository {
	public void add(Payee payee);
	public Payee update(Payee payee);
	public Payee delete(Payee payee);
	public Payee findByPayeeAccountNo(long payeeAccountNo);

}
