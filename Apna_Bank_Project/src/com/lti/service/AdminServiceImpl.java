package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Admin;

import com.lti.repository.AdminRepository;
@Service("AdminService")

public class AdminServiceImpl implements AdminService
{
	@Autowired
	AdminRepository adminRepository ;
	
	public AdminServiceImpl(AdminRepository adminRepository) {
		super();
		this.adminRepository = adminRepository;
	}

	@Override
	public Admin add(Admin admin) {
		
		return adminRepository.add(admin);
	}

	@Override
	public Admin update(int empId) 
	{
		Admin admin =adminRepository.findById(empId);
		return adminRepository.update(admin);
	}
		

	@Override
	public Admin delete(int empId) {
		Admin admin =adminRepository.findById(empId);
		return adminRepository.delete(admin);
	}

	@Override
	public Admin findById(int empId) {
		return adminRepository.findById(empId);
	}

	@Override
	public List<Admin> findAll() {
		
		return adminRepository.findAll();
	}

}
