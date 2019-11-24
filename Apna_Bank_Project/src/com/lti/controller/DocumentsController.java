package com.lti.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;

import com.lti.model.AccountDetails;
import com.lti.model.AccountHolder;
import com.lti.model.Documents;
import com.lti.service.DocumentsService;

@Controller
public class DocumentsController 
{ 	
	@Autowired
	DocumentsService documentsService;
	
	@RequestMapping(value = "/documentUpload", method = RequestMethod.POST)
	public void uploadMultipleFileHandler(@RequestParam("name") String[] names,	@RequestParam("file") MultipartFile[] files,@SessionAttribute("AccountHolder") AccountHolder accountHolder,@SessionAttribute("account") AccountDetails account)
	{

		if (files.length != names.length)
			System.out.println("Mandatory information missing"); 
		String documentNames[]=null;
		
		for (int i = 0; i <= 3; i++)
		{
			MultipartFile file = files[i];
			
			String name = names[i]+".pdf";
			if(i==3)
				name=accountHolder.getCustomerId()+".pdf";
			documentNames[i]=name;
			try 
			{
				byte[] bytes = file.getBytes();
				
				String rootPath = System.getProperty("Apna_Bank_Project");
				File dir = new File(rootPath + File.separator + "Documents");
				System.out.println(dir.getAbsolutePath());
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File file1= new File(dir.getAbsolutePath() + File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(file1));
				stream.write(bytes);
				stream.close();

				System.out.println("You successfully uploaded file=" + name );
			} 
			catch (Exception e) {
				System.out.println("You successfully uploaded file=" + name );
			}
		}
		Documents d =new Documents();
		d.setAdhaarCardNo(names[0]);
		d.setAccountDetails(account);
		d.setPanCardNo(names[1]);
		d.setPhoto(names[2]);
		documentsService.add(d);
		System.out.println(d);
		
	}
	
	

}
