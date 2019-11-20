package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin
{
	@Id
	int empId;
    String name;
    String userId;
    String password;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(int empId, String name, String userId, String password) {
		super();
		this.empId = empId;
		this.name = name;
		this.userId = userId;
		this.password = password;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [empId=" + empId + ", name=" + name + ", userId=" + userId + ", password=" + password + "]";
	}
    
    

}
