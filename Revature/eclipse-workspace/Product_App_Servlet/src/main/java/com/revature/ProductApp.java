package com.revature;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.pms.dao.ProductDaoDeclare;
import com.revature.pms.dao.ProductDaoImp;
import com.revature.pms.model.Product;


public class ProductApp {
	Logger logger = Logger.getLogger(ProductApp.class);
	int choice = 0;
	Scanner sc = new Scanner(System.in);
	ProductDaoDeclare productDAO = new ProductDaoImp();
	int product_Id;
	boolean result;
	Product product = new Product();
	List<Product> products;

	public void startProductApp() {

		while (true) {
			System.out.println("#######M E N U#######");
			System.out.println("1.Add Product ");
			System.out.println("2.Delete Product ");
			System.out.println("3.Update Product ");
			System.out.println("4.Find Product By Id");
			System.out.println("5.Find Product By Name");
			System.out.println("6.View All Products");
			System.out.println("9.E X I T ");

			System.out.println("Enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				logger.info("Adding a product :"+new Date());
				System.out.println("Wecome to add product section , please enter product enter details to  save##");
				product = acceptProductDetails();
				result = productDAO.addProduct(product);
				if (result)
					System.out.println(
							"#Product with product saved successfully");
				else
					System.out.println(
							"#Product with product  not saved successfully");

				break;
			case 2:
				System.out.println("entre the id which you want to delete");
				product_Id = sc.nextInt();
				result = productDAO.deleteProduct(product_Id);	
				
				if (result)
					System.out.println(
							"#Product with product name : " + product.getProductName() + " , delete successfully");
				else
					System.out.println(
							"#Product with product name : " + product.getProductName() + ", not delete successfully");				
				
				break;
			case 3:
				System.out.println("Wecome to update product section , please enter product enter details to  update ##");
				product = acceptProductDetails();
				result = productDAO.updateProduct(product);
				if (result)
					System.out.println(
							"#Product with product name : " + product.getProductName() + " , updated successfully");
				else
					System.out.println(
							"#Product with product name : " + product.getProductName() + ", not updated successfully");

				break;
			case 4:
				System.out.println("Welcome to Searcing section with id");
				product_Id = sc.nextInt();
				
				Product product = productDAO.getProductId(product_Id);
				System.out.println(product.toString());
				
				break;
			case 5:
				System.out.println("Welcome to Searcing section with name");
				sc.nextLine();
				String product_Name = sc.nextLine();
				products = productDAO.getProductByName(product_Name);
				System.out.println(products);
				break;
			case 6:
				products = productDAO.getAllProduct();
				System.out.println("###Printing all the products");
				System.out.println(products);
				break;
			case 9:
				System.out.println("##Thanks for using my product app");
				System.exit(0);
				break;
			}
		}
	}

	public Product acceptProductDetails() {
		System.out.println("Please enter product id : ");
		int productId = sc.nextInt();
		System.out.println("Please enter product name : ");
		sc.nextLine();
		String productName = sc.nextLine();
		System.out.println("Please enter quantity on Hand: ");
		int quantityOnHand = sc.nextInt();
		System.out.println("Please enter price : ");
		int price = sc.nextInt();
		System.out.println("Please enter comments: ");
		sc.nextLine();
		String comments = sc.nextLine();

		Product product = new Product(productId, productName, quantityOnHand, price, comments);
		return product;
	}
}
