package com.revature.prf.dao;

import java.util.List;

import com.revature.prf.model.Customer;
import com.revature.prf.model.Employee;

public interface CustomerDAO {
	public boolean addCustomer(Customer customer);
	public boolean validateCustomer(Customer customer);
	
	public boolean deleteCustomer(int customerId);
	public List<Customer> getCustomerByName(String customerName);

	public Customer getCustomerById(int customerId); 
	
	public List<Customer>  getAllCustomers();
	public int getBalance(int customerId);
	public void withdraw(int customerId,int balance);
	public void deposit(int customerId,int amount);
	public void transferMoney(int customerId,int transferredAmount,int receiverId);

	

}
