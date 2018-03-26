/**********************************************************************************
 *  
 *  Purpose : Determine Strucral Design Pattern and In FacadeDesignPattern It is 
 *            FacadePatternDataBaseConnection Main class Taking Action.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ***********************************************************************************/

package com.bridgelab.designpattern.structuralpatterns.facadedesignpattern;

import java.sql.*;
public class FacadePatternDataBaseConnection {
	 public static void main(String[] args) 
	 {
			String tableName="Employee";
			
			//generating MySql HTML report and Oracle PDF report without using Facade
			Connection con = (Connection) MySqlHelper.getMySqlDBConnection();
			MySqlHelper mySqlHelper = new MySqlHelper();
			mySqlHelper.generateMySqlHTMLReport(tableName, con);
			
			Connection con1 = (Connection) OracleHelper.getOracleDBConnection();
			OracleHelper oracleHelper = new OracleHelper();
			oracleHelper.generateOraclePDFReport(tableName, con1);
			
			//generating MySql HTML report and Oracle PDF report using Facade
			HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
			HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
		}

	}