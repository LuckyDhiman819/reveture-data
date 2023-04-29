package com;

import java.util.Scanner;

import com.revature.prf.dao.UserDAO;
import com.revature.prf.dao.UserDAOImpl;
import com.revature.prf.model.User;



public class UserApp {
	int choice;
	Scanner sc = new Scanner(System.in);
	UserDAO userDAO = new UserDAOImpl();
	boolean result;
	User user = new User();

	public void startUserApp(){
		
		System.out.println("===Welcome to User Section===");
		
		while(true) {
			System.out.println("===Press 1 for SignUp===");
			System.out.println("===Press 2 for Login===");
			System.out.println("===Press 3 for Exit===");
			System.out.println();
			System.out.println("Please Enter Your Choice");
			choice=sc.nextInt();	
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Wecome to add USER  Signup =  please enter these details for SignUp");
				user = acceptUserDetailSignUp();
				result = userDAO.addUser(user);
				if (result)
					System.out.println(
							"#User with user name : " + user.getUserName() + " , saved successfully");
				else
					System.out.println(
							"#Product with product name : " + user.getUserName() + ", not saved successfully");

				
				break;
			case 2:
				System.out.println("Wecome to add USER Login =  please enter these details for Login");
				user = acceptUserDetailLogin();
				result = userDAO.validateUser(user);
				if (result==true) {
					System.out.println("Login as "+user.getUserName()+" Success");
					UserFunction userFunction=new UserFunction();
					userFunction.startUserFunction();
				}
				else
					System.out.println("Login Failed! Please Try Again");
				
				break;
			case 3:
				System.exit(0);
				break;
			

			default:
				System.out.println("Wrong Choice ! Try Again");
				break;
			}
		}
		
		
		
	}
	
	public User acceptUserDetailSignUp() {
		
		System.out.println("Enter UserId ==");
		int userId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter User Name ==");
		String userName=sc.nextLine();
		System.out.println("Enter User Password ==");
		String userPassword=sc.nextLine();
		
		User user=new User(userId, userName, userPassword);
		return user;
		
	}
	
	public User acceptUserDetailLogin() {
		
		System.out.println("Enter User Name ==");
		String userName=sc.nextLine();
		System.out.println("Enter User Password ==");
		String userPassword=sc.nextLine();
		User user=new User(userName, userPassword);
		return user;
	}
	

}
