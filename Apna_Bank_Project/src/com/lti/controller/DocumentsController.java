package com.lti.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.annotation.MultipartConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.AccountDetails;
import com.lti.model.AccountHolder;
import com.lti.model.Documents;
import com.lti.service.DocumentsService;

@Controller
@MultipartConfig

public class DocumentsController 
{ 	
	@Autowired
	DocumentsService documentsService;
	
	@RequestMapping(value = "/documentUpload", method = RequestMethod.POST)
	public ModelAndView uploadMultipleFileHandler(@RequestParam("file") MultipartFile[] files,@SessionAttribute("AccountHolder") AccountHolder accountHolder,@SessionAttribute("account") AccountDetails account)
	{
		ModelAndView model=null;
		if (files.length != 3)
			System.out.println("Mandatory information missing"); 
		String documentNames[]=new String[3];
		documentNames[0]=new String(accountHolder.getCustomerId()+"_Adhaar"+".pdf");
		documentNames[1]=new String(accountHolder.getCustomerId()+"_PAN"+".pdf");
		documentNames[2]=new String(accountHolder.getCustomerId()+"_Photo"+".pdf");
		for (int i = 0; i < 3; i++)
		{
			MultipartFile file = files[i];

			try 
			{
				byte[] bytes = file.getBytes();
				
				String rootPath = System.getProperty("Apna_Bank_Project/Documents");
				File dir = new File(rootPath + File.separator + "Documents");
				System.out.println(dir.getAbsolutePath());
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File file1= new File(dir.getAbsolutePath() + File.separator + documentNames[i]);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(file1));
				stream.write(bytes);
				stream.close();

				System.out.println("You successfully uploaded file=" + documentNames[i] );
			} 
			catch (Exception e) {
				System.out.println("You successfully uploaded file=" + documentNames[i] );
			}
		}
		
		System.out.println(account);
		Documents d =new Documents();
		d.setAdhaarCardNo(documentNames[0]);
		d.setAccountNo(account.getAccountNo());
		d.setPanCardNo(documentNames[1]);
		d.setPhoto(documentNames[2]);
		Documents d1=documentsService.add(d);
		model=new ModelAndView("thankyouCreate");
		return model;
	}
}
	
	

