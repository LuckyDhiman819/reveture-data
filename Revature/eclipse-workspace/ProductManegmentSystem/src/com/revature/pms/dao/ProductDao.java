package com.revature.pms.dao;

import java.util.List;

import com.revature.pms.model.Product;

public interface ProductDao {
	public boolean addProduct(Product product);
	public boolean deleteProduct(int productId);
	public boolean updateProduct(Product product);
	public Product getProductId(int productId);
	public List<Product> getProductByName(String productName);
	public List<Product> getAllProduct();
	

}
