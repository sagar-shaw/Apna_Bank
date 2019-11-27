package com.lti.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.AccountDetails;
import com.lti.model.AccountHolder;
import com.lti.model.CardDetails;
import com.lti.model.InternetBanking;
import com.lti.model.Transaction;
import com.lti.service.AccountDetailsService;
import com.lti.service.CardDetailsService;
import com.lti.service.TransactionService;

@Controller

public class TransactionController {
	
	@Autowired
	TransactionService service;
	
	@Autowired 
	CardDetailsService cdserrvice;
	
	@Autowired
	AccountDetailsService acService;
	
	@RequestMapping(value="/rtgsTransaction" ,method=RequestMethod.POST)
	public ModelAndView transaction(@ModelAttribute Transaction transaction ,@SessionAttribute("User") InternetBanking ib )    //(@RequestParam long accountNo,@RequestParam long recipentAccountNo,@RequestParam float amount)
	{
		ModelAndView model=null;
		System.out.println("-----------in controller--------");
		System.out.println(transaction);
		AccountDetails ac=acService.findById(ib.getAccountDetails().getAccountNo());
		transaction.setAccountDetails(ac);
		Transaction t1=service.add(transaction);
		System.out.println(t1);
		Transaction t2=service.RTGSTransaction(t1);
		System.out.println(t2);
		return model;
		
		
	}
	
	@RequestMapping(value="/transaction" ,method=RequestMethod.POST)
	public ModelAndView transaction(@RequestParam long cardNo,int cvv,Date issueDate,Date expiryDate,@ModelAttribute Transaction transaction  )    //(@RequestParam long accountNo,@RequestParam long recipentAccountNo,@RequestParam float amount)
	{
		CardDetails cd=cdserrvice.findById(cardNo);
		System.out.println("\n\nCard :"+cd);
		ModelAndView model=null;
		System.out.println("-----------in controller--------");
		if(cd==null)
		{
			String redirectUrl="http://localhost:7079/OnlineShoppingProject/failure";
			model= new ModelAndView("redirect:" + redirectUrl);
			return model;
		}

	
		AccountDetails ad=new AccountDetails();;
		transaction.setAccountDetails(cd.getAccountDetails());
		System.out.println("\n\nTransaction :"+transaction);
		Transaction t1=service.add(transaction);
		System.out.println(t1);
		Transaction t2=service.IMPSTransaction(t1);
		if(t2==null)
		{
			String redirectUrl="http://localhost:7079/OnlineShoppingProject/failures";
			model= new ModelAndView("redirect:" + redirectUrl);
		}	
		else
		{
				String redirectUrl="http://localhost:7079/OnlineShoppingProject/success";
				model= new ModelAndView("redirect:" + redirectUrl);
		}
		System.out.println(t2);
		return model;
	}
	@RequestMapping(value="/IMPStransaction" ,method=RequestMethod.POST)
	public ModelAndView IMPStransaction(@RequestParam long cardNo,int cvv,Date issueDate,Date expiryDate,@ModelAttribute Transaction transaction  )    //(@RequestParam long accountNo,@RequestParam long recipentAccountNo,@RequestParam float amount)
	{
		CardDetails cd=cdserrvice.findById(cardNo);
		System.out.println("\n\nCard :"+cd);
		ModelAndView model=null;
		System.out.println("-----------in controller--------");
		if(cd==null)
		{
			model= new ModelAndView("transactionFailed");
			return model;
		}

	
		AccountDetails ad=new AccountDetails();;
		transaction.setAccountDetails(cd.getAccountDetails());
		System.out.println("\n\nTransaction :"+transaction);
		Transaction t1=service.add(transaction);
		System.out.println(t1);
		Transaction t2=service.IMPSTransaction(t1);
		if(t2==null)
		{
				model= new ModelAndView("transactionFailed");
		}	
		else
		{
			
				model= new ModelAndView("transactionSuccess");
		}
		System.out.println(t2);
		return model;
	}

}
