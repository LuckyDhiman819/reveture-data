package com.reature.ems.dao;

import org.springframework.stereotype.Component;

@Component
public interface StockImp {
	
	public void addStock(int amount);
	public void removeStock(int amount);
	

}
