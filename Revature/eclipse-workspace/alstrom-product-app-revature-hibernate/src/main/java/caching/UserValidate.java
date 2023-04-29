package caching;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.pms.util.HibernateUtil;

public class UserValidate {
	
		public boolean validate(String username,String password)
		{
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("from Customers where username = '"+username+ "' and password = '"+password + "'");
			if (query.list().size() == 0)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
}
