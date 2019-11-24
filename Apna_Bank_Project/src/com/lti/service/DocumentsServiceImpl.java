package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Documents;
import com.lti.repository.DocumentsRepository;

@Service("DocumentsService")
public class DocumentsServiceImpl implements DocumentsService{
	@Autowired
	DocumentsRepository documentsRepository;
	
	
	@Override
	public Documents add(Documents documents) {
		
		return documentsRepository.add(documents);
		
	}

}
