package com.lti.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.InternetBanking;
import com.lti.model.InternetBanking;
import com.lti.repository.InternetBankingRepository;
@Service("InternetBankingService")
public class InternetBankingServiceImpl  implements InternetBankingService{
	
	@Autowired
	InternetBankingRepository internetBankingRepository;
	
	public InternetBankingServiceImpl(InternetBankingRepository internetBankingRepository)
	{
		super();
		this.internetBankingRepository = internetBankingRepository;
	}

	@Override
	public InternetBanking add(InternetBanking internetBanking) 
	{
		return internetBankingRepository.add(internetBanking);
	}

	@Override
	public InternetBanking update(String userId)
	{
		InternetBanking internetBanking=internetBankingRepository.findById(userId);
		return internetBankingRepository.update(internetBanking);
	}

	@Override
	public InternetBanking delete(String userId) 
	{
		InternetBanking internetBanking=internetBankingRepository.findById(userId);
		return internetBankingRepository.delete(internetBanking);
	}

	@Override
	public InternetBanking findById(String userId)
	{
		return internetBankingRepository.findById(userId);
	}

	@Override
	public List<InternetBanking> findAll() 
	{
		return internetBankingRepository.findAll();
	}
	
	

}
