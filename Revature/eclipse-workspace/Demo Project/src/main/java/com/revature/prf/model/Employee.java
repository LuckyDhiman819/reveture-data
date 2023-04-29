package com.revature.prf.model;

public class Employee {
	
	//feilds according to db
	private int employeeId;
	private String employeeName;
	private int employeeContact;
	private String employeePassword;
	private String employeeAddress;
	
	
		//default constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor...
		public Employee(int employeeId, String employeeName, int employeeContact, String employeePassword,
				String employeeAddress) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.employeeContact = employeeContact;
			this.employeePassword = employeePassword;
			this.employeeAddress = employeeAddress;
		}
		
		
		//getters and setters
		
		public Employee(String employeeName, String employeePassword) {
			super();
			this.employeeName = employeeName;
			this.employeePassword = employeePassword;
		}

		public int getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}

		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}

		public int getEmployeeContact() {
			return employeeContact;
		}

		public void setEmployeeContact(int employeeContact) {
			this.employeeContact = employeeContact;
		}

		public String getEmployeePassword() {
			return employeePassword;
		}

		public void setEmployeePassword(String employeePassword) {
			this.employeePassword = employeePassword;
		}

		public String getEmployeeAddress() {
			return employeeAddress;
		}

		public void setEmployeeAddress(String employeeAddress) {
			this.employeeAddress = employeeAddress;
		}

		//toString
		@Override
		public String toString() {
			return "\nEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeContact="
					+ employeeContact + ", employeeAddress="
					+ employeeAddress + "]";
		}
		
		
		
		
		
		
		
		
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		

}
