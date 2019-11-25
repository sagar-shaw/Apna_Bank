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
import com.lti.model.InternetBanking;
import com.lti.service.AccountDetailsService;
import com.lti.service.AccountHolderService;
import com.lti.service.EmailService;
import com.lti.service.InternetBankingService;
@Controller

public class InternetBankingController 
{
	@Autowired
	InternetBankingService service;
	
	@Autowired
	AccountDetailsService acservice;
	
	@Autowired
	AccountHolderService ahservice;
	
	@Autowired
	EmailService emailService; 
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView addInternetBanking(@ModelAttribute InternetBanking ib)
	{
		
		System.out.println("in register");
		ModelAndView model=null;
		AccountDetails ad=acservice.findById(ib.getAccountDetails().getAccountNo());
		System.out.println(ib.getAccountDetails().getAccountNo());
		System.out.println(ad);
		if(ad!=null)
		{
			InternetBanking ib1=service.add(ib);
			model=new ModelAndView("registered");	
		}
		else
		{
			System.out.println("Account not found");
			model=new ModelAndView("notRegistered");	
		}
		AccountHolder ah=ahservice.findById(ad.getAccountHolder().getCustomerId());
		String mailId=ah.getEmailId();
		String subject="Registration form submitted Successfully";
		String message="Dear "+ah.getFirstName()+",\n\t Greetings from APNA BANK!!"
				+ "\n Your request for internet banking account has been successfully registered. Our team will soon process it."
				+ " Till then enjoy banking with us. \n \n Best Regards,\n APNA BANK";
		emailService.send(mailId,subject,message);
		
		return model;
		
		
	}
	
	
	  @RequestMapping(value="/login",method=RequestMethod.POST) 
	  public ModelAndView login(@RequestParam String userId,@RequestParam String password)
	  {
		  InternetBanking incomingUser=new InternetBanking();
		  ModelAndView model=null;
		  System.out.println(userId + " " +password);
		  incomingUser=service.findById(userId);
		  System.out.println(incomingUser);
		  if(incomingUser!=null)
		  {
			  if(password.equals(incomingUser.getPassword()))
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
