package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Admin;
import com.lti.model.Transaction;
import com.lti.service.AccountHolderService;
import com.lti.service.AdminService;
import com.lti.service.TransactionService;

@Controller
public class AdminController {
	
	@Autowired
	AdminService service;
	
	@Autowired
	TransactionService tservice;
	
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

	@RequestMapping(value="/allTransactions",method=RequestMethod.POST)
	public ModelAndView displayAllTransactions()
	{
		ModelAndView model;	
		List<Transaction> list=tservice.findAll();

		if(list!=null)
		{
			model=new ModelAndView("allTransactions?msg=success");
			model.addObject("transactionList",list);
		}
		else
		{
			model=new ModelAndView("allTransactions?msg=failure");
			model.addObject("transactionList",list);
		}
		return model;
	}

	@RequestMapping(value="/accountTransactions",method=RequestMethod.POST)
	public ModelAndView displayAccountTransactions(@RequestParam long accountNo)
	{
		ModelAndView model;	
		List<Transaction> list=tservice.findByAccountNo(accountNo);

		if(list!=null)
		{
			model=new ModelAndView("accountTransactions?msg=success");
			model.addObject("transactionList",list);
		}
		else
		{
			model=new ModelAndView("accountTransactions?msg=failure");
			model.addObject("transactionList",list);
		}
		return model;
	}
}
	


