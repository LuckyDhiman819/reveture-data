package com.revature.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.revature.pms.model.Product;
import com.revature.pms.util.DBConn;

public class ProductDaoHibernate implements ProductDaoDeclare {

	
	Configuration configuration = new Configuration().configure();
	SessionFactory sessionFactory = configuration.buildSessionFactory();
	Session session = sessionFactory.openSession();
	
	
	public boolean addProduct(Product product) {
		Transaction transection = session.beginTransaction();
		session.save(product);
		transection.commit();
		return true;
	}

	public boolean deleteProduct(int productId) {
		
		
		return false;
	}

	public boolean updateProduct(Product product) {
		
		
		return false;
	}

	public Product getProductId(int productId) {

		
		return null;
	}

	public List<Product> getProductByName(String productName) {
		
		return null;
	}

	public List<Product> getAllProduct() {
		
		
		
		return null;
	}
	
	

}
