package com.cyber.success.CSJ30SpringBootMVCDemo1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyber.success.CSJ30SpringBootMVCDemo1.exception.InvalidLoginException;
import com.cyber.success.CSJ30SpringBootMVCDemo1.model.Customer;
import com.cyber.success.CSJ30SpringBootMVCDemo1.model.Product;
import com.cyber.success.CSJ30SpringBootMVCDemo1.repository.CustomerRespository;
import com.cyber.success.CSJ30SpringBootMVCDemo1.service.CustoemrService;

@Service
public class CustomerServiceImpl implements CustoemrService {
	//inject the dependency of CustomerRepository
	@Autowired
	private CustomerRespository repos;

	@Override
	public Customer addCustomer(Customer customer) {
		
	Customer obj=	 repos.save(customer);
		return obj;
	}

	@Override
	public Customer login(String uname, String pwd)throws InvalidLoginException {
		Customer obj=repos.doLogin(uname, pwd);
		if(obj==null)
		{
			throw new InvalidLoginException("not able to login");
		}
		return  obj;
	}

	@Override
	public int updateCustomer(long customerId, Customer newCustomer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer getCustomerById(long customerId) {
Customer customerObj=	 repos.findById(customerId).get();
		return customerObj;
	}

	@Override
	public List<Product> viewProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
