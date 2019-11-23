package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Payee;
import com.lti.repository.PayeeRepository;

@Service("PayeeService")

public class PayeeServiceImpl  implements PayeeService
{
		@Autowired
		PayeeRepository payeeRepository;

	public PayeeServiceImpl(PayeeRepository payeeRepository) {
			super();
			this.payeeRepository = payeeRepository;
		}

	@Override
	public Payee add(Payee payee) {
		return payeeRepository.add(payee);
	}

	@Override
	public Payee update(long payeeAccountNo) {
		Payee payee=payeeRepository.findByPayeeAccountNo(payeeAccountNo);
		return payeeRepository.update(payee);
	}

	@Override
	public Payee delete(long payeeAccountNo) {
		Payee payee=payeeRepository.findByPayeeAccountNo(payeeAccountNo);
		return payeeRepository.delete(payee);
	}

	@Override
	public Payee findByPayeeAccountNo(long payeeAccountNo) {
		return payeeRepository.findByPayeeAccountNo(payeeAccountNo);
	}

	@Override
	public List<Payee> findAll() {
		return payeeRepository.findAll();
	}

}
