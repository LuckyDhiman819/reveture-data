package com.revature.ems.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.reature.ems.model.Body;

import com.reature.ems.model.Email;

import com.reature.ems.model.From;
import com.reature.ems.model.Subject;
import com.reature.ems.model.To;

@Configuration
@ComponentScan("com")
public class AppConfig {
	
//	
//	@Bean(name = "email")
//	public Email getEmail() {
//		return new Email();
//	}
//	
//	@Bean(name = "to")
//	public To getTo() {
//		return new To("Lucky", "luckydhiman@gmail.com");
//	}
//	
//	@Bean(name = "from")
//	public From getFrom() {
//		return new From("dhiman", "dhiman@123");
//	}
//	
//	@Bean(name = "subject")
//	public Subject getSubject() {
//		return new Subject("Subject is Subject");
//	}
//	
//	@Bean(name = "body")
//	public Body getBody() {
//		return new Body("Html123");
//	}
	
	
	

}