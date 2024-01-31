package com.cyber.success.CSJ30SpringBootMVCDemo1.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="product_booking_table")
public class BookProduct {

	@Id
	@GeneratedValue
	private long bookingId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate bookingDate;
	@OneToOne
	private Customer customer;
	@OneToOne
	private Product product;
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public BookProduct(long bookingId, LocalDate bookingDate, Customer customer, Product product) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.customer = customer;
		this.product = product;
	}
	public BookProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BookProduct [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", customer=" + customer
				+ ", product=" + product + "]";
	}
	
	
	
	
}
