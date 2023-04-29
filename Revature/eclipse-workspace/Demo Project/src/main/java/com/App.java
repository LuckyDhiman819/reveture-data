package com;

import java.sql.Connection;

import com.revature.prf.util.DBConnection;

public class App {
	public static void main(String[] args) {
		System.out.println("Welcome To My Bank App");
		System.out.println();
		
		
		MainApp mainApp = new MainApp();
		mainApp.startMainApp();
	}
}
