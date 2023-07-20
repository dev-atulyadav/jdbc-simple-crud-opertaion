package com.jsp.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jsp.customer.connection.CustomerConnection;
import com.jsp.customer.dto.Customer;

/**
 * 
 * @author Atul
 *
 */
public class CustomerDao {
	Connection connection = CustomerConnection.getCustomerConnection();
	/*
	 * insert method for Product
	 */
	public Customer insertCustomer(Customer customer) {
		String insertQuery = "insert into customer values (?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			
			preparedStatement.setInt(1, customer.getCustomerId());
			preparedStatement.setString(2, customer.getCustomerName());
			preparedStatement.setString(3, customer.getCustomerEmail());
			preparedStatement.setLong(4, customer.getCustomerPhone());
			preparedStatement.setInt(5, customer.getProductId());
			
			preparedStatement.execute();
			return customer;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public int updateCustomerName(int id,String name) {
		
		String updateCustomerNameQuery = "Update customer value set customerName = ? where customerId = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateCustomerNameQuery);
			
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2,id);
			
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		}
	
	
	public int updateCustomerEmail(int id,String email) {
		
	String updateCustomerEmailQuery = "Update customer value set customerEmail = ? where customerId = ?";
	try {
		PreparedStatement preparedStatement = connection.prepareStatement(updateCustomerEmailQuery);
		
		preparedStatement.setString(1, email);
		preparedStatement.setInt(2,id);
		
		return preparedStatement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return 0;
	}
	
	public int updateCustomerPhone(int id,double phone) {
		
		String updateCustomerPhoneQuery = "Update customer value set customerPhone = ? where customerId = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateCustomerPhoneQuery);
			
			preparedStatement.setDouble(1, phone);
			preparedStatement.setInt(2,id);
			
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
}


	public  void displayCustomer() {
	String DisplayQuery = "Select * from customer";
	try {
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(DisplayQuery);
//		boolean b = resultSet.next();
		while(resultSet.next()) {
		int id = resultSet.getInt("customerId");
		String name = resultSet.getString("customerName");
		String email = resultSet.getString("customerEmail");
		long phone = resultSet.getLong("customerPhone");
		int productId = resultSet.getInt("productId");
		Customer.displayCustomer(id, name, email, phone, productId);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
	public int deleteCustomer(int id) {
		
		String deleteCustomerQuery = "Delete from customer where customerId = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(deleteCustomerQuery);
			
			preparedStatement.setInt(1,id);
			
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
}
}
