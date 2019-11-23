package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.AccountDetails;
import com.lti.model.AccountHolder;
import com.lti.model.Transaction;
import com.lti.service.TransactionService;

@Controller

public class TransactionController {
	
	@Autowired
	TransactionService service;
	
	@RequestMapping(value="/transaction" ,method=RequestMethod.POST)
	public ModelAndView transaction(@ModelAttribute Transaction transaction  )    //(@RequestParam long accountNo,@RequestParam long recipentAccountNo,@RequestParam float amount)
	{
		ModelAndView model=null;
		System.out.println("-----------in controller--------");
		System.out.println(transaction);
		Transaction t1=service.add(transaction);
		System.out.println(t1);
		Transaction t2=service.IMPSTransaction(t1);
		System.out.println(t2);
		return model;
		
		
	}

}
