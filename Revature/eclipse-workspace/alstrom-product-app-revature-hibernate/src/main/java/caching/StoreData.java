package caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Users users = new Users("Neha","Agrawal");
		
		s.save(users);
		
		t.commit();
		System.out.println("Data Stored");


	}

}
