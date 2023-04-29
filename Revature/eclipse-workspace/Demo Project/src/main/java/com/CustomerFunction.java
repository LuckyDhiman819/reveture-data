package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.revature.prf.dao.CustomerDAO;
import com.revature.prf.dao.CustomerDAOImpl;
import com.revature.prf.dao.TransactioDAOImpl;
import com.revature.prf.exceptions.InSufficientAmountException;
import com.revature.prf.exceptions.InvalidAmountException;
import com.revature.prf.model.Transaction;
import com.revature.prf.dao.TransactionDAO;
import com.revature.prf.util.DBConnection;

public class CustomerFunction {
	int choice;
	Scanner sc=new Scanner(System.in);
	Connection connection=DBConnection.getDBConnection();
	ResultSet res;
	PreparedStatement statement;
	CustomerDAO customerDAO =new CustomerDAOImpl();
	TransactionDAO transactionDAO= new TransactioDAOImpl();
	
	public void startCustomerFunction(int customerId) {
		System.out.println("==== Welcome to Your Menu ====");
		
	
		while(true) {
			System.out.println("Press 1 ==> to Know your Balance");
			System.out.println("Press 2 ==> for withdraw Money");
			System.out.println("Press3 ==> for deposit Money");
			System.out.println("Press 4 ==> for transfer the Money");
			System.out.println("Press 5 ==> for Exit");
			System.out.println();
			System.out.println("Please Enter Your Choice");
			choice =sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Your Balance is : ==> "+customerDAO.getBalance(customerId));
				System.out.println();
				
				
				break;
			case 2:
				System.out.println("======Welcome to Withdraw Section=====");
				
				System.out.println("Enter the Amount to withdraw ==> ");
				int amount=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the Comment===>");
				String comment=sc.nextLine();
				
				
				try {
					customerDAO.withdraw(customerId,amount);
					Transaction transaction=new Transaction(customerId,amount,comment);
					transactionDAO.addWithdrawTransaction(transaction);
				} catch (InvalidAmountException e ) {
					System.out.println(e);					
				}catch (InSufficientAmountException e) {
					System.out.println(e);
				} catch (Exception e) {
					System.out.println(e);				
					}
				
					
					
				
				break;
			case 3:
				System.out.println();
				System.out.println("===Welcome to Deposit Menu==");
				System.out.println();
				System.out.println("Please Enter the amount you want to deposit ==>");		
				int amount2 = sc.nextInt();
				
				try {
					customerDAO.deposit(customerId,amount2);
					Transaction transaction=new Transaction(customerId,amount2);
					transactionDAO.addWithdrawTransaction(transaction);
				} catch (InvalidAmountException e ) {
					System.out.println(e);					
				}catch (InSufficientAmountException e) {
					System.out.println(e);
				} catch (Exception e) {
					System.out.println(e);
				}
				
				break;
			case 4:
				System.out.println();
				System.out.println("===Welcome to Transfer Menu==");
				System.out.println();
				System.out.println("Enter the Receivers ID ==>");
				int receiverId = sc.nextInt();
				System.out.println("Enter the Amount that you want to transfer ==>");
				int amountTransfer = sc.nextInt();
				try {
					customerDAO.transferMoney(customerId,amountTransfer,receiverId);
					Transaction transaction=new Transaction(customerId,amountTransfer,receiverId);
					transactionDAO.addTransferTransaction(transaction);
				} catch (InvalidAmountException e ) {
					System.out.println(e);					
				}catch (InSufficientAmountException e) {
					System.out.println(e);	
				} catch (Exception e ) {
					System.out.println(e);					
				}
				break;
			case 5:
				System.exit(0);
				break;

			default:
				System.out.println("Wrong Choice ! Please try Again");
				break;
			}
			
			
			
		}
	
	}
	
	

}
