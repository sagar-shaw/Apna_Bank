/*package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.service.EmailService;

@Controller
public class EmailController
{
	@Autowired
	EmailService email;
	
	@RequestMapping(value="/email",method=RequestMethod.POST)
	public void sendEmail()
	{
		email.send();
	
	}
}*/