package com;

import java.util.Scanner;

import com.revature.prf.dao.*;


import com.revature.prf.model.*;

public class EmployeeApp {
	
	int choice;
	Scanner sc = new Scanner(System.in);
	EmployeeDAO employeeDAO=new EmployeeDAOImpl();
	boolean result;
	Employee employee=new Employee();
	public void startEmployeeApp() {
		System.out.println("===Welcome to Employee Section===");
	
			
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
					System.out.println("Wecome to Employee  Signup =  please enter these details for SignUp");
					employee = acceptEmployeeDetailSignUp();
					result = employeeDAO.addEmployee(employee);
					if (result)
						System.out.println(
								"#Employee with user name : " + employee.getEmployeeName() + " , saved successfully");
					else
						System.out.println(
								"#Product with product name : " + employee.getEmployeeName()+ ", not saved successfully");

					
					break;
				case 2:
					System.out.println("Wecome to Employee Login =  please enter these details for Login");
					employee = acceptEmployeeLogin();
					result = employeeDAO.validateEmployee(employee);
					if (result==true)
					{
						System.out.println("Login as "+employee.getEmployeeName()+" Success");
						System.out.println();
						EmployeeFunction employeeFunction=new EmployeeFunction();
						employeeFunction.startEmployeeFunction();
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
		
		public Employee acceptEmployeeDetailSignUp() {
			
			System.out.println("Enter Employee ID ==");
			int employeeId=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee Name ==");
			String employeeName=sc.nextLine();
			System.out.println("Enter Employee Contact ==");
			int employeeContact=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee Password ==");
			String employeePassword=sc.nextLine();
			System.out.println("Enter Employee Address ==");
			String employeeAddress=sc.nextLine();
			
			Employee employee=new Employee(employeeId, employeeName, employeeContact,employeePassword,employeeAddress);
			return employee;
			
		}
		
		public Employee acceptEmployeeLogin() {
			
			System.out.println("Enter Employee Name ==");
			String employeeName=sc.nextLine();
			System.out.println("Enter Employee Password ==");
			String employeePassword=sc.nextLine();
			Employee employee=new Employee(employeeName, employeePassword);
			return employee;
		}
		
	

}
