package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Admin;
import com.lti.service.AccountHolderService;
import com.lti.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	AdminService service;
	
	@RequestMapping(value="/adminLogin",method=RequestMethod.POST)
	
		 public ModelAndView login(@ModelAttribute Admin a)
		  {
			  Admin incomingAdmin=new Admin();
			  ModelAndView model=null;
			  System.out.println(a.userId + " " +a.password);
			  incomingAdmin=service.findById(a.empId);
			  System.out.println(incomingAdmin);
			  if(incomingAdmin!=null)
			  {
				  if(a.password.equals(incomingAdmin.getPassword()))
				  {
					  model= new ModelAndView("loginSuccess"); 
				  }
				  else
				  {
					  System.out.println("Incorrect Password");
				  }
			  }
			  else
			  { 
				  model= new ModelAndView("loginfailed"); 
			  }
			  return model;
		  
		  }
	}
	


