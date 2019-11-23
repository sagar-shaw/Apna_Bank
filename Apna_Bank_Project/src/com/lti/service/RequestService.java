package com.lti.service;

import java.util.List;

import com.lti.model.Requests;

public interface RequestService {
	Requests add(Requests requests);

	Requests update(int requestId);

	Requests delete(int requestId);

	Requests findById(int requestId);

	List<Requests> findAll();

}
