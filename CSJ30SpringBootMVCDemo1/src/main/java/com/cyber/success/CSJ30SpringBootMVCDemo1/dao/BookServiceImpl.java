package com.cyber.success.CSJ30SpringBootMVCDemo1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyber.success.CSJ30SpringBootMVCDemo1.model.BookProduct;
import com.cyber.success.CSJ30SpringBootMVCDemo1.repository.BookProductRepository;
import com.cyber.success.CSJ30SpringBootMVCDemo1.service.BookProductService;
@Service
public class BookServiceImpl implements BookProductService {

	@Autowired
	private BookProductRepository repos;
	
	@Override
	public BookProduct addBookingInfo(BookProduct book) {

  BookProduct book1= repos.save(book);
		
		
		return book1;
	}

}
