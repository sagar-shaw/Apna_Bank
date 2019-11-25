package com.lti.repository;

import java.util.List;

import com.lti.model.Address;
import com.lti.model.InternetBanking;

public interface InternetBankingRepository {
	public InternetBanking add(InternetBanking internetBanking);
	public InternetBanking update(InternetBanking internetBanking);
	public InternetBanking delete(InternetBanking internetBanking);
	public InternetBanking findById(String userId);
	public List<InternetBanking> findAll();
	public InternetBanking findByAccountNo(long accountNo);

}
