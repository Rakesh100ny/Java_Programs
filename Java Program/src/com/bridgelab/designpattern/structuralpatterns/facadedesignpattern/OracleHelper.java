package com.bridgelab.designpattern.structuralpatterns.facadedesignpattern;

import java.sql.*;
public class OracleHelper {

	public static Connection getOracleDBConnection(){
		//get Oracle DB connection using connection parameters
		System.out.println("Connection is Established");
		return null;
	}
	
	public void generateOraclePDFReport(String tableName, Connection con){
		//get data from table and generate pdf report
		System.out.println("Generate PDF Report...!");
	}
	
	public void generateOracleHTMLReport(String tableName, Connection con){
		//get data from table and generate pdf report
		System.out.println("Generate HTML Report...!");
	}
	
}