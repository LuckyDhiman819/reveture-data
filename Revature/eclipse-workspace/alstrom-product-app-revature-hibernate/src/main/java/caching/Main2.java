//Level 2 caching
package caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Main2 {
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration().configure();
		SessionFactory factory1 = cfg.buildSessionFactory();
		SessionFactory factory2 = cfg.buildSessionFactory();

		Session session1 = factory1.openSession();
		Session session2 = factory2.openSession();

		Users emp1 = (Users) session1.get(Users.class, 1);
		System.out.println(emp1.getUserid() + " " + emp1.getUsername() + " " + emp1.getPassword());

		session1.close();

		Users emp2 = (Users) session2.get(Users.class, 1);
		System.out.println(emp2.getUserid() + " " + emp2.getUsername() + " " + emp2.getPassword());

		session2.close();

	}
}
