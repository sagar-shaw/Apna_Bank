package com.lti.service;

import java.util.List;

import com.lti.model.CardDetails;

public interface CardDetailsService {
	CardDetails add(CardDetails address);

	CardDetails update(long cardNo);

	CardDetails delete(long cardNo);

	CardDetails findById(long cardNo);

	List<CardDetails> findAll();

}
