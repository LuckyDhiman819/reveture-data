package com.revature.pms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getDBConnection() {
		Connection connection = null;

		try {
			Class.forName("org.postgresql.Driver"); // Type 4 driver

			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}
}
