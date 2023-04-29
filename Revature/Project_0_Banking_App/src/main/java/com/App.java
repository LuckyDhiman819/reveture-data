package com;

import com.menu.MainMenu;

public class App {
	
	public static void main(String[] args) {
		String type = null;
		System.out.println("Welocme To Lucky's banking App");
		System.out.println();
		MainMenu main = new MainMenu();
		try {
			type = main.cheakType();
			
			main.Menu(type);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
