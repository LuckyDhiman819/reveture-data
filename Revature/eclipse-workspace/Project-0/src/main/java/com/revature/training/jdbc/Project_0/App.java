package com.revature.training.jdbc.Project_0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Connection conection = null;
    	Statement statement = null;
    	ResultSet res = null;
        try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver loaded sccesfully");
			
			conection  = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "root");
//			Connection conection  = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", null, null)
			System.out.println("conection lodded");
			
			statement = conection.createStatement();
			System.out.println("No error");
			
			res = statement.executeQuery("select * from hr.employees");
			System.out.println("No error again");
//			System.out.println(res);
			while(res.next()) {
				for(int i = 1; i<5; i++) {
					System.out.print(res.getString(i)+"  ");
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
				res.close();
				statement.close();
				conection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        	
        }
    	
    }
}
