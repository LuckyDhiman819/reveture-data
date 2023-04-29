package com.revature.training.pms.service;

import java.util.List;

import com.revature.pms.dao.CustomerDAO;
import com.revature.pms.dao.impl.CustomerDAOImpl;
import com.revature.pms.model.Customer;
import com.revature.pms.model.Product;

public class CustomerServiceImpl implements CustomerService {

	CustomerDAO customerDAO = new CustomerDAOImpl();
	@Override
	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDAO.addCustomer(customer);
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.deleteCustomer(customerId);
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDAO.updateCustomer(customer);
	}

	@Override
	public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomerById(customerId);
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers();
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.isCustomerExists(customerId);
	}

	@Override
	public int viewBalance(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.viewBalance(customerId);
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
		// TODO Auto-generated method stub
		return customerDAO.validateCustomer(customerId, password);
	}

}
