package com.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.pms.model.Student;
import com.revature.pms.util.HibernateUtil;

public class Application {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Query query = session.getNamedQuery("findStudentByName")
				.setParameter("firstName", "neha");

		List<Student> students = query.list();
		for (Student student : students) {
			System.out.println(student);
		}
		session.getTransaction().commit();
		session.close();
	}
}