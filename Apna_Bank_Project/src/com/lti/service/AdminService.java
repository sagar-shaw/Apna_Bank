package com.lti.service;

import java.util.List;

import com.lti.model.Admin;



public interface AdminService {
	
	Admin add(Admin admin);

	Admin update(int empId);

	Admin delete(int empId);

	Admin findById(int empId);

	List<Admin> findAll();

}
