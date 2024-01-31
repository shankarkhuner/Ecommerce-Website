package com.cyber.success.CSJ30SpringBootMVCDemo1.service;

import java.util.List;

import com.cyber.success.CSJ30SpringBootMVCDemo1.exception.InvalidLoginException;
import com.cyber.success.CSJ30SpringBootMVCDemo1.model.Customer;
import com.cyber.success.CSJ30SpringBootMVCDemo1.model.Product;

public interface CustoemrService {

	public Customer addCustomer(Customer customer);
	public Customer login(String uname, String pwd)throws InvalidLoginException;
	public int updateCustomer(long customerId, Customer newCustomer);
	public Customer  getCustomerById(long customerId);
	public List<Product> viewProducts();
	
	
	
	
}
