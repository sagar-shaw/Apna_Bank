package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Requests;
import com.lti.repository.RequestRepository;
@Service("RequestsService")

public class RequestServiceImpl implements RequestService
{ 
	@Autowired
	RequestRepository requestRepository;
	

	public RequestServiceImpl(RequestRepository requestRepository) {
		super();
		this.requestRepository = requestRepository;
	}

	@Override
	public Requests add(Requests requests) {
		return requestRepository.add(requests);
		
		
	}

	@Override
	public Requests update(int requestId) {
		Requests requests=requestRepository.findById(requestId);
		return requestRepository.update(requests);
	}

	@Override
	public Requests delete(int requestId) {
		Requests requests=requestRepository.findById(requestId);
		return requestRepository.delete(requests);
	}

	@Override
	public Requests findById(int requestId) {
		return requestRepository.findById(requestId);
	}

	@Override
	public List<Requests> findAll() {
		return requestRepository.findAll();
	}
	


}
