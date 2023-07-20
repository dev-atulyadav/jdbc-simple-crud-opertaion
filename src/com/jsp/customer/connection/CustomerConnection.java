package com.jsp.customer.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomerConnection {
	public static Connection getCustomerConnection() {
		//step 1: load or register Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create connection
			String url = "jdbc:mysql://localhost:3306/jdbc-preparedstatement";
			String user = "root";
			String pass = "root";
			Connection connection= DriverManager.getConnection(url, user, pass);
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
