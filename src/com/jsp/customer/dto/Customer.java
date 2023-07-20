package com.jsp.customer.dto;

import com.jsp.product.dto.Product;

/**
 * 
 * @author Atul
 *
 */

public class Customer {
	private int customerId;
	private String customerName;
	private String customerEmail;
	private long customerPhone;
	private int productId;
	public Customer() {
		// No argument Constructor
	}
	public Customer(int customerId, String customerName, String customerEmail, long customerPhone, int productId) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
		this.productId = productId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public long getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public static void displayCustomer(int customerId, String customerName, String customerEmail, long customerPhone, int productId) {
		System.out.println("Customer ID: "+customerId);
		System.out.println("Customer Name: "+customerName);
		System.out.println("Customer Email: "+customerEmail);
		System.out.println("Customer Phone: "+customerPhone);
		System.out.println("Product ID: "+productId);
		
		System.out.println("---------------------------------");
	}
}
