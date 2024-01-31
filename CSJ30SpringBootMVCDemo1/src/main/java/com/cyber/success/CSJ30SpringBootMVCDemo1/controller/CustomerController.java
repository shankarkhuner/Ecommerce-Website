package com.cyber.success.CSJ30SpringBootMVCDemo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cyber.success.CSJ30SpringBootMVCDemo1.dao.CustomerServiceImpl;
import com.cyber.success.CSJ30SpringBootMVCDemo1.dao.ProductServiceImpl;
import com.cyber.success.CSJ30SpringBootMVCDemo1.exception.InvalidLoginException;
import com.cyber.success.CSJ30SpringBootMVCDemo1.model.Address;
import com.cyber.success.CSJ30SpringBootMVCDemo1.model.Customer;
import com.cyber.success.CSJ30SpringBootMVCDemo1.model.Product;

@Controller
@SessionAttributes({"userInfoKey","productsKey"})
public class CustomerController {
	//inject the dependency of CustomerServiceImpl
	@Autowired
	private CustomerServiceImpl service;
	
	@Autowired
	private ProductServiceImpl productService;
	
	@RequestMapping("/showSignUpForm")
	public String showCustomerForm()
	{
		return "signUp";
	}
	
	@RequestMapping(path="/addCustomer", method=RequestMethod.POST)
	public String addCustomer(@ModelAttribute Customer customer,@RequestParam("city") String city, @RequestParam("country") String country,
@RequestParam("state") String state,
@RequestParam("pinCode") String pinCode,


 Model model)
	{
		
		
		 Address address=new Address();
		 address.setCity(city);
		 address.setCountry(country);
                  address.setState(state);
                 address.setPinCode(Long.parseLong(pinCode));
		 customer.setAddress(address);
		
		System.out.println(customer);
		model.addAttribute("customerKey", customer);
	        service.addCustomer(customer);
		return "welcomeCustomer";
		
	}
	
	@RequestMapping("/")
public String showLoginForm()
{
	return "customerLogin";
}
	
	@RequestMapping("customerLogin")
	public String getLogin(@RequestParam("t1") String uname,
			@RequestParam("t2") String pwd, Model model) throws InvalidLoginException
	{
		System.out.println("ok");
		if(!uname.equalsIgnoreCase("admin"))
		{
	Customer c=	 service.login(uname, pwd);
	System.out.println(c);
		model.addAttribute("userInfoKey", c);
		if(c!=null)
		{
		return "customerPage";
		}
		}else if(uname.equalsIgnoreCase("admin") && pwd.equals("admin@123"))
		{
			model.addAttribute("adminKey", uname);
			return "adminPage";	
		}
		
		return "errorPage";
	}
	@RequestMapping("/viewMyProducts")
	public String getAllProducts(Model model) {
		
		List<Product> list=productService.viewAllProducts();
		model.addAttribute("productsKey",list);
		return "viewCustomerProducts";
		
	}
	
	
	
	
	
	
	
}
