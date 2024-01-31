package com.cyber.success.CSJ30SpringBootMVCDemo1.service;

import java.util.List;

import com.cyber.success.CSJ30SpringBootMVCDemo1.exception.InvalidProductException;
import com.cyber.success.CSJ30SpringBootMVCDemo1.model.Product;

public interface ProductService {

	public Product addProduct(Product product);
	
     public List<Product> viewAllProducts();
     public Product getProductById(long productId)throws InvalidProductException;
     public int updateProduct(long productId, Product newProduct);
     public void deleteProduct(long productId);
     //adming will delete customer
     //admin will view registered customer
	
}
