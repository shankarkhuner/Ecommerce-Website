package com.cyber.success.CSJ30SpringBootMVCDemo1.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="web_customer")
public class Customer {
	@Id
	@SequenceGenerator(name = "customerSeq", allocationSize = 5, initialValue = 1000)
	@GeneratedValue(generator = "customerSeq", strategy = GenerationType.SEQUENCE)
	private long customerId;
	private String customerName;
	@Column(unique = true)
	private String userName;
	@Column(unique = true)
	private String userPassword;
	@Column(unique = true)
	private long phoneNumber;
	@Column(unique = true)
	private String emailId;
	@OneToOne(cascade = CascadeType.ALL)

	private Address address;
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", userName=" + userName
				+ ", userPassword=" + userPassword + ", phoneNumber=" + phoneNumber + ", emailId=" + emailId
				+ ", address=" + address + "]";
	}
	

}
