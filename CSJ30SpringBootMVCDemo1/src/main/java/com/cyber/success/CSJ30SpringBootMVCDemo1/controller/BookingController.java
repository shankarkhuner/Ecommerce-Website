package com.cyber.success.CSJ30SpringBootMVCDemo1.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cyber.success.CSJ30SpringBootMVCDemo1.dao.BookServiceImpl;
import com.cyber.success.CSJ30SpringBootMVCDemo1.dao.CustomerServiceImpl;
import com.cyber.success.CSJ30SpringBootMVCDemo1.dao.ProductServiceImpl;
import com.cyber.success.CSJ30SpringBootMVCDemo1.exception.InvalidProductException;
import com.cyber.success.CSJ30SpringBootMVCDemo1.model.BookProduct;
import com.cyber.success.CSJ30SpringBootMVCDemo1.model.Customer;
import com.cyber.success.CSJ30SpringBootMVCDemo1.model.Product;

@Controller
public class BookingController {
	@Autowired
	private BookServiceImpl bookingService;

	@Autowired
	private ProductServiceImpl  productService;
	
	@Autowired
	private CustomerServiceImpl customerService;
	
	@RequestMapping("bookProduct/{pId}")
	public String bookProduct(@PathVariable  long pId, Model model) throws InvalidProductException
	{
		Product p=productService.getProductById(pId);
		model.addAttribute("bookedProductKey",p);
		return "reviewBookedProduct";
	}
	@RequestMapping(path="/finalBook/{pId}/{cId}")
	public String getBookig(@PathVariable long pId, @PathVariable long cId, Model model) throws InvalidProductException
	{
		
		BookProduct book=new BookProduct();
		book.setBookingDate(LocalDate.now());
		Product p=productService.getProductById(pId);
		Customer c=customerService.getCustomerById(cId);
		book.setProduct(p);
		book.setCustomer(c);
		System.out.println(book);
	BookProduct bp=	bookingService.addBookingInfo(book);
	model.addAttribute("bookKey", bp);
		return "BookedProduct";
		
		
		
		
		
	}
}
