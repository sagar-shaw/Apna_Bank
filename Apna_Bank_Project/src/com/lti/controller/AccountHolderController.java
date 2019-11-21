package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.AccountHolder;
import com.lti.service.AccountHolderService;

@Controller
public class AccountHolderController 
{
		@Autowired
		AccountHolderService service;
		
		@RequestMapping(value="/add",method=RequestMethod.POST)
		public ModelAndView addAccountHolder(@ModelAttribute AccountHolder a)
		{
			ModelAndView model=null;
			AccountHolder a1=service.add(a);
			if(a1!=null) {
			model=new ModelAndView("AccountHolderAdded");	
			}
			else
			{
				model=new ModelAndView("AccountHolderNotAdded");	
			}
			return model;
			
			
		}
	/*
	 * @RequestMapping(value="/update",method=RequestMethod.POST) public
	 * ModelAndView update(int id) { AccountHolder
	 * c=service.findAccountHolderById(id); ModelAndView model=null; if(c!=null) {
	 * model=new ModelAndView("updateAccountHolder"); } model.addObject("c",c);
	 * return model;
	 * 
	 * }
	 * 
	 * @RequestMapping(value="/updateAccountHolder",method=RequestMethod.POST)
	 * public ModelAndView updateAccountHolder(int id,String name,String product) {
	 * AccountHolder c=new AccountHolder(); c.setAccountHolderId(id);
	 * c.setName(name); c.setProductName(product); service.updateAccountHolder(c);
	 * ModelAndView model=null; model=new ModelAndView("AccountHolderUpdated");
	 * return model;
	 * 
	 * }
	 * 
	 * @RequestMapping(value="/delete",method=RequestMethod.POST) public
	 * ModelAndView deleteAccountHolder(int id) { AccountHolder
	 * c=service.findAccountHolderById(id); service.deleteAccountHolder(c);
	 * ModelAndView model=null; model=new ModelAndView("AccountHolderDeleted");
	 * return model;
	 * 
	 * }
	 * 
	 * @RequestMapping(value="/display") public ModelAndView printAllAccountHolder()
	 * { List<AccountHolder> list=service.findAllAccountHolder(); ModelAndView
	 * model=null; model=new ModelAndView("displayAll");
	 * model.addObject("list",list); System.out.println(list.toString()); return
	 * model;
	 * 
	 * }
	 * 
	 * }
	 * 
	 * 
	 * }
	 */

}
