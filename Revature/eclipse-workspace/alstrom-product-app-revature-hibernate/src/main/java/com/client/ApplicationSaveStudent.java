package com.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.pms.model.Student;
import com.revature.pms.util.HibernateUtil;

public class ApplicationSaveStudent {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Student student = new Student("neha", "das", "a@a.com");
		session.save(student);
		System.out.println("Student saved");
		session.getTransaction().commit();
		session.close();
	}
}