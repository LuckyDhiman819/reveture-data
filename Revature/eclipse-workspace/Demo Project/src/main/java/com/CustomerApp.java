package com;

import java.util.Scanner;

import com.revature.prf.dao.CustomerDAO;
import com.revature.prf.dao.CustomerDAOImpl;
import com.revature.prf.dao.EmployeeDAO;
import com.revature.prf.dao.EmployeeDAOImpl;
import com.revature.prf.model.Customer;
import com.revature.prf.model.Employee;

public class CustomerApp {
	
	int choice;
	
	Scanner sc = new Scanner(System.in);
	CustomerDAO customerDAO=new CustomerDAOImpl();
	boolean result;
	Customer customer=new Customer();
	
	
	public void startCustomerApp() {
		
		System.out.println("===Welcome to Customer Section===");		
		while(true) {
			System.out.println("===Press 1 for SignUp===");
			System.out.println("===Press 2 for Login===");
			System.out.println("===Press 3 for Exit===");
			System.out.println();
			System.out.println("Please enter your choice");
			choice=sc.nextInt();	
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Wecome to Customer  Signup =  please enter these details for SignUp");
				customer = acceptCustomerDetailSignUp();
				result = customerDAO.addCustomer(customer);
				if (result)
					System.out.println(
							"#Customer with user name : " + customer.getCustomerName() + " , saved successfully");
				else {				
					System.out.println("#Customer with user name : " +customer.getCustomerName() + ", not saved successfully");
					System.out.println("Please Try Again");
				}

				
				break;
			case 2:
				System.out.println("Wecome to Customer Login =  please enter these details for Login");
				customer = acceptCustomerDetailsLogin();
				result = customerDAO.validateCustomer(customer);
				if(result==true) {
					System.out.println("Login CustomerId as "+customer.getCustomerId() +" Success");
					System.out.println();
					
					CustomerFunction customerFunction=new CustomerFunction();
					
					customerFunction.startCustomerFunction(customer.getCustomerId());
					
				}
				else
					System.out.println("Login Failed! Please Try Again");
				
				break;
			case 3:
				System.exit(0);
				
				break;
			

			default:
				System.out.println("Wrong Choice ! Try Again");
				break;
			}
		}
	}
	
	public Customer acceptCustomerDetailSignUp() {
		
		System.out.println("Enter Customer ID ==");
		int customerId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Customer Name ==");
		String customerName=sc.nextLine();
		System.out.println("Enter Customer Contact ==");
		int customerContact=sc.nextInt();
		System.out.println("Enter Customer Starting Balance ==");
		int customerBalance=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Customer Password ==");
		String customerPassword=sc.nextLine();
		System.out.println("Enter Customer Address ==");
		String customerAddress=sc.nextLine();
		
		Customer customer=new Customer(customerId, customerName, customerContact,customerBalance,customerPassword,customerAddress);
		return customer;
		
	}
	
	public Customer acceptCustomerDetailsLogin() {
		
		System.out.println("Enter Customer Id ==");
		int customerId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Customer Password ==");
		String customerPassword=sc.nextLine();
		Customer customer=new Customer(customerId,customerPassword);
		return customer;
	}

}
