package demos;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//USe case : I want display all the products from the database and display in java console. ( select * from products);
public class Demo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the table to print :");
		String tableName = sc.next();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet res = null;
		try {
			// 1. Load the appropriate driver (Installing driver)
			Class.forName("org.postgresql.Driver"); // Type 4 driver
			System.out.println("Driver loaded successfully");

			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"root");
			System.out.println("Connected  successfully");

			
			DatabaseMetaData dbmd = connection.getMetaData();
			
			System.out.println("IS DB READY ONLY :"+dbmd.isReadOnly());
			 statement = connection.createStatement();

			res = statement.executeQuery("select * from "+tableName);

			ResultSetMetaData rsmd = res.getMetaData();
			
			int columnCount = rsmd.getColumnCount();
			
			while (res.next()) {
				for (int i = 1; i <= columnCount; i++) {
					System.out.print(res.getString(i) + "    ");
				}
				
				System.out.println();
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not loaded successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				res.close();
				statement.close();
				connection.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
