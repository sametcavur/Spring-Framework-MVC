package com.project.dao;

import java.util.List;

import com.project.model.Customer;

public interface ICustomerDao {
	
	public List<Customer> findAllCustomer();
	
	public Customer findCustomerById(long customerId);
	
	public List<Customer> findCustomersByName(String customerName);
	
	public void createCustomer(Customer customer);
	
	public void removeCustomer(long customerId);
	
	public Customer updateCustomer(Customer customer);

}
