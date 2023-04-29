package com.revature.prf.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.prf.model.Employee;

public class EmployeeDAOImplTest {
	private EmployeeDAO employeeDAO;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		employeeDAO=new EmployeeDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
		employeeDAO=null;
	}


	@Test
	public void testAddEmployee() {
		
		
//		int employeeIdToTest=-99;
//		
//		Employee addedEmployee=new Employee(employeeIdToTest,"Dummy",9854621,"Abc@123","Nadwasarai");
//		employeeDAO.addEmployee(addedEmployee);
//		
//		Employee retrievedEmployee=employeeDAO.getEmployeeById(employeeIdToTest);
//		
//		assertEquals(addedEmployee,retrievedEmployee);
//		
//		employeeDAO.deleteEmployee(employeeIdToTest);
		
		// Testing getting all products;
				int employeeIdToTest = -999;
				List<Employee> originalEmployee1 =employeeDAO.getAllEmployee();
				employeeDAO.addEmployee(new Employee(employeeIdToTest, "Kumar", 9856423, "Kumar@123", "Mau"));
				List<Employee> originalEmployee2 = employeeDAO.getAllEmployee();

				assertEquals(originalEmployee2.size(),originalEmployee1.size() + 1);

				employeeDAO.deleteEmployee(employeeIdToTest);
	}


	@Test
	public void testUpdateCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllEmployee() {
		// Testing getting all products;
		int employeeIdToTest = -999;
		List<Employee> originalEmployee1 =employeeDAO.getAllEmployee();
		employeeDAO.addEmployee(new Employee(employeeIdToTest, "Kumar", 9856423, "Kumar@123", "Mau"));
		List<Employee> originalEmployee2 = employeeDAO.getAllEmployee();

		assertEquals(originalEmployee2.size(),originalEmployee1.size() + 1);

		employeeDAO.deleteEmployee(employeeIdToTest);
	}

	@Test
	public void testValidateEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteEmployee() {
		// Testing getting all products;
				int employeeIdToTest = -999;
				
				employeeDAO.addEmployee(new Employee(employeeIdToTest, "Kumar", 9856423, "Kumar@123", "Mau"));
				List<Employee> originalEmployee1 =employeeDAO.getAllEmployee();
				employeeDAO.deleteEmployee(employeeIdToTest);
				List<Employee> originalEmployee2 = employeeDAO.getAllEmployee();

				assertEquals(originalEmployee2.size()+1,originalEmployee1.size());

				
	}

	@Test
	public void testGetEmployeeByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEmployeeById() {
		// Testing getting a single
		int employeeIdToTest = -999;

		// Adding a dummy product to test Product addedProduct = new
		Employee addedEmployee = new Employee(employeeIdToTest, "Kumar", 98563, "Kumar@123", "Mau");
		employeeDAO.addEmployee(addedEmployee);

		// Retrieving the product to test Product retrievedProduct =
		employeeDAO.getEmployeeById(-999);

		// testing assertEquals( addedProduct, retrievedProduct);

		// deleting the product after testing
		employeeDAO.deleteEmployee(employeeIdToTest);
		
	}

}
