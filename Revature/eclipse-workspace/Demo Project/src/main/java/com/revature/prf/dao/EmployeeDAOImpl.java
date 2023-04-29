package com.revature.prf.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.prf.model.Employee;
import com.revature.prf.util.DBConnection;

public class EmployeeDAOImpl implements EmployeeDAO {

	Connection connection=DBConnection.getDBConnection();
	
	PreparedStatement statement;
	ResultSet res;
	boolean result;
	private final String ADD_EMPLOYEE_SQL_QUERY="insert into employees values(?,?,?,?,?)";
	private final String DELETE_EMPLOYEE_SQL_QUERY="delete from employees where employeeId=?";
	private final String UPDATE_EMPLOYEE_SQL_QUERY="update employees set employeeName=?,employeeContact=?,employeePassword=?,employeeAddress=? where employeeId=?";
	private final String FIND_EMPLOYEE_BY_ID_SQL_QUERY="select * from employees where employeeId=?";
	private final String FIND_EMPLOYEE_BY_NAME_SQL_QUERY="select * from employees where employeeName=?";
	private final String FIND_ALL_EMPLOYEE_SQL_QUERY="select * from employees";
	
	
	
	public boolean addEmployee(Employee employee) {
		int res=0;
		
		try {
			PreparedStatement statement=connection.prepareStatement(ADD_EMPLOYEE_SQL_QUERY);
			statement.setInt(1,employee.getEmployeeId());
			statement.setString(2,employee.getEmployeeName());
			statement.setInt(3,employee.getEmployeeContact());
			statement.setString(4,employee.getEmployeePassword());
			statement.setString(5,employee.getEmployeeAddress());
			
			res=statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(res==0)
			return false;
		else
			return true;
	}


	public boolean updateCustomer(Employee employee) {
		int res=0;		
		try {
			PreparedStatement statement=connection.prepareStatement(UPDATE_EMPLOYEE_SQL_QUERY);
			statement.setInt(5,employee.getEmployeeId());
			statement.setString(1,employee.getEmployeeName());
			statement.setInt(2,employee.getEmployeeContact());
			statement.setString(3,employee.getEmployeePassword());
			statement.setString(4,employee.getEmployeeAddress());
			
			res=statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(res==0)
			return false;
		else
			return true;
		
		
		
		
		
	}





	public List<Employee> getAllEmployee() {
		Employee employee=new Employee();
		List<Employee> employees=new ArrayList<Employee>();
		
		try {
			Statement statement =connection.createStatement();
			res=statement.executeQuery(FIND_ALL_EMPLOYEE_SQL_QUERY);
			
			while(res.next()) {
				employee.setEmployeeId(res.getInt(1));
				employee.setEmployeeName(res.getString(2));
				employee.setEmployeeContact(res.getInt(3));
				
				employee.setEmployeeAddress(res.getString(5));
				
				//add employee to employee list(employees)
				employees.add(employee);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return employees;
		
	}

	public boolean validateEmployee(Employee employee) {
		
		try {
			connection=DBConnection.getDBConnection();
			statement=connection.prepareStatement("select * from employees where employeeName=? and employeePassword=?");
			
			statement.setString(1,employee.getEmployeeName());
			statement.setString(2, employee.getEmployeePassword());
			
			 res=statement.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
			
		 try {
		result=res.next();
				 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}

	public boolean deleteEmployee(int employeeId) {
		boolean result = false;

		try {
			PreparedStatement stat = connection.prepareStatement(DELETE_EMPLOYEE_SQL_QUERY);
			stat.setInt(1, employeeId);

			stat.executeUpdate();
			result = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	public List<Employee> getEmployeeByName(String employeeName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getEmployeeById(int employeeId) {
		Employee employee = new Employee();

		PreparedStatement stat = null;
		try {
			stat = connection.prepareStatement(FIND_EMPLOYEE_BY_ID_SQL_QUERY);
			stat.setInt(1, employeeId);
			ResultSet res = stat.executeQuery();
			res.next();

			employee.setEmployeeId(res.getInt(1));
			employee.setEmployeeName(res.getString(2));
			employee.setEmployeeContact(res.getInt(3));
			employee.setEmployeePassword(res.getString(4));
			employee.setEmployeeAddress(res.getString(5));

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employee;
	}

}
