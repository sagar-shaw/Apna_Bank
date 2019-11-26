package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.InternetBanking;
import com.lti.service.EmailService;
import com.lti.service.InternetBankingService;



@Controller
public class ForgetCredentialsController
{

	
	@Autowired
	InternetBankingService service;
	
	@Autowired
	EmailService emailService;
	
	
	  @RequestMapping(value="/forgetUserId",method=RequestMethod.POST) 
	  public ModelAndView forgetUserId(@RequestParam long accountNo,@RequestParam String emailId)
	  {
		  InternetBanking incomingUser=new InternetBanking();
		  ModelAndView model=null;
		 
		  incomingUser=service.findByAccountNo(accountNo);
		  System.out.println(incomingUser);
		  if(incomingUser!=null)
		  {
			  String mailId=emailId;
			  String subject="UserId reset";
			  String message="Dear Abc,\n\t Greetings from APNA BANK!!"
						+ "\n Your UserId is "+incomingUser.getUserId()
			  + ". Please change your credentials for better security .Enjoy banking with us. \n \n Best Regards,\n APNA BANK";
				emailService.send(mailId,subject,message);
				String redirectUrl="login.jsp";
				model= new ModelAndView("redirect:" + redirectUrl);
		  }
		  else
		  { 
			  String mailId=emailId;
			  String subject="Account not registered for internet banking service ";
			  String message="Dear Abc,\n\t Greetings from APNA BANK!!\n Your account "
					  +" is not registered for Internet Banking.Please click on the link below to register\n\n http://localhost:9095/Apna_Bank_Project/register.jsp"+ 
			 "\n Enjoy banking with us. \n \n Best Regards,\n APNA BANK";
				emailService.send(mailId,subject,message);
				String redirectUrl="login.jsp";
				model= new ModelAndView("redirect:" + redirectUrl);
		
		  }
		  return model;
	  
	  }
	  @RequestMapping(value="/forgetPassword",method=RequestMethod.POST) 
	  public ModelAndView login(@RequestParam String userId,@RequestParam String emailId)
	  {
		  InternetBanking incomingUser=new InternetBanking();
		  ModelAndView model=null;
		  incomingUser=service.findById(userId);
		  System.out.println(incomingUser);
		  
		  if(incomingUser!=null)
		  {
			  
			 String password=service.generateNewPassword();
			  String mailId=emailId;
			  String subject="Password reset";
			  String message="Dear Abc,\n\t Greetings from APNA BANK!!"
						+ "\n Your new Password is "+password
			  + ".Please change your credentials for better security .Enjoy banking with us. \n \n Best Regards,\n APNA BANK";
			emailService.send(mailId,subject,message);
			String redirectUrl="login.jsp";
			model= new ModelAndView("redirect:" + redirectUrl);
			 
		  }
		  else
		  { 
			  String mailId=emailId;
			  String subject="Account not registered for internet banking service ";
			  String message="Dear Abc,\n\t Greetings from APNA BANK!!\n Your account "
					  +" is not registered for Internet Banking.Please click on the link below to register\n\n http://localhost:9095/Apna_Bank_Project/register.jsp"+ 
			 "\n Enjoy banking with us. \n \n Best Regards,\n APNA BANK";
				emailService.send(mailId,subject,message);
				String redirectUrl="login.jsp";
				model= new ModelAndView("redirect:" + redirectUrl);
		  }
		  return model;
	  
	  }
}
