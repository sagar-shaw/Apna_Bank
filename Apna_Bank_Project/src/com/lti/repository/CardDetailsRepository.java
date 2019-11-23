package com.lti.repository;

import java.util.List;

import com.lti.model.CardDetails;

public interface CardDetailsRepository {
	public CardDetails add(CardDetails cardDetails);
	public CardDetails update(CardDetails cardDetails);
	public CardDetails delete(CardDetails cardDetails);
	public CardDetails findById(long cardNo);
	List<CardDetails> findAll();
	

}
