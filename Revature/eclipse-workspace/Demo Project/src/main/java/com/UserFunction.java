package com;

import java.util.List;
import java.util.Scanner;


import com.revature.prf.dao.*;
import com.revature.prf.model.Customer;
import com.revature.prf.model.Employee;


public class UserFunction {
	int choice;
	Scanner sc=new Scanner(System.in);
	UserDAO userDAO =new UserDAOImpl();
	CustomerDAO customerDAO =new CustomerDAOImpl();
	EmployeeDAO employeeDAO =new EmployeeDAOImpl();
	CustomerApp customerApp=new CustomerApp();
	Customer customer;
	boolean result;
	public void startUserFunction() {
		System.out.println();
		System.out.println("===Welcome to Your Menu===");
		
		while(true) {

			System.out.println();
			System.out.println("Press 1 to get All Customers List==>");
			System.out.println("Press 2 to get All Employees List==>");
			System.out.println("Press 3 for Add new Customer ==>");
			System.out.println("Press 4 for Exit==>");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				List<Customer> customers = customerDAO.getAllCustomers();
			
				System.out.println("===Printing all the Customers===");
				System.out.println(customers);
				
				
				break;
			case 2:
				List<Employee> employees =employeeDAO.getAllEmployee();
				
				System.out.println("===Printing all the Employees===");
				System.out.println(employees);
				
				break;
			case 3:
				System.out.println("Now You Can Add a new Customer  ==>  please enter these details for SignUp");
				customer = customerApp.acceptCustomerDetailSignUp();
				result = customerDAO.addCustomer(customer);
				if (result)
					System.out.println(
							"#Customer with user name : " + customer.getCustomerName() + " , saved successfully");
				else {				
					System.out.println("#Customer with user name : " +customer.getCustomerName() + ", not saved successfully");
					System.out.println("Please Try Again");
				}
				
				break;
			case 4:
				System.exit(0);
				break;
			

			default:
				System.out.println("Wrong Choice ! Please Try Again");
				break;
			}
			
		}
	}

}
