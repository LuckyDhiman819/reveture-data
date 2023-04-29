package com.revature.pms.model;

import java.util.Objects;

public class Product {
	
	int productId;
	String productName;
	int quantityOnHand;
	int price;
	String review;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String productName, int quantityOnHand, int price, String review) {
		super();
		this.productId = id;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
		this.review = review;
	}

	
	
	
	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public int hashCode() {
		return Objects.hash(productId, price, productName, quantityOnHand, review);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return productId == other.productId && price == other.price && Objects.equals(productName, other.productName)
				&& quantityOnHand == other.quantityOnHand && Objects.equals(review, other.review);
	}
	
	@Override
	public String toString() {
		return "\nProduct [productId=" + productId + ", productName=" + productName + ", quantityOnHand="
				+ quantityOnHand + ", price=" + price + ", comments=" + review + "]";
	}
	
	

}
