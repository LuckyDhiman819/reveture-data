package com.revature.training.jdbc.Project_0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//USe case :
// 
//
public class SirHandsOn {
	public static void main(String[] args) {

		/*
		 * Enter the product id  : 3
		 * Enter the quantity to purchase : 5 
		 *
		 * 
		 * Total Bill is : 400
		 * 
		 * Thanks for using my app and stocks got updated and the current stocks for Sunscreen stands at : 115
		 */
		/*
		 * Enter the product id  : 4
		 * Enter the quantity to purchase : 40 
		 *
		 * 
		 * Total Bill is : 3200
		 * 
		 * Thanks for using my app and stocks got updated and the current stocks for Liner stands at : 110
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number to CREDIT the amount : ");
		int creditAccountNumber = sc.nextInt();
		System.out.println("Enter the account number to DEBIT the amount : ");
		int debitAccountNumber = sc.nextInt();
		System.out.println("Enter the amount to transfer : ");
		int amount = sc.nextInt();

		Connection connection = null;
		PreparedStatement statement = null;
		int res = 0;
		try {
			// 1. Load the appropriate driver (Installing driver)
			Class.forName("org.postgresql.Driver"); // Type 4 driver
			System.out.println("Driver loaded successfully");
			// 2. Creating
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
			System.out.println("Connected  successfully");

			//This is to debit the account
			statement = connection.prepareStatement("update hr.accounts set balance = balance - ? where id = ? ");
			statement.setInt(1, amount);
			statement.setInt(2, debitAccountNumber);
			statement.executeUpdate();
			
			statement.close();
			
			statement = connection.prepareStatement("update hr.accounts set balance = balance + ? where id = ? ");
			statement.setInt(1, amount);
			statement.setInt(2, creditAccountNumber);
			statement.executeUpdate();

			System.out.println("Transferred INR :"+amount +" from account : "+debitAccountNumber+" to account : "+creditAccountNumber );

		} catch (

		ClassNotFoundException e) {
			System.out.println("Driver not loaded successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {

				statement.close();
				connection.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
