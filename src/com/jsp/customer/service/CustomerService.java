package com.jsp.customer.service;

import com.jsp.customer.dao.CustomerDao;
import com.jsp.customer.dto.Customer;

/**
 * 
 * @author Atul
 *
 */

public class CustomerService {
	CustomerDao customerDao = new CustomerDao();
	
	public Customer customerService(Customer customer) {
		if(customer.getCustomerId()<10000) {
			System.out.println("-------------DATA INSERTED----------------");
			return customerDao.insertCustomer(customer);
		}
		else {
			System.err.println("ID should be of 4 digits");
		}
		return null;
	}
	public int updateCustomerName(int id, String name) {
		return customerDao.updateCustomerName(id,name);
	}
	
	public int updateCustomerEmail(int id, String email) {
		return customerDao.updateCustomerEmail(id,email);
	}
	public int updateCustomerPhone(int id, long phone) {
		return customerDao.updateCustomerPhone(id,phone);
	}
	public void displayCustomer() {
		customerDao.displayCustomer();
	}
	public int deleteCustomer(int id) {
		return customerDao.deleteCustomer(id);
	}

}
