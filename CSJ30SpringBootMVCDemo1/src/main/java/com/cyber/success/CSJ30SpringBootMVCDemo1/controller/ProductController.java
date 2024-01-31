package com.cyber.success.CSJ30SpringBootMVCDemo1.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cyber.success.CSJ30SpringBootMVCDemo1.dao.ProductServiceImpl;
import com.cyber.success.CSJ30SpringBootMVCDemo1.exception.InvalidProductException;
import com.cyber.success.CSJ30SpringBootMVCDemo1.model.Product;

@Controller
@SessionAttributes("products")
public class ProductController {
	@Autowired
	private ProductServiceImpl service;
	/*
	 * @ModelAttribute is an annotation in spring mvc framework
	 * which can be used with method and with method parameter
	 * If we use @ModelAttribute with method then that method will
	 * be invoked before any web method which are annotated with
	 * @RequestMapping, @GetMapping, @PostMapping or @PutMapping e.t.c
	 * 
	 *  @ModelAttribute annotated method binds the specific object with Model 
	 *  obejct with
	 *  given key name
	 *  and maintain that object for the current reuquest scope
	 *  
	 *  Model Interface:
	 *  Model is an interface which is used to bind any object with given key name
	 *    addAttribute(String keyName, Object obj)
	 *    
	  
	 */
	
	/*@ModelAttribute("product")
	public Product createProduct()
	{
		return new Product(108, "Laptop", LocalDate.parse("2023-09-12"), 56000.00);
	}*/
	
	@RequestMapping(path="/createProduct")
	public String dispalyProductForm()
	{
		return "createProduct";
	}
	/*
	 * If I will use @ModelAttribute annotation with method parameter, then
	 * It binds the specific object with the parameterized variable
	 * It also set the values with that object
	 * It also bind the object with model by calling addAttribute(String key, Object obj)
	 * which will be avaiable for current request scope
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	@RequestMapping(path="/addProduct", method=RequestMethod.POST)
	@ResponseBody
	public String createProduct(@ModelAttribute Product product,Model model) throws IOException
	{
		//E:\abc\myimage.png
		//First I will read file from given url and  write that file into app context
		//"./src/main/resources/static/images/productName.png
		String filePath=product.getProductImage();
		System.out.println(filePath);
		FileInputStream input=new FileInputStream(filePath);
	String[] str=	    filePath.split("\\.");
	String finalPath=
			"./src/main/resources/static/images/"+product.getProductName()+"."+str[1];	
	//System.out.println(finalPath);	
	int k=0;
	FileOutputStream fout=new FileOutputStream(finalPath);
	while((k=input.read())!=-1)
	{
		fout.write(k);
	}
		product.setProductImage(finalPath);
		
	
		model.addAttribute("products", product);
		service.addProduct(product);
		return "product added sucessfully" + " "+"final path:"+finalPath ;
	}
	
	/*
	 * ModelAndView is class which resides inside org.springframework.web.servlet package
	 * ModelAndView object provides several methods to bind object with model and\
	 *  bind the view name
	 *  
	 *  addObject(String keyName, Object obj)--void
	 *  setViewName(String viewName)---void
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@GetMapping("/viewAllProduct")
	public ModelAndView getAllProduct()
	{
		ModelAndView mv=new ModelAndView();
		List<Product> list=service.viewAllProducts();
		mv.addObject("products",list);
		mv.setViewName("viewPrduct");
		return mv;
	}
	//editProduct/108
	/*
	 * @PathVariable annotation  is fetch the value from request url and initialize that
	 * value to the parameterized variable of method
	 * It is method parameter level annotation
	 * 
	 * 
	 */
	@RequestMapping(path="editProduct/{pId}")
	public String getProductById(@PathVariable long pId, Model model) throws InvalidProductException
	{
		Product p=service.getProductById(pId);
		
		model.addAttribute("productKey", p);
		return "editProduct";
		
	}
	@RequestMapping(path="/CSJ30SpringBootMVCDemo1/updateProduct", 
			method=RequestMethod.POST)
	@ResponseBody
	public String updateMyProduct(@ModelAttribute Product product, Model model)
	{
int status=		service.updateProduct(product.getProductId(), product);
if(status>0)
{
	return "Product updated sucessfully";
}
		return "not able to update";
	}
	/*
	 * @PathVariable annotation is used to bind the url parameter value with method 
	 * parameter  
	 * 
	 * 
	 * 
	 */
	@RequestMapping(path="deleteProduct/{pId}")
	public String deleteById(@PathVariable("pId") long pid)
	{
		service.deleteProduct(pid);
		return "viewPrduct";
	}
	
}
