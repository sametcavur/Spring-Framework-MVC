package com.project.daoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.project.dao.ICustomerDao;
import com.project.model.Customer;

@Repository
@Transactional
public class CustomerDao implements ICustomerDao {
	//------------------------------------------------------------------
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-test");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	//------------------------------------------------------------------
	public List<Customer> findAllCustomer() {
		TypedQuery<Customer> query = this.entityManager.createQuery ("SELECT c FROM Customer c",Customer.class);
		List<Customer> customers = query.getResultList();
		return customers;
		}
	//------------------------------------------------------------------	
	public Customer findCustomerById(long customerId) {
		TypedQuery<Customer> query = this.entityManager.createQuery ("SELECT c FROM Customer c WHERE c.customerId =:customerId",Customer.class);
		query.setParameter("customerId", customerId);
		Customer customer = query.getSingleResult();
		return customer;
	}
	//------------------------------------------------------------------
	public List<Customer> findCustomersByName(String customerName) {
		TypedQuery<Customer> query = this.entityManager.createQuery ("SELECT c FROM Customer c WHERE c.customerName =:customerName",Customer.class);
		query.setParameter("customerName", customerName);
		List<Customer> customers = query.getResultList();
		return customers;
	}
	//------------------------------------------------------------------
	public void createCustomer(Customer customer) {
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
	}
	//------------------------------------------------------------------
	public void removeCustomer(long customerId) {
		Customer customer = entityManager.find(Customer.class, customerId);
		entityManager.getTransaction().begin();
		entityManager.remove(customer);
		entityManager.getTransaction().commit();
	}
	@Override
	public Customer updateCustomer(Customer customer) {
		Customer c = entityManager.find(Customer.class,customer);
		entityManager.getTransaction().begin();
		entityManager.merge(c);
		entityManager.getTransaction().commit();
		return null;
	}
}