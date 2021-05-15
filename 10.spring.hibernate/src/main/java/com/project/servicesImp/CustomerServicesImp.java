package com.project.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ICustomerDao;
import com.project.daoImp.CustomerDao;
import com.project.model.Customer;
import com.project.services.CustomerServices;

@Service
public class CustomerServicesImp implements CustomerServices {
	//------------------------------------------------------------------
	@Autowired
	ICustomerDao customerDao = new CustomerDao();
	//------------------------------------------------------------------
	public List<Customer> findAllCustomer() {
		return customerDao.findAllCustomer();
	}
	//------------------------------------------------------------------
	public Customer findCustomerById(long customerId) {
		return customerDao.findCustomerById(customerId);
	}
	//------------------------------------------------------------------
	public List<Customer> findCustomersByName(String customerName) {
		return customerDao.findCustomersByName(customerName);
	}
	//------------------------------------------------------------------
	public void createCustomer(Customer customer) {
		customerDao.createCustomer(customer);
	}
	//------------------------------------------------------------------
	public void removeCustomer(long customerId) {
		customerDao.removeCustomer(customerId);
	}
	@Override
	public Customer updateCustomer(Customer customer) {
		customerDao.updateCustomer(customer);
		return customer;
	}
}
