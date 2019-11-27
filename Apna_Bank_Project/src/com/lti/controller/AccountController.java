package com.lti.controller;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.AccountDetails;
import com.lti.model.AccountHolder;
import com.lti.model.AccountType;
import com.lti.model.CardDetails;
import com.lti.model.InternetBanking;
import com.lti.model.Transaction;
import com.lti.service.AccountDetailsService;
import com.lti.service.AccountHolderService;
import com.lti.service.CardDetailsService;
import com.lti.service.TransactionService;

@Controller
@SessionAttributes("account")
public class AccountController
{
	
	@Autowired
	AccountDetailsService service;
	
	@Autowired
	CardDetailsService cdservice;
	
	@Autowired
	TransactionService tservice;
	
	@Autowired
	AccountHolderService ahService; 
	
	@ModelAttribute("account")
	 public AccountDetails setUpUserForm()
	 {
	      return new AccountDetails();
	 }
	
	@RequestMapping(value="/createAccount",method=RequestMethod.POST)
	public ModelAndView addAccountHolder(@SessionAttribute("AccountHolder") AccountHolder accountHolder, String ifsccode,String type, @ModelAttribute("account") AccountDetails ac)
	{
		
		System.out.println("Through session :"+accountHolder);
		ModelAndView model=null;
		AccountDetails account=new AccountDetails();
		
		int typeId=Integer.parseInt(type);
		AccountType at=new AccountType();
		at.setTypeId(typeId);
		account.setAccountType(at);
		
		account.setIfsccode(ifsccode);
		account.setInternetBanking('N');
		
		long millis=System.currentTimeMillis();  
		java.sql.Date date=new java.sql.Date(millis);    
		account.setOpeningDate(date);
		
		account.setStatus("Inactive");
		
		long customerId=accountHolder.getCustomerId();
		AccountHolder ah=new AccountHolder();
		ah.setCustomerId(customerId);
		account.setAccountholder(ah);
		AccountDetails a=service.add(account);
		System.out.println(a);
		ac=service.findById(account.getAccountNo());
		System.out.println("In session :"+a);
		if(a==null)
		{
			model=new ModelAndView("AccountNotAdded");	
		}
		else
		{
			String redirectUrl="documentation.jsp";
			model= new ModelAndView("redirect:" + redirectUrl);
		}
		
		
		CardDetails c1=new CardDetails();
		c1.setAccountDetails(a);
		c1.setCardType("Debit");
		c1.setIssueDate(date);
		
		Date date1=date;
		Calendar c = Calendar.getInstance();
		c.setTime(date1);
		c.add(Calendar.YEAR, 5);
		java.util.Date d=c.getTime();
		date1= new java.sql.Date(d.getTime());
		c1.setExpiryDate(date1);
		
		String name=accountHolder.getFirstName()+" "+accountHolder.getLastName();
		c1.setNameOnCard(name);
		CardDetails c2=cdservice.add(c1);
		System.out.println("\n\n Debit Card : "+c2);
		
		
		CardDetails c3=new CardDetails();
		c3.setAccountDetails(a);
		c3.setCardType("Credit");
		c3.setIssueDate(date);
		
		date1=date;
	    c = Calendar.getInstance();
		c.setTime(date1);
		c.add(Calendar.YEAR, 5);
		d=c.getTime();
		date1= new java.sql.Date(d.getTime());
		c3.setExpiryDate(date1);
		
		c3.setNameOnCard(name);
		c2=cdservice.add(c3);
		System.out.println("\n\n Credit Card : "+c2);
		return model;
		
	}
	
	@RequestMapping(value="/accountSummary")
	public ModelAndView accountSummary(@SessionAttribute("User") InternetBanking ac)
	{
		
		ModelAndView model;
		
		AccountDetails details=service.findById(ac.getAccountDetails().getAccountNo());
		System.out.println("Account :"+details);
		List<com.lti.model.Transaction> list=tservice.findByAccountNo(details.getAccountNo());
		System.out.println("------------------------\nList"+list);
		if(details!=null)
		{
			String redirectUrl="maindashboard.jsp#accountSummary";
			//model= new ModelAndView("redirect:" + redirectUrl);
			//model=new  ModelAndView("maindashboard#accountSummary");
			model= new ModelAndView("summary");
			model.addObject("transactionlist",list);
			model.addObject("details",details);
		}
		else
		{
			model=new  ModelAndView("loginFailed");
		}
	 
		return model;
	}
	@RequestMapping(value="/accountStatement")
	public ModelAndView accountStatement(Date dateFrom,Date dateTo,@SessionAttribute("User") InternetBanking user)
	{
		AccountDetails ac=service.findById(user.getAccountDetails().getAccountNo());
		ModelAndView model;
		List<Transaction> list=tservice.getAccountStatement(ac.getAccountNo(),dateFrom,dateTo);
		
		if(list!=null)
		{
			model=new ModelAndView("accountStatement?msg=success");
			model.addObject("account",ac);
			model.addObject("transactionList",list);
		}
		else
		{
			model=new ModelAndView("accountStatement?msg=failure");
			model.addObject("account",ac);
			model.addObject("transactionList",list);
		}
		return model;
	}
	
	@RequestMapping(value="/accountDetails")
	public ModelAndView accountDetails(@SessionAttribute("User") InternetBanking user)
	{
		AccountDetails ac=service.findById(user.getAccountDetails().getAccountNo());
		AccountHolder ah=ahService.findById(ac.getAccountHolder().getCustomerId());
		ModelAndView model=new ModelAndView("accDetails");
		model.addObject("account",ac);
		model=new ModelAndView("accDetails");
		model.addObject("account",ac);
		model.addObject("customer",ah);
		return model;
	}

	
	
}
