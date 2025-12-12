package com.expenseTracker.backend.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	public static Connection getConnection() {
	    Connection connection = null;

	    String url = DatabaseConfig.getDbUrl();
	    String user = DatabaseConfig.getDbUsername();
	    String password = DatabaseConfig.getDbPassword();

	    try {
	        connection = DriverManager.getConnection(url, user, password);
	    } catch (SQLException e) {
	        System.out.println("Database error: " + e.getMessage());
	    }

	    return connection;
	
    }
}
