package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reature.ems.model.ContactDetails;
import com.reature.ems.model.Email;
import com.reature.ems.model.Employee;
import com.revature.ems.configuration.AppConfig;

/**
 * Hello world!
 *
 */
/**
 * @author Lucky Dhiman
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Employee emp = (Employee) context.getBean("emp");
    	Email email = (Email) context.getBean("email2");
    	System.out.println("before contact");
    	ContactDetails contact = (ContactDetails) context.getBean("contact");
    	
    	email.setTo("luckydhiman@gmail.com");
    	email.setFrom("lucky@gmail.com");
    	
    	contact.setPhoneNumber("7988857819");
    	
    	
    	emp.setEmail(email);
    	emp.setContact(contact);
    	emp.setEmpId(10);
//    	emp.setEmpName("Lucky");
    	emp.setSalary(50000);
    	
    	System.out.println(emp);
    	
    	context.registerShutdownHook();
    	
    	
        
    }
}
