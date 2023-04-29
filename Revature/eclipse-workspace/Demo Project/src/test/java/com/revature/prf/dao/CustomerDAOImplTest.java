package com.revature.prf.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.prf.model.Customer;

public class CustomerDAOImplTest {
	private CustomerDAO customerDAO;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		customerDAO=new CustomerDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
		customerDAO=null;
	}

	@Test
	public void testAddCustomer() {
//		// Testing adding a product
//		int customerIdToTest = 98989;
//
//		// Adding a dummy product to test Product addedProduct = new
//		Customer addedCustomer = new Customer(customerIdToTest,"Bhuwan",9857465,5000,"Bhuwan@123","Bhopal");
//		customerDAO.addCustomer(addedCustomer);
//		System.out.println(addedCustomer);
//		// Retrieving the product to test Product retrievedProduct =
//		Customer retrievedCustomer=customerDAO.getCustomerById(customerIdToTest);
//		System.out.println(retrievedCustomer);
//		assertEquals(addedCustomer,retrievedCustomer);
//
//		// deleting the product after testing
//		customerDAO.deleteCustomer(customerIdToTest);
		
		int customerIdToTest = -999;
		List<Customer> originalCustomer1 =customerDAO.getAllCustomers();
		customerDAO.addCustomer(new Customer(customerIdToTest,"Bhuwan",9857465,5000,"Bhuwan@123","Bhopal"));
		List<Customer> originalCustomer2 = customerDAO.getAllCustomers();

		assertEquals(originalCustomer2.size(), originalCustomer1.size() + 1);

		customerDAO.deleteCustomer(customerIdToTest);
		
		
		
		
	}

	@Test
	public void testValidateCustomer() {
		int customerId=1;
		String password="jayant@123";
		boolean result1=true;
		boolean result2;
		Customer customer = new Customer(customerId,password);
		
		result2=customerDAO.validateCustomer(customer);
		assertEquals(result1, result2);
	}

	@Test
	public void testGetBalance() {
		int startingBalance=5000;
		int customerIdToTest = -999;
		customerDAO.addCustomer(new Customer(customerIdToTest,"Bhuwan",9857465,startingBalance,"Bhuwan@123","Bhopal"));
		int retrievedBalance=customerDAO.getBalance(customerIdToTest);
		assertEquals(startingBalance, retrievedBalance);
		customerDAO.deleteCustomer(customerIdToTest);
	}

	@Test
	public void testWithdraw() {
		int startingBalance=5000;
		int balanceToWithdraw=500;
		int customerIdToTest = -999;
		int oldBalance=startingBalance-balanceToWithdraw;
		customerDAO.addCustomer(new Customer(customerIdToTest,"Bhuwan",9857465,startingBalance,"Bhuwan@123","Bhopal"));
		customerDAO.withdraw(customerIdToTest,balanceToWithdraw);
		int newBalance=customerDAO.getBalance(customerIdToTest);
		assertEquals(oldBalance, newBalance);
		
		customerDAO.deleteCustomer(customerIdToTest);
	}

	@Test
	public void testDeposit() {
		int startingBalance=5000;
		int balanceToDeposit=500;
		int customerIdToTest = -999;
		int addedBalance=startingBalance+balanceToDeposit;
		customerDAO.addCustomer(new Customer(customerIdToTest,"Bhuwan",9857465,startingBalance,"Bhuwan@123","Bhopal"));
		customerDAO.deposit(customerIdToTest, balanceToDeposit);
		int retrievedBalance=customerDAO.getBalance(customerIdToTest);
		assertEquals(addedBalance, retrievedBalance);
		
		customerDAO.deleteCustomer(customerIdToTest);
		
	}

	@Test
	public void testTransferMoney() {
		fail("Not yet implemented");
		
		
	}

	@Test
	public void testGetAllCustomers() {
		// Testing getting all products;
		int customerIdToTest = -999;
		List<Customer> originalCustomer1 =customerDAO.getAllCustomers();
		customerDAO.addCustomer(new Customer(customerIdToTest,"Bhuwan",9857465,5000,"Bhuwan@123","Bhopal"));
		List<Customer> originalCustomer2 = customerDAO.getAllCustomers();

		assertEquals(originalCustomer2.size(), originalCustomer1.size() + 1);

		customerDAO.deleteCustomer(customerIdToTest);	}

	@Test
	public void testDeleteCustomer() {
		// Testing getting all products;
				int customerIdToTest = -999;
				
				customerDAO.addCustomer(new Customer(customerIdToTest,"Bhuwan",9857465,5000,"Bhuwan@123","Bhopal"));
				List<Customer> originalCustomer1 =customerDAO.getAllCustomers();
				customerDAO.deleteCustomer(customerIdToTest);
				List<Customer> originalCustomer2 = customerDAO.getAllCustomers();

				assertEquals(originalCustomer2.size()+1, originalCustomer1.size() );

				customerDAO.deleteCustomer(customerIdToTest);
		
		
	}

	@Test
	public void testGetCustomerByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomerById() {
		// Testing getting a single
				int customerIdToTest = -999;

				// Adding a dummy product to test Product addedProduct = new
				Customer addedCustomer = new Customer(customerIdToTest,"Bhuwan",9857465,5000,"Bhuwan@123","Bhopal");
				customerDAO.addCustomer(addedCustomer);

				// Retrieving the product to test Product retrievedProduct =
				customerDAO.getCustomerById(-999);

				// testing assertEquals( addedProduct, retrievedProduct);

				// deleting the product after testing
				customerDAO.deleteCustomer(customerIdToTest);
	}

}
