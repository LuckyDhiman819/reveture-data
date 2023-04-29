package com.revature.prf.dao;

import java.util.List;

import com.revature.prf.model.Transaction;

public interface TransactionDAO {
	
	
	public boolean addWithdrawTransaction(Transaction transaction);
	public boolean addDepositTransaction(Transaction transaction);
	public boolean addTransferTransaction(Transaction transaction);
	public List<Transaction> getAllTransaction();

}
