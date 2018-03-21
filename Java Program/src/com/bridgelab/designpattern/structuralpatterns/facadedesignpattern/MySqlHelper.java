package com.bridgelab.designpattern.structuralpatterns.facadedesignpattern;

import java.sql.*;
public class MySqlHelper {
	
	public static Connection getMySqlDBConnection()
	{
		//get MySql DB connection using connection parameters
	    System.out.println("Connection is Established");
		return null;
	}
	
	public void generateMySqlPDFReport(String tableName, Connection con)
	{
	 	//get data from table and generate pdf report
		System.out.println("Generate PDF Report...!");
	}
	
	public void generateMySqlHTMLReport(String tableName, Connection con){
		//get data from table and generate pdf report
		System.out.println("Generate HTML Report...!");
	}
}