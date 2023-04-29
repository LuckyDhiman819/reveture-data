package com.revature.training.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	
	private String employeeId;
	private String employeeName;
	private String salary;

}
