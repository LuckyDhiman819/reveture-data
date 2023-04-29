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
public class UpdateProduts 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Entre the product id:-");int productId = sc.nextInt();
    	System.out.println("Entre the quantity to purchase");int quantity = sc.nextInt();
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
			statement.setInt(1, quantity);
			statement.setInt(2, productId);
			
			
			res = statement.executeUpdate();
//			System.out.println(res+" Rows updated");
			if(res==0) {
				System.out.println("Quantity is out of stock");
			}
			else {
				System.out.println("Thank you for puchase");
			}
			
			statement.close();
			statement = conection.prepareStatement("select price from hr.products where productid = ?");
			statement.setInt(1, productId);
			result = statement.executeQuery();
			result.next();
				System.out.println("Your Bill is "+result.getInt(1)*productId);
				System.out.println();
			
			
			
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
