package com.reature.ems.dao;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Account {
	private int balance = 100000;
	
	public void withdraw(int amount) {
		
		balance -= amount;
		System.out.println("Your Remaining balance is "+ balance);
		
	}
	
	public void deposite(int amount) {
		
		balance += amount;
		System.out.println("Your added balance is "+ balance);
		
	}
	
	public void changePin(int pin) {
		
		System.out.println("Pin change Succesfully "+ pin);
		
	}
	

}
