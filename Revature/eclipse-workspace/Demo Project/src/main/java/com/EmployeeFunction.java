package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.prf.dao.CustomerDAO;
import com.revature.prf.dao.CustomerDAOImpl;
import com.revature.prf.dao.TransactioDAOImpl;
import com.revature.prf.dao.TransactionDAO;
import com.revature.prf.model.Transaction;



public class EmployeeFunction {
	int choice;
	Scanner sc=new Scanner(System.in);	
	CustomerDAO customerDAO=new CustomerDAOImpl();
	TransactionDAO transactionDAO=new TransactioDAOImpl();
	
	public void startEmployeeFunction() {
		System.out.println("==== Welcome to Your Menu ====");
		System.out.println();	
		while(true) {
			System.out.println("Press 1 ==> to Know Customer Balance");
			System.out.println("Press 2 ==> Print Log of Transactions");
			System.out.println("Press3 ==> Approval/Rejection of New Account");
			System.out.println("Press 4 ==> for Exit");
			System.out.println();
			System.out.println("Please Enter Your Choice");
			choice =sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println(" Please Enter the Customer Id to know the Balanace ==");
				int customerId=sc.nextInt();
				int balance=customerDAO.getBalance(customerId);
				System.out.println("Balace Of Account having ID"+customerId+" is "+balance);
				
				
				
				
				break;
			case 2:
				System.out.println("=====Printing Log Of All Transactions=====");
				List<Transaction> transactions=new ArrayList<Transaction>();
				transactions=transactionDAO.getAllTransaction();
				System.out.println(transactions);				
					
				
				break;
			case 3:
				
				
				break;
			case 4:
				
				System.exit(0);
				break;
	
			default:
				System.out.println("Wrong Choice ! Please try Again");
				break;
			}
			
			
			
		}
	}
}
