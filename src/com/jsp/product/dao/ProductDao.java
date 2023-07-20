package com.jsp.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jsp.product.connection.ProductConnection;
import com.jsp.product.dto.Product;

/**
 * 
 * @author Atul
 *
 */

public class ProductDao {
	
	Connection connection = ProductConnection.getProductConnection();
	/*
	 * insert method for Product
	 */
	public Product insertProduct(Product product) {
		String insertQuery = "insert into product values (?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			
			preparedStatement.setInt(1, product.getProductId());
			preparedStatement.setString(2, product.getProductName());
			preparedStatement.setDouble(3, product.getProductPrice());
			preparedStatement.setString(4, product.getProductColor());
			
			preparedStatement.execute();
			return product;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public int updateProductName(int id,String name) {
		
		String updateProductNameQuery = "Update product value set productname = ? where productid = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateProductNameQuery);
			
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2,id);
			
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		}
	
	
	public int updateProductColor(int id,String color) {
		
	String updateProductColorQuery = "Update product value set productcolor = ? where productid = ?";
	try {
		PreparedStatement preparedStatement = connection.prepareStatement(updateProductColorQuery);
		
		preparedStatement.setString(1, color);
		preparedStatement.setInt(2,id);
		
		return preparedStatement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return 0;
	}
	
	public int updateProductPrice(int id,double price) {
		
		String updateProductPriceQuery = "Update product value set productprice = ? where productid = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(updateProductPriceQuery);
			
			preparedStatement.setDouble(1, price);
			preparedStatement.setInt(2,id);
			
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
}


	public void displayProduct() {
	String DisplayQuery = "Select * from product";
	try {
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(DisplayQuery);
		while(resultSet.next()) {
		int id = resultSet.getInt("productid");
		String name = resultSet.getString("productname");
		String color = resultSet.getString("productcolor");
		double price = resultSet.getDouble("productprice");
		Product.displayProduct(id, name, price, color);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
	public int deleteProduct(int id) {
		
		String deleteProductQuery = "Delete from product where productid = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(deleteProductQuery);
			
			preparedStatement.setInt(1,id);
			
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
}
}
