package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reature.ems.model.Body;
import com.reature.ems.model.Email;
import com.reature.ems.model.From;
import com.reature.ems.model.Subject;
import com.reature.ems.model.To;
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
    	
    	Email email = (Email) context.getBean("email");
    	To to = (To) context.getBean("to");
    	From from = (From) context.getBean("from");
    	Subject subject = (Subject) context.getBean("subject");
    	Body body = (Body) context.getBean("body");
    	
    	
    	email.setTo(to);
    	email.setFrom(from);
    	email.setSubject(subject);
    	email.setBody(body);
    	
    	System.out.println(email);
    	
    	context.registerShutdownHook();
    	
    	
        
    }
}
