package com.revature.prf.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.prf.model.Transaction;
import com.revature.prf.util.DBConnection;

public class TransactioDAOImpl implements TransactionDAO {
	
	Scanner sc = new Scanner(System.in);
	PreparedStatement statement;
	ResultSet res;
	boolean result;

	Connection connection = DBConnection.getDBConnection();

	private final String GET_ALL_TRANSACTION_SQL_QUERY="select * from transactions";
	private final String WITHDRAWN_TRANSACTION_SQL_QUERY="insert into transactions(customerId,withdrawnAmount,comment) values(?,?,?)";
	private final String DEPOSIT_TRANSACTION_SQL_QUERY="insert into transactions(customerId,depositedAmount) values(?,?)";
	private final String TRANSFER_TRANSACTION_SQL_QUERY="insert into transactions(customerId,transferredAmount,transferToCustId) values(?,?,?)";

	public List<Transaction> getAllTransaction() {
		
		List<Transaction> transactions=new ArrayList<Transaction>();
		
		try {
			Statement statement=connection.createStatement();
			ResultSet res=statement.executeQuery(GET_ALL_TRANSACTION_SQL_QUERY);
			while(res.next()) {
				Transaction transaction=new Transaction();
				transaction.setTransactionId(res.getInt(1));
				transaction.setCustomerId(res.getInt(2));
				transaction.setDepositedAmount(res.getInt(3));
				transaction.setWithdrawnAmount(res.getInt(4));
				transaction.setTransferredAmount(res.getInt(5));
				transaction.setTransferredToCustId(res.getInt(6));
				transaction.setComment(res.getString(7));
				
				transactions.add(transaction);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return transactions;
	}

	public boolean addWithdrawTransaction(Transaction transaction) {
		int row=0;
		try {
			PreparedStatement statement = connection.prepareStatement(WITHDRAWN_TRANSACTION_SQL_QUERY);
			statement.setInt(1, transaction.getCustomerId());
			statement.setInt(2,transaction.getWithdrawnAmount());
			statement.setString(3,transaction.getComment());
			row=statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(row==0) {
			return false;
		}
		else
			return true;
		
		
		
	}

	public boolean addDepositTransaction(Transaction transaction) {
		
		int row=0;
		try {
			PreparedStatement statement = connection.prepareStatement(DEPOSIT_TRANSACTION_SQL_QUERY);
			statement.setInt(1, transaction.getCustomerId());
			statement.setInt(2,transaction.getDepositedAmount());
			
			row=statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(row==0) {
			return false;
		}
		else
			return true;
		
	}

	public boolean addTransferTransaction(Transaction transaction) {
		
		int row=0;
		try {
			PreparedStatement statement = connection.prepareStatement(DEPOSIT_TRANSACTION_SQL_QUERY);
			statement.setInt(1, transaction.getCustomerId());
			statement.setInt(2,transaction.getDepositedAmount());
			
			row=statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(row==0) {
			return false;
		}
		else
			return true;
		
	}

}
