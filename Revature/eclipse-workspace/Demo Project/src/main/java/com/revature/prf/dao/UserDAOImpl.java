package com.revature.prf.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.prf.model.User;
import com.revature.prf.util.DBConnection;

public class UserDAOImpl implements UserDAO{
	Connection connection;
	PreparedStatement statement;
	private final String ADD_USER_SQL_QUERY="insert into users values(?,?,?)";
	
	ResultSet res;
	boolean result;
	public boolean validateUser(User user) {
		
		try {
			connection=DBConnection.getDBConnection();
			statement=connection.prepareStatement("select * from users where userName=? and userPassword=?");
			
			statement.setString(1,user.getUserName());
			statement.setString(2, user.getUserPassword());
			
			 res=statement.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
			
		 try {
		result=res.next();
				 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public boolean addUser(User user) {
		int res=0;
		
		try {
			connection=DBConnection.getDBConnection();
			PreparedStatement statement=connection.prepareStatement(ADD_USER_SQL_QUERY);
			statement.setInt(1,user.getUserId());
			statement.setString(2,user.getUserName());
			statement.setString(3,user.getUserPassword());
			
			
			res=statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(res==0)
			return false;
		else
			return true;


		
	}

}
