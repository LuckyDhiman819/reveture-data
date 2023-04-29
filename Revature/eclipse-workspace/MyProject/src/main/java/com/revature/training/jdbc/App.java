package com.revature.training.jdbc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	    try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Class Loded succesfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
