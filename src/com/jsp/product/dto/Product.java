package com.jsp.product.dto;

/**
 * 
 * @author Atul
 *
 */

public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	private String productColor;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	

	public Product(int productId, String productName, double productPrice, String productColor) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productColor = productColor;
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

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public String getProductColor() {
		return productColor;
	}
	
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	public static void displayProduct(int productId, String productName, double productPrice, String productColor) {
		System.out.println("Poduct ID: "+productId);
		System.out.println("Poduct Name: "+productName);
		System.out.println("Poduct Color: "+productColor);
		System.out.println("Poduct Price: "+productPrice);
		System.out.println("---------------------------------");
		
	}
}
