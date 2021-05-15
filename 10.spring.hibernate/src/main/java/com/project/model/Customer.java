package com.project.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer implements Serializable {
	
	private static final long serialVersionUID = -659867171678898344L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;
	
	@Column
	private String customerName;
	@Column
	private String customerSurname;
	@Column
	private int customerPhoneNumber;
	@Column
	private String customerEmail;
	@Column
	private String customerPassword;

	
	public Customer() {
	}

	public Customer(String customerName, String customerSurname, int customerPhoneNumber,String customerPassword,String customerEmail) {
		this.customerName = customerName;
		this.customerSurname = customerSurname;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerPassword = customerPassword;
		this.customerEmail= customerEmail;
	}

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

	public String getCustomerSurname() {
		return customerSurname;
	}

	public void setCustomerSurname(String customerSurname) {
		this.customerSurname = customerSurname;
	}

	public int getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(int customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
}