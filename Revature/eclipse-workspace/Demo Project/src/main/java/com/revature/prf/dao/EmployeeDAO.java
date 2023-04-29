package com.revature.prf.dao;

import java.util.List;

import com.revature.prf.model.Employee;

public interface EmployeeDAO {
	public boolean addEmployee(Employee employee);

	public boolean deleteEmployee(int employeeId);
	
	public List<Employee> getEmployeeByName(String employeeName);

	public Employee getEmployeeById(int employeeId); 

	public List<Employee> getAllEmployee();
	
	public boolean validateEmployee(Employee employee);

}
