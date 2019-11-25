package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
	
	

		@Autowired
		private MailSender mailSender;
		
		@Autowired
		private SimpleMailMessage message;
		
		public void send(String mailId,String subject,String msg)
		{
			message.setTo(mailId); //set a proper recipient of the mail
			message.setSubject(subject);
			message.setText(msg);
			mailSender.send(message);
		}
	}



