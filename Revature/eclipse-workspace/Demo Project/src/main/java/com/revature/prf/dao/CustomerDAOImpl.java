package com.revature.prf.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.prf.exceptions.InSufficientAmountException;
import com.revature.prf.exceptions.InvalidAmountException;
import com.revature.prf.model.Customer;
import com.revature.prf.model.Employee;
import com.revature.prf.util.DBConnection;

public class CustomerDAOImpl implements CustomerDAO {

	Scanner sc = new Scanner(System.in);
	PreparedStatement statement;
	ResultSet res;
	boolean result;

	Connection connection = DBConnection.getDBConnection();
	private final String ADD_CUSTOMER_SQL_QUERY = "insert into customers(customerId,customerName,customerContact,customerBalance,customerPassword,customerAddress) values(?,?,?,?,?,?)";
	private final String GET_BALANCE_SQL_QUERY = "select customerBalance from customers where customerId=?";
	private final String FIND_CUSTOMER_BY_NAME_SQL_QUERY="select * from customers where customerName=?";
	private final String FIND_CUSTOMER_BY_ID_SQL_QUERY="select * from customers where customerId=?";
	private final String DELETE_CUSTOMER_SQL_QUERY="delete from customers where customerId=?";
	private final String WITHDRAW_AMOUNT_SQL_QUERY = "UPDATE customers set customerBalance=customerBalance-? where customerId=?";
	private final String DEPOSIT_AMOUNT_SQL_QUERY = "UPDATE customers set customerBalance=customerBalance+? where customerId=?";
	private final String GET_ALL_CUSTOMERS_SQL_QUERY = "select * from customers";

	public boolean addCustomer(Customer customer) {
		int res = 0;

		try {
			PreparedStatement statement = connection.prepareStatement(ADD_CUSTOMER_SQL_QUERY);
			statement.setInt(1, customer.getCustomerId());
			statement.setString(2, customer.getCustomerName());
			statement.setInt(3, customer.getCustomerContact());
			statement.setInt(4, customer.getCustomerBalance());
			statement.setString(5, customer.getCustomerPassword());
			statement.setString(6, customer.getCustomerAddress());
			res = statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (res == 0)
			return false;
		else
			return true;
	}

	public boolean validateCustomer(Customer customer) {
		try {
			connection = DBConnection.getDBConnection();
			statement = connection
					.prepareStatement("select * from customers where customerId=? and customerPassword=?");

			statement.setInt(1, customer.getCustomerId());
			statement.setString(2, customer.getCustomerPassword());

			res = statement.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			result = res.next();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	int balance;

	public int getBalance(int customerId) {

		try {
			statement = connection.prepareStatement(GET_BALANCE_SQL_QUERY);
			statement.setInt(1, customerId);

			res = statement.executeQuery();
			while (res.next()) {
				balance = res.getInt("customerBalance");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (balance != 0)
			return balance;
		else {
			System.out.println("Something went Wrong ! Please try Again");
			return 0;
		}

	}

	public void withdraw(int customerId,int amount) {
		
		int row;
		if (amount <= 0) {
			throw new InvalidAmountException("Negative  Balance ! Please try Again");

		} else {
			int totalBalance = getBalance(customerId);
			if (totalBalance - amount < 0)
				throw new InSufficientAmountException("InSufficient Balance! Please try Again");
			else {
				try {
					statement = connection.prepareStatement(WITHDRAW_AMOUNT_SQL_QUERY);
					
					statement.setInt(2, customerId);
					statement.setInt(1, amount);
					row = statement.executeUpdate();
					if (row == 1)
						System.out.println("Amount of INR " + amount + " withdrawn Successfully");
					else
						System.out.println("Something went Wrong Try Again");

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

	public void deposit(int customerId,int amount)  {
		int row = 0;
		
		
		if (amount <= 0) {
			
			throw new InvalidAmountException("Negative  Balance ! Please try Again");
		}
		else {
			try {
				statement = connection.prepareStatement(DEPOSIT_AMOUNT_SQL_QUERY);
				statement.setInt(1, amount);
				statement.setInt(2, customerId);
				row = statement.executeUpdate();
				if (row == 1)
					System.out.println("Amount of INR " + amount + " deposited Successfully");
				else
					System.out.println("Something went Wrong Try Again");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void transferMoney(int customerId,int amountTransfer,int receiverId)  {
		
		if (amountTransfer <= 0)
			throw new InvalidAmountException("Negative  Balance ! Please try Again");
		else {
			int totalBalance = getBalance(customerId);
			if (totalBalance - amountTransfer < 0) {
				throw new InSufficientAmountException("InSufficient Balance! Please try Again");
			} else {
				int debitorBalance=0,creditorBalance=0;
				try {
					
//					statement = connection.prepareStatement("update customers set customerBalance=customerBalance-? where customerId=?");
//					statement.setInt(1, amountTransfer);
//					statement.setInt(2, customerId);
//					int resSender = statement.executeUpdate();
//
//					statement = connection.prepareStatement("update customers set customerBalance=customerBalance+? where customerId=?");
//					statement.setInt(1, amountTransfer);
//					statement.setInt(2, receiverId);
//					int resReceiver = statement.executeUpdate();
//
//					if (resSender == 1 && resReceiver == 1) {
//						System.out.println("Amount of INR " + amountTransfer + " transferred from ID " + customerId
//								+ " to ID" + receiverId + " Successfully");
//					}
					
					
					
					//sir code for CallableStatement Interface
					
					CallableStatement statement=connection.prepareCall("call bankapp.transferAmountAndReturnBalance3(?,?,?,?,?)");
					statement.setInt(1, customerId);
					statement.setInt(2, receiverId);
					statement.setInt(3, amountTransfer);
					statement.registerOutParameter(4, Types.INTEGER);
					statement.setInt(4, debitorBalance);
					statement.registerOutParameter(5, Types.INTEGER);
					statement.setInt(5, creditorBalance);
				
					
					statement.execute();
					debitorBalance=statement.getInt(4);
					creditorBalance=statement.getInt(5);
					
					
					
					
					
					
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println("Amount of INR " + amountTransfer + " transferred from ID " + customerId
						+ " to ID " + receiverId + " Successfully");
				System.out.println("Updated Balance :==>");
				System.out.println("Debitor's Balance : ==> "+debitorBalance);
				System.out.println("Creditor's Balance : ==> "+creditorBalance);
			}
		}

	}

	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<Customer>();

		try {
			Statement statement = connection.createStatement();
			ResultSet res = statement.executeQuery(GET_ALL_CUSTOMERS_SQL_QUERY);
			while (res.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(res.getInt(1));
				customer.setCustomerName(res.getString(2));
				customer.setCustomerContact(res.getInt(3));
				customer.setCustomerBalance(res.getInt(4));
				customer.setCustomerAddress(res.getString(6));
				customer.setCustomerStatus(res.getString(7));
				// product
				// add product to products list
				customers.add(customer);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customers;
	}

	public boolean deleteCustomer(int customerId) {

		boolean result = false;

		try {
			PreparedStatement stat = connection.prepareStatement(DELETE_CUSTOMER_SQL_QUERY);
			stat.setInt(1, customerId);

			stat.executeUpdate();
			result = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	public List<Customer> getCustomerByName(String customerName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer getCustomerById(int customerId) {
		Customer customer = new Customer();

		PreparedStatement stat = null;
		try {
			stat = connection.prepareStatement(FIND_CUSTOMER_BY_ID_SQL_QUERY);
			stat.setInt(1, customerId);
			ResultSet res = stat.executeQuery();
			res.next();

			customer.setCustomerId(res.getInt(1));
			customer.setCustomerName(res.getString(2));
			customer.setCustomerContact(res.getInt(3));
			customer.setCustomerBalance(res.getInt(4));
			customer.setCustomerPassword(res.getString(5));
			customer.setCustomerAddress(res.getString(6));
//			customer.setCustomerBalance(res.getInt(7));

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return customer;
	}

}
