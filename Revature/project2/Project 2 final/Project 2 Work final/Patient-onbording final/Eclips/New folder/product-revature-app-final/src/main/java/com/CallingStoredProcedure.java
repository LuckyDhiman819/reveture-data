package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import com.revature.pms.util.DBConnection;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;

public class CallingStoredProcedure {
	public static void main(String[] args) {
		Connection conection = DBConnection.getDBConnection();
		int debited = 0, credited = 0;
		
		try {
			CallableStatement statement = conection.prepareCall("call hr.transferAmountAndReturnAmounts(?,?,?,?,?)");
			
			statement.setInt(1, 1);
			statement.setInt(2, 2);
			statement.setInt(3, 500);
			statement.registerOutParameter(4, Types.INTEGER);
			statement.setInt(4, debited);
			statement.registerOutParameter(5, Types.INTEGER);
			statement.setInt(5, credited);
			
			statement.execute();
			
			debited = statement.getInt(4);
			credited = statement.getInt(5);
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Balance tansfered");
		System.out.println("debited amount id:- "+debited);
		System.out.println("credited amount id:- "+credited);
		
		
		
		
	}
}
