package com.revature.pms.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.revature.pms.dao.CustomerDAO;
import com.revature.pms.model.Customer;
import com.revature.pms.model.Product;
import com.revature.pms.util.HibernateUtil;

public class CustomerDAOImpl implements CustomerDAO {

	private static Logger logger = Logger.getLogger("CustomerDAOImpl");
	
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	
	//Uday
	@Override
	public int addCustomer(Customer customer) {
		logger.info("###Printing customer name before saving : "+customer.getCustomerName()); //Uday
		Transaction transaction = session.beginTransaction();
		//new state 
		// transient state
		session.save(customer);					//Uday
		//persistent state
		int customerId = customer.getCustomerId();
		logger.info("###Printing customer name before saving : "+customer.getCustomerName()); //Isha
		transaction.commit();
		//detached
		customer.setCustomerName("Ahmed");
		return customerId;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		return true;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		Transaction transaction = session.beginTransaction();
		session.update(customer);
		transaction.commit();
		return true;
	}

	@Override
	public Customer getCustomerById(int customerId) {
		//new state
		Transaction transaction = session.beginTransaction();
		Customer customer =  (Customer) session.load(Customer.class, customerId);
		//new --> persistent
		customer.setBalance(9800);
		
		transaction.commit();
		return customer;
	}

	@Override
	public List<Customer> getCustomers() {
		Query query = session.createQuery("from com.revature.pms.model.Customer");
		List<Customer> customers = query.list();
		System.out.println(customers);
		return customers;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		Customer customer =  (Customer) session.get(Customer.class, customerId);
		if(customer ==null)
			return false;
		else
			return true;
	}

	//HQL - Hibernate Query Language
	//instead of working on tables and columns in works on POJOS and properties
	@Override
	public int viewBalance(int customerId) {
		Query query = session.createQuery("select balance from com.revature.pms.model.Customer where customerId = "+customerId);
		int balance = (int) query.list().get(0);
		logger.info("The balance for :"+customerId + " is "+balance);
		return balance;
	}

	@Override
	public int deposit(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int withdraw(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean transferAmount(int senderId, int receiverId, int amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateCustomer(int customerId, String password) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Customer where customerId = "+customerId+ " and password = '"+password + "'");
        if (query.list().size() == 0)
        {
          return false;
        }
        else
        {
          return true;
        }
	}

}
