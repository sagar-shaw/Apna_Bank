package com.lti.repository;

import java.util.List;

import com.lti.model.Requests;

public interface RequestRepository {
	
	
	public void add(Requests requests);
	
	public Requests update(Requests requests);
	
	public Requests delete(Requests requests);
	public Requests findById(int requestId);
	List<Requests> findAll();
	

}
