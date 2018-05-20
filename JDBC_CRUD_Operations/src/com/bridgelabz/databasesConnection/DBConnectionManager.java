package com.bridgelabz.databasesConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBConnectionManager {
	static final String DB_VENDOR_MYSQL = "mysql";
	static final String DB_VENDOR_ORACLE = "oracle";
	static Connection connection = null;

	public static Connection getConnectionMySQL() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc_crud";
		String userName = "root";
		String password = "1900";
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	
	public static Connection getConnectionORACLE() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "testuser";
		String password = "testuser";
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static Connection getConnection(String dbVendor) throws Exception {
		if (dbVendor.equalsIgnoreCase(DB_VENDOR_MYSQL)) {
			return getConnectionMySQL();
		} else if (dbVendor.equalsIgnoreCase(DB_VENDOR_ORACLE)) {
			return getConnectionORACLE();
		} else {
			throw new Exception("Unknown Database Vendor...!");
		}
	}

}
