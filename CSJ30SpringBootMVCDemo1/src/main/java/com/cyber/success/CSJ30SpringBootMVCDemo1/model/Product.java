package com.cyber.success.CSJ30SpringBootMVCDemo1.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="product_table")
public class Product {
	@Id
	private long productId;
	@Column(unique = true)
	private String productName;
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private LocalDate productMfd;
	private double productPrice;
	private String productImage;
	
	
	
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public LocalDate getProductMfd() {
		return productMfd;
	}
	public void setProductMfd(LocalDate productMfd) {
		this.productMfd = productMfd;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public Product(long productId, String productName, LocalDate productMfd, double productPrice, String productImage) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productMfd = productMfd;
		this.productPrice = productPrice;
		this.productImage = productImage;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productMfd=" + productMfd
				+ ", productPrice=" + productPrice + ", productImage=" + productImage + "]";
	}
	
	
	
	

}
