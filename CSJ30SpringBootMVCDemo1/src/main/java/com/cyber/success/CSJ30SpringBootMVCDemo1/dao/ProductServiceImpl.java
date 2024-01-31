package com.cyber.success.CSJ30SpringBootMVCDemo1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cyber.success.CSJ30SpringBootMVCDemo1.exception.InvalidProductException;
import com.cyber.success.CSJ30SpringBootMVCDemo1.model.Product;
import com.cyber.success.CSJ30SpringBootMVCDemo1.repository.ProductRepository;
import com.cyber.success.CSJ30SpringBootMVCDemo1.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;
	@Override
	public Product addProduct(Product product) {
		
	Product productObj=	repository.save(product);
		return productObj;
	}

	@Override
	public List<Product> viewAllProducts() {
	List<Product> listOfProducts=	 repository.findAll();
		return listOfProducts;
	}

	@Override
	public Product getProductById(long productId) throws InvalidProductException {
		//Optional findById(long)
		//repository.getById(productId);
		
		if(repository.existsById(productId))
		{
		
	Product product	= repository.findById(productId).get();
		return product;
		}
		{
			throw new InvalidProductException("not able to get product");
		}
	}

	@Override
	public int updateProduct(long productId, Product newProduct) {
		
	return	 repository.updateMyProduct(productId, newProduct.getProductPrice(), newProduct.getProductName());
		
	}

	@Override
	public void deleteProduct(long productId) {
     repository.deleteMyProduct(productId);

		
	}

}
