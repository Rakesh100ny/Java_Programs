package com.bridgelabz.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionManager {
	static final String DB_VENDOR_MYSQL = "mysql";
	static final String DB_VENDOR_ORACLE = "oracle";

	public static Connection getConnectionMySql() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc_crud";
		String user = "root";
		String password = "1900";
		Connection connection = null;

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.err.println("\nCNF alert[DBConnectionManager.java] - " + e.getMessage());
		} catch (SQLException e) {
			System.err.println("\nSQL alert[DBConnectionManager.java] - " + e.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return connection;

	}

	public static Connection getConnectionOracle() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "myuser";
		String password = "1900";
		Connection connection = null;

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {
			System.err.println("\nSQL alert[DBConnectionManager.java] - " + e.getMessage());
		} catch (SQLException e) {
			System.err.println("\nSQL alert[DBConnectionManager.java] - " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return connection;
	}

	public static int getStudentId(Connection connection) {

		int studId = 0;
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select max(stud_id) as maxid from student");
			resultSet.next();
			studId = resultSet.getInt("maxid");

			if (studId == 0)
				studId = 1;
			else
				studId++;
		} catch (SQLException e) {
			System.err.println("\nSQL alert[DBConnectionManager.java] - " + e.getMessage());
		}

		return studId;

	}
}
