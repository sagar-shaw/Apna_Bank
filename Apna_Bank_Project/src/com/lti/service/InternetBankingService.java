package com.lti.service;

import java.util.List;

import com.lti.model.InternetBanking;



public interface InternetBankingService {
	
	InternetBanking add(InternetBanking internetBanking);

	InternetBanking update(String userId);

	InternetBanking delete(String userId);

	InternetBanking findById(String userId);

	List<InternetBanking> findAll();
	InternetBanking findByAccountNo(long accountNo);

}
