package com.revature.training.jdbc.Project_0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


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
public class HandsOnUpdate 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Entre the account number to CREDIT the amount:-");int creditId = sc.nextInt();
    	System.out.println("Entre the account number to DEBIT the amount:-");int debittId = sc.nextInt();
    	System.out.println("Entre the amount to transfer");int amount = sc.nextInt();
    	Connection conection = null;
    	PreparedStatement statement = null;
    	ResultSet result = null;
    	int res = 0;
    	int res1 = 0;
    	
        try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver loaded sccesfully");
			
			conection  = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "root");
//			Connection conection  = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", null, null)
			System.out.println("conection lodded");
			
			statement = conection.prepareStatement("update hr.products set quantityOnHand = quantityOnHand - ? where productid = ?;");
			System.out.println("No error");
			statement.setInt(1, amount);
			statement.setInt(3, amount);
			statement.setInt(2, debittId);
			statement.setInt(4, creditId);
			
			
			res = statement.executeUpdate();
			System.out.println(res+" Rows updated");
			
			System.out.println("Transferred the INR "+amount+" From Account "+debittId+" to "+ creditId);
			
			statement.close();
			statement = conection.prepareStatement("select * from hr.accounts");
			result = statement.executeQuery();
			while(result.next()) {
				for(int i = 1; i<4; i++) {
					System.out.print(result.getString(i)+"  ");
				}
				System.out.println();
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        finally{
        	try {
				result.close();
				statement.close();
				conection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        	
        }
    	
    }
}
