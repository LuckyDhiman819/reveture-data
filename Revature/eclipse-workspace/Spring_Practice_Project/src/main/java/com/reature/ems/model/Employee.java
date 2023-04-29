package com.reature.ems.model;

public class Employee {
	
	private String empName;
	private int empId;
	private String empAddress;
	private int salary;
	
//	object Email
	private Email email;
	
	
	
	public Employee() {
		
	}



	public Employee(String empName, int empId, String empAddress, int salary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAddress = empAddress;
		this.salary = salary;
	}
	
	


	public Employee(String empName, int empId, String empAddress, int salary, Email email) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAddress = empAddress;
		this.salary = salary;
		this.email = email;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getEmpAddress() {
		return empAddress;
	}



	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	



	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empAddress=" + empAddress + ", salary=" + salary
				+ ", email=" + email + "]";
	}



	





	public Email getEmail() {
		return email;
	}



	public void setEmail(Email email) {
		this.email = email;
	}
	
	

	
}
