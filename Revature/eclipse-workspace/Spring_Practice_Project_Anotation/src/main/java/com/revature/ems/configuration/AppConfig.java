package com.revature.ems.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.reature.ems.model.ContactDetails;
import com.reature.ems.model.Email;
import com.reature.ems.model.Employee;

@Configuration
public class AppConfig {
	
	@Bean(name =  "emp")
	public Employee getEmployee() {
		return new Employee();
	}
	@Bean(name = "email1")
	public Email getEmail1() {
		return new Email("lucky@", "dhiman@", "physics", "html");
	}
	@Bean(name = "email2")
	public Email getEmail2() {
		return new Email("lucky@123", "dhiman@321", "physics123", "html123");
	}
	@Bean(name = "contact")
	public ContactDetails getContactDetails() {
		return new ContactDetails("7988857819", "720645", "1234566");
	}
	

}
