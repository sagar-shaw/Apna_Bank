package com.lti.repository;

import java.util.List;

import com.lti.model.Admin;

public interface AdminRepository {
	public void add(Admin admin);
	public Admin update(Admin admin);
	public Admin delete(Admin admin);
	public Admin findById(int empId);
	List<Admin> findAll();

}
