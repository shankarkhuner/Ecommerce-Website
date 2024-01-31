package com.cyber.success.CSJ30SpringBootMVCDemo1.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
	
	@RequestMapping("/hello")
	//@ResponseBody
	public String displayLoginPage()
	{
		return "login";
	}
	@RequestMapping(path="/login" , method=RequestMethod.POST)
	public String getLogin(@RequestParam("t1") String  userName, 
			@RequestParam("t2")   String password, Model model)
	{
/*public String getLogin(HttpServletRequest request, HttpServletResponse response)
	{
		String userName=request.getParameter("t1");
		String password=request.getParameter("t2");*/
		
		if(userName.equalsIgnoreCase("admin") && password.equals("admin@123"))
		{
			model.addAttribute("adminKey", userName);
			return "adminPage";
		}
		return "errorPage";
		
	}

}
