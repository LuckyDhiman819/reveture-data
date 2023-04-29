package com.revature.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.pms.model.Product;
import com.revature.pms.util.DBConnection;

public class ProductDAOImpl implements ProductDAO {

	Connection connection = DBConnection.getDBConnection();

	private final String ADD_PRODUCT_QUERY = "insert into hr.products values(?,?,?,?,?)";
	private final String UPDATE_PRODUCT_QUERY = "update hr.products set productName = ?, quantityOnHand=? , price = ? , comments = ? where productId = ?";
	private final String FIND_ALL_PRODUCT = "select * from hr.products";

	private final String DELETE_PRODUCT_QUERY = "delete from hr.products where productId = ?";
	private final String FIND_PRODUCT_BY_ID_QUERY = "select * from hr.products where productId = ?";
	private final String FIND_PRODUCT_BY_NAME_QUERY = "select * from hr.products where productName = ?";

	// THis will add product in DB
	public boolean addProduct(Product product) {
		int res = 0;

		try {
			PreparedStatement statement = connection.prepareStatement(ADD_PRODUCT_QUERY);
			statement.setInt(1, product.getProductId());
			statement.setString(2, product.getProductName());
			statement.setInt(3, product.getQuantityOnHand());
			statement.setInt(4, product.getPrice());
			statement.setString(5, product.getComments());

			res = statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (res == 0)
			return false;
		else
			return true;
	}

	public boolean deleteProduct(int productId) {
		// TODO Auto-generated method stub
		int res = 0;
		try {
			PreparedStatement statement = connection.prepareStatement(DELETE_PRODUCT_QUERY);
			statement.setInt(1, productId);
			
			res = statement.executeUpdate();
			if(res==0) {
				return false;
			}
			else { 
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	public boolean updateProduct(Product product) {
		int res = 0;

		try {
			PreparedStatement statement = connection.prepareStatement(UPDATE_PRODUCT_QUERY);
			statement.setInt(5, product.getProductId());
			statement.setString(1, product.getProductName());
			statement.setInt(2, product.getQuantityOnHand());
			statement.setInt(3, product.getPrice());
			statement.setString(4, product.getComments());

			res = statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (res == 0)
			return false;
		else
			return true;
	}

	public Product getProductById(int productId) {
		
		return null;
	}

	public List<Product> getProductByName(String productName) {
		List<Product> products = new ArrayList<Product>();
		ResultSet res = null;
		try {
			PreparedStatement statement = connection.prepareStatement(FIND_PRODUCT_BY_NAME_QUERY);
			statement.setString(1, productName);
			res = statement.executeQuery();
			while(res.next()) {
				Product product = new Product();
				product.setProductId(res.getInt(1));
				product.setProductName(res.getString(2));
				product.setQuantityOnHand(res.getInt(3));
				product.setPrice(res.getInt(4));
//				product.setReview(res.getString(5));
				
				products.add(product);
				
			}
			return products;			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	public List<Product> getAllProducts() {

		List<Product> products = new ArrayList<Product>();

		try {
			Statement statement = connection.createStatement();
			ResultSet res = statement.executeQuery(FIND_ALL_PRODUCT);
			while (res.next()) {
				Product product = new Product();
				product.setProductId(res.getInt(1));
				product.setProductName(res.getString(2));
				product.setQuantityOnHand(res.getInt(3));
				product.setPrice(res.getInt(4));
				product.setComments(res.getString(5));
				// product
				// add product to products list
				products.add(product);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return products;
	}

	public boolean isProductExists(int productId) {

		boolean result = false;

		try {
			PreparedStatement stat = connection.prepareStatement(FIND_PRODUCT_BY_ID_QUERY);
			stat.setInt(1, productId);
			ResultSet res = stat.executeQuery();

			if (res.next()) {
				result = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

}
