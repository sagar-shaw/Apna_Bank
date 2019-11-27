package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.AccountDetails;
import com.lti.model.AccountHolder;
import com.lti.model.InternetBanking;
import com.lti.service.AccountDetailsService;
import com.lti.service.AccountHolderService;
import com.lti.service.EmailService;
import com.lti.service.InternetBankingService;
@Controller
@SessionAttributes("User")
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
	
	 @ModelAttribute("User")
	 public InternetBanking setUpUserForm()
	 {
	      return new InternetBanking();
	 }
	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView addInternetBanking(@ModelAttribute InternetBanking ib)
	{
		ModelAndView model=null;
		System.out.println(ib);
		if(ib!=null)
		{
			System.out.println("in register");
			System.out.println(ib.getAccountDetails().getAccountNo());
			AccountDetails ad=acservice.findById(ib.getAccountDetails().getAccountNo());
		
			System.out.println(ad);
			if(ad!=null)
			{
				InternetBanking ib1=service.add(ib);
				model=new ModelAndView("thankyou");	
				AccountHolder ah=ahservice.findById(ad.getAccountHolder().getCustomerId());
				String mailId=ah.getEmailId();
				String subject="Registration form submitted Successfully";
				String message="Dear "+ah.getFirstName()+",\n\t Greetings from APNA BANK!!"
					+ "\n Your request for internet banking account has been successfully registered. Our team will soon process it."
					+ " Till then enjoy banking with us. \n \n Best Regards,\n APNA BANK";
				emailService.send(mailId,subject,message);
			}
			else
			{
				System.out.println("Account not found");
				String redirectUrl="register.jsp?message=Account Not Found";
				model= new ModelAndView("redirect:" + redirectUrl);
			}	
		}
		else
		{
			System.out.println("Account not found");
			String redirectUrl="register.jsp?message=Enter Details";
			model= new ModelAndView("redirect:" + redirectUrl);
		}
		return model;
		
		
	}
	
	
	  @RequestMapping(value="/login",method=RequestMethod.POST) 
	  public ModelAndView login(@ModelAttribute("User") InternetBanking user, int attempts)
	  {
		
		  ModelAndView model=null;
		  System.out.println(user);
		  System.out.println("Remaining attempts : "+attempts);
		  InternetBanking incomingUser=service.findById(user.getUserId());
		  user.setAccountDetails(incomingUser.getAccountDetails());
		  System.out.println(incomingUser);
		  if(incomingUser!=null)
		  {
			  if(incomingUser.getPassword().equals(user.getPassword()))
			  {
				  model= new ModelAndView("maindashboard"); 
			  }
			  else
			  {
				 
				  String redirectUrl="userlogin.jsp?attempts="+(attempts-1);
				  model= new ModelAndView("redirect:" + redirectUrl);
			  }
		  }
		  else
		  { 
			  model= new ModelAndView("loginfailed"); 
		  }
		  user.setPassword(null);
		  return model;
	  
	  }
	  

	 
}
