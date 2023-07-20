package com.jsp.customer.dto;

import com.jsp.product.dto.Product;

public class CustomerDriver {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.displayCustomer(121, "abc", "abc@gmail.com", 567856, 101,new Product(101,"samsung",13245.8,"blue"));
		customer.product = null;
		customer.product.display();
		customer.displayCustomer(123, "xyz", "xyz", 354, 543, new Product());
		
	}
}
