package com.lti.repository;

import com.lti.model.Address;
import com.lti.model.InternetBanking;

public interface InternetBankingRepository {
	public void add(InternetBanking internetBanking);
	public InternetBanking update(InternetBanking internetBanking);
	public InternetBanking delete(InternetBanking internetBanking);
	public InternetBanking findById(String userId);
}
