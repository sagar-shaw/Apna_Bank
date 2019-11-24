package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.CardDetails;
import com.lti.repository.CardDetailsRepository;
@Service("CardDetailsService")

public class CardDetailsServiceImpl implements CardDetailsService
{
	@Autowired
	CardDetailsRepository cardDetailsRepository;
	
	

	public CardDetailsServiceImpl(CardDetailsRepository cardDetailsRepository) {
		super();
		this.cardDetailsRepository = cardDetailsRepository;
	}

	@Override
	public CardDetails add(CardDetails cardDetails) 
	{
		return cardDetailsRepository.add(cardDetails);
	}

	@Override
	public CardDetails update(long cardNo) {
		CardDetails  cardDetails=cardDetailsRepository.findById(cardNo);
		return cardDetailsRepository.update(cardDetails);	
	}

	@Override
	public CardDetails delete(long cardNo) {
		CardDetails cardDetails=cardDetailsRepository.findById(cardNo);
		return cardDetailsRepository.delete(cardDetails);
	}

	@Override
	public CardDetails findById(long cardNo) {
		return cardDetailsRepository.findById(cardNo);
	}

	@Override
	public List<CardDetails> findAll() {
		return cardDetailsRepository.findAll();
	}

}
