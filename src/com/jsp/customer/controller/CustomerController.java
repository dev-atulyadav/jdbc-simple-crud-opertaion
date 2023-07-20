package com.jsp.customer.controller;

import java.util.Scanner;

import com.jsp.customer.dto.Customer;
import com.jsp.customer.service.CustomerService;

/**
 * 
 * @author Atul
 *
 */

public class CustomerController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 for insertion:\nEnter 2 for updation:\nEnter 3 for dispay:\nEnter 4 for deletion:");
		int input = scanner.nextInt();
		CustomerService customerService = new CustomerService();
		
		
		switch (input) {
		case 1: {
			System.out.println("Enter the Customer ID:");
			int id = scanner.nextInt();
			System.out.println("Enter the Customer Name:");
			String name = scanner.next();
			System.out.println("Enter the Customer Email:");
			String email = scanner.next();
			System.out.println("Enter the Customer phone number:");
			long phone = scanner.nextLong();
			System.out.println("Enter the Product ID:");
			int productId = scanner.nextInt();
			Customer customer = new Customer(id, name, email, phone, productId);
			customerService.customerService(customer);
		} break;
		
		case 2:{
			System.out.println("Please Select Customer Data you want to update:");
			System.out.println("Enter 1 to update Name:\nEnter 2 to update Email:\nEnter 3 to update phone:");
			int option = scanner.nextInt();
			if(option==1) {
				System.out.println("Enter the customer ID:");
				int id = scanner.nextInt();
				System.out.println("Enter the new customer Name:");
				String name = scanner.next();
				int value = customerService.updateCustomerName(id, name);
				if(value==1) {
					System.out.println("--------DATA UPDATED-----------");
				}
				else {
					System.out.println("------DATA NOT FOUND--------");
				}
			}
			else if(option==2){
				System.out.println("Enter the customer ID:");
				int id = scanner.nextInt();
				System.out.println("Enter the new Email:");
				String email = scanner.next();
				int value = customerService.updateCustomerEmail(id, email);
				if(value==1) {
					System.out.println("--------DATA UPDATED-----------");
				}
				else {
					System.out.println("------DATA NOT FOUND--------");
				}
			}
			else if (option==3) {
				System.out.println("Enter the customer ID:");
				int id = scanner.nextInt();
				System.out.println("Enter the new phone number:");
				long phone = scanner.nextLong();
				int value = customerService.updateCustomerPhone(id, phone);
				if(value==1) {
					System.out.println("--------DATA UPDATED-----------");
				}
				else {
					System.out.println("------DATA NOT FOUND--------");
				}
			}
		} break;
		
		case 3:{
			customerService.displayCustomer();
		}break;
		
		case 4:{
			System.out.println("Enter the ID to delete the data:");
			int id = scanner.nextInt();
			System.out.println("These changes will be permanent.");
			System.err.println("Do you want to continue?\nYes / No");
			String option = scanner.next();
			if(option.equals("Yes")|| option.equals("yes")) {
				if(customerService.deleteCustomer(id)==1) {
					System.out.println("------DATA DELETED SUCCESSFULLY--------");
				}
				else {
					System.out.println("------DATA NOT FOUND--------");
				}
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
