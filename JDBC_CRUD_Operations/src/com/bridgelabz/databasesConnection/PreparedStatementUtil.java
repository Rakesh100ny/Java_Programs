package com.bridgelabz.databasesConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgelabz.Main.PreparedStatementClient;
import com.bridgelabz.POJO.Student;



public class PreparedStatementUtil
{
  protected PreparedStatement insStud,updfNameStud,updlNameStud,updAddressStud,updDptStud,updMobileNoStud,delStud,schIdStud,schfNameStud,schlNameStud,schDptStud,schMobileNoStud,disStud;
  protected static int studId;
  Connection connection=null;
 
  public void init() 
  {
	try
	   {
		String dbVendor=PreparedStatementClient.getDbVendor();
		connection=DBConnectionManager.getConnection(dbVendor);
		insStud=connection.prepareStatement("insert into student value(?,?,?,?,?,?)");
		updfNameStud=connection.prepareStatement("update student set stud_fName=? where stud_id=?");
		updlNameStud=connection.prepareStatement("update student set stud_lName=? where stud_id=?");
		updAddressStud=connection.prepareStatement("update student set stud_Address=? where stud_id=?");
		updDptStud=connection.prepareStatement("update student set stud_dept=? where stud_id=?");
		updMobileNoStud=connection.prepareStatement("update student set stud_mNo=? where stud_id=?");
		delStud=connection.prepareStatement("delete from student where stud_id=?");
		schIdStud=connection.prepareStatement("select * from student where stud_id=?");
		schfNameStud=connection.prepareStatement("select * from student where stud_fName=?");
		schlNameStud=connection.prepareStatement("select * from student where stud_lName=?");
		schDptStud=connection.prepareStatement("select * from student where stud_dept=?");
		schMobileNoStud=connection.prepareStatement("select * from student where stud_mNo=?");
		disStud=connection.prepareStatement("select * from student");
	   
	   Statement statement;
	
		statement = connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select max(stud_id) as maxid from student");
		resultSet.next();
		studId=resultSet.getInt("maxid");
		
		if(studId==0)
		 studId=1;
		else
		 studId++;
		
	   }
	   catch (SQLException ex1) 
	   {
		ex1.printStackTrace();
	   }
	   catch (Exception ex2) {
			ex2.printStackTrace();
		}
	  }
}
   
