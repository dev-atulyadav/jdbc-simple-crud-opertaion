package com.jsp.product.controller;

import java.util.Scanner;


import com.jsp.product.dto.Product;
import com.jsp.product.service.ProductService;

/**
 * 
 * @author Atul
 *
 */

public class ProductController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 for insertion:\nEnter 2 for updation:\nEnter 3 for dispay:\nEnter 4 for deletion:");
		int input = scanner.nextInt();
		ProductService productService = new ProductService();
		
		
		switch (input) {
		case 1: {
			System.out.println("Enter the Product ID:");
			int id = scanner.nextInt();
			System.out.println("Enter the Product Name:");
			String name = scanner.next();
			System.out.println("Enter the Product color:");
			String color = scanner.next();
			System.out.println("Enter the Product Price:");
			double price = scanner.nextDouble();
			Product product;
			product = new Product(id, name, price, color);
			productService.productService(product);
		} break;
		
		case 2:{
			System.out.println("Please Select Product Data you want to update:");
			System.out.println("Enter 1 to update Name:\nEnter 2 to update color:\nEnter 3 to update price:");
			int option = scanner.nextInt();
			if(option==1) {
				System.out.println("Enter the Product ID:");
				int id = scanner.nextInt();
				System.out.println("Enter the new Product Name:");
				String name = scanner.next();
				int value = productService.updateProductName(id, name);
				if(value==1) {
					System.out.println("--------DATA UPDATED-----------");
				}
				else {
					System.out.println("------DATA NOT FOUND--------");
				}
			}
			else if(option==2){
				System.out.println("Enter the Product ID:");
				int id = scanner.nextInt();
				System.out.println("Enter the new Product color:");
				String color = scanner.next();
				int value = productService.updateProductColor(id, color);
				if(value==1) {
					System.out.println("--------DATA UPDATED-----------");
				}
				else {
					System.out.println("------DATA NOT FOUND--------");
				}
			}
			else if (option==3) {
				System.out.println("Enter the Product ID:");
				int id = scanner.nextInt();
				System.out.println("Enter the new Product price:");
				double price = scanner.nextDouble();
				int value = productService.updateProductPrice(id, price);
				if(value==1) {
					System.out.println("--------DATA UPDATED-----------");
				}
				else {
					System.out.println("------DATA NOT FOUND--------");
				}
			}
		} break;
		
		case 3:{
			productService.displayProduct();
		}break;
		
		case 4:{
			System.out.println("Enter the ID to delete the data:");
			int id = scanner.nextInt();
			System.out.println("These changes will be permanent.");
			System.err.println("Do you want to continue?\nYes / No");
			String option = scanner.next();
			if(option.equals("Yes")|| option.equals("yes")) {
				productService.deleteProduct(id);
				System.out.println("------DATA DELETED SUCCESSFULLY--------");
			}
			else {
				System.out.println("------DATA NOT DELETED--------");
			}
		}break;
		default:
			System.out.println("Choose a valid option...");
		}
		
		
	}
}
