package com;

import java.util.Date;
import java.util.Scanner;

import org.apache.log4j.*;

public class MainApp {
	
	int choice;
	Scanner sc= new Scanner(System.in);
	private static Logger logger=Logger.getLogger("MainAp");
	public void startMainApp()
	{
		
		System.out.println("Enter Your Name : ");
		String name=sc.nextLine();
		logger.info("Welcome "+name+" you logged in at "+ new Date());
		while(true)
		{
			logger.info(" Main Ap Started ");
		System.out.println("==================");
		System.out.println("Press 1 For====>User");
		System.out.println("Press 2 For====>Employee");
		System.out.println("Press 3 For====>Customer");
		System.out.println("Press 4 For====>Exit");
		System.out.println();
		System.out.println("Enter Your Choice ==");
		choice=sc.nextInt();
		switch (choice) {
		case 1:
			logger.info("User Ap Started ");
			UserApp userApp=new UserApp();
			userApp.startUserApp();
			
			break;
		case 2:
			EmployeeApp employeeApp=new EmployeeApp();
			employeeApp.startEmployeeApp();
					
			break;
		
		case 3:
			CustomerApp customerApp =new CustomerApp();
			customerApp.startCustomerApp();
			
			break;
		
		case 4:
			logger.info("Main App Closed");
			System.exit(0);
			
			break;

		default:
			System.out.println("Wrong Choice ! Try Again");
			System.out.println();
			break;
		}
		}
	}

}
