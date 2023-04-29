package caching;

import java.io.Serializable;
import java.util.Objects;

//POJO
public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5141683051163515378L;
	private int empId;
	private String empName;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}






	@Override
	public int hashCode() {
		return Objects.hash(empId, empName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName);
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
}
