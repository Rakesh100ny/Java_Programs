package com.bridgelabz.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelabz.utility.DatabaseUtill;
import com.bridgelabz.interfaces.JdbcOperations;
import com.bridgelabz.pojo.Student;

public class UserMysqlOperation implements JdbcOperations {

	int rowAffected = 0;

	@Override
	public boolean insert(Student student, Connection connection) {
		PreparedStatement insStud = null;
		try {
			insStud = connection.prepareStatement("insert into student values(?,?,?,?,?,?)");
			insStud.setInt(1, student.getStudId());
			insStud.setString(2, student.getStudFirstName());
			insStud.setString(3, student.getStudLastName());
			insStud.setString(4, student.getStudAddress());
			insStud.setString(5, student.getStudDepartment());
			insStud.setLong(6, student.getStudMobileNo());

			rowAffected = insStud.executeUpdate();

			if (rowAffected > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			System.err.println("SQL alert[UserMySqlOperation.java] : " + e.getMessage());
		} finally {

			DatabaseUtill.close(insStud);
			DatabaseUtill.close(connection);
		}

		return false;
	}

	@Override
	public boolean update(Student student, Connection connection, int choice) {
		PreparedStatement updfNameStud = null, updlNameStud = null, updAddressStud = null, updDptStud = null,
				updMobileNoStud = null;
		switch (choice) {
		case 1:
			try {
				updfNameStud = connection.prepareStatement("update student set stud_fName=? where stud_id=?");
				updfNameStud.setString(1, student.getStudFirstName());
				updfNameStud.setInt(2, student.getStudId());
				rowAffected = updfNameStud.executeUpdate();

				if (rowAffected > 0) {
					return true;
				} else {
					return false;
				}

			} catch (SQLException e) {
				System.err.println("SQL alert[UserMySqlOperation.java] : " + e.getMessage());

			} finally {

				DatabaseUtill.close(updfNameStud);
				DatabaseUtill.close(connection);
			}

			break;

		case 2:
			try {
				updlNameStud = connection.prepareStatement("update student set stud_lName=? where stud_id=?");
				updlNameStud.setString(1, student.getStudLastName());
				updlNameStud.setInt(2, student.getStudId());
				rowAffected = updlNameStud.executeUpdate();

				if (rowAffected > 0) {
					return true;
				} else {
					return false;
				}
			} catch (SQLException e) {
				System.err.println("SQL alert[UserMySqlOperation.java] : " + e.getMessage());
			} finally {

				DatabaseUtill.close(updlNameStud);
				DatabaseUtill.close(connection);
			}

			break;

		case 3:
			try {
				updAddressStud = connection.prepareStatement("update student set stud_Address=? where stud_id=?");

				updAddressStud.setString(1, student.getStudAddress());
				updAddressStud.setInt(2, student.getStudId());

				rowAffected = updAddressStud.executeUpdate();

				if (rowAffected > 0) {
					return true;
				} else {
					return false;
				}
			} catch (SQLException e) {
				System.err.println("SQL alert[UserMySqlOperation.java] : " + e.getMessage());
			} finally {

				DatabaseUtill.close(updAddressStud);
				DatabaseUtill.close(connection);
			}
			break;
		case 4:
			try {
				updDptStud = connection.prepareStatement("update student set stud_dept=? where stud_id=?");
				updDptStud.setString(1, student.getStudDepartment());
				updDptStud.setInt(2, student.getStudId());

				rowAffected = updDptStud.executeUpdate();

				if (rowAffected > 0) {
					return true;
				} else {
					return false;
				}
			} catch (SQLException e) {
				System.err.println("SQL alert[UserMySqlOperation.java] : " + e.getMessage());
			} finally {

				DatabaseUtill.close(updDptStud);
				DatabaseUtill.close(connection);
			}
			break;
		case 5:
			try {
				updMobileNoStud = connection.prepareStatement("update student set stud_mNo=? where stud_id=?");

				updMobileNoStud.setLong(1, student.getStudMobileNo());
				updMobileNoStud.setInt(2, student.getStudId());

				rowAffected = updMobileNoStud.executeUpdate();

				if (rowAffected > 0) {
					return true;
				} else {
					return false;
				}
			} catch (SQLException e) {
				System.err.println("SQL alert[UserMySqlOperation.java] : " + e.getMessage());
			} finally {

				DatabaseUtill.close(updAddressStud);
				DatabaseUtill.close(connection);
			}
			break;
		default:
			System.out.println("\n\t\t\t\tInvalid Choice...!");

		}

		return false;
	}

	@Override
	public boolean delete(Student student, Connection connection) {
		PreparedStatement delStud = null;
		try {
			delStud = connection.prepareStatement("delete from student where stud_id=?");
			delStud.setInt(1, student.getStudId());
			rowAffected = delStud.executeUpdate();
			if (rowAffected > 0) {
				return true;
			} else {
				return false;
			}

		} catch (SQLException e) {
			System.err.println("SQL alert[UserMySqlOperation.java] : " + e.getMessage());

		} finally {

			DatabaseUtill.close(delStud);
			DatabaseUtill.close(connection);
		}

		return false;
	}

	@Override
	public void search(Student student, Connection connection, int choice) {
		PreparedStatement schIdStud = null, schfNameStud = null, schlNameStud = null, schDptStud = null,
				schMobileNoStud = null;
		ResultSet resultSet = null;
		switch (choice) {
		case 1:
			try {
				schIdStud = connection.prepareStatement("select * from student where stud_id=?");
				schIdStud.setInt(1, student.getStudId());
				resultSet = schIdStud.executeQuery();
				while (resultSet.next()) {

					System.out.println();
					System.out.println("\t\t\t\tID         : " + resultSet.getInt("stud_id"));
					System.out.println("\t\t\t\tFirst Name : " + resultSet.getString("stud_fName"));
					System.out.println("\t\t\t\tLast Name  : " + resultSet.getString("stud_lName"));
					System.out.println("\t\t\t\tAddress    : " + resultSet.getString("stud_Address"));
					System.out.println("\t\t\t\tDepart     : " + resultSet.getString("stud_dept"));
					System.out.println("\t\t\t\tMobile     : " + resultSet.getLong("stud_mNo"));
				}

			} catch (SQLException e) {
				System.err.println("SQL alert[UserMySqlOperation.java] : " + e.getMessage());

			} finally {

				DatabaseUtill.close(schIdStud);
				DatabaseUtill.close(connection);
		         DatabaseUtill.close(resultSet);

			}

			break;
		case 2:
			try {
			schfNameStud = connection.prepareStatement("select * from student where stud_fName=?");
				

				schfNameStud.setString(1, student.getStudFirstName());
				resultSet = schfNameStud.executeQuery();

				while (resultSet.next()) {

					System.out.println();
					System.out.println("\t\t\t\tID         : " + resultSet.getInt("stud_id"));
					System.out.println("\t\t\t\tFirst Name : " + resultSet.getString("stud_fName"));
					System.out.println("\t\t\t\tLast Name  : " + resultSet.getString("stud_lName"));
					System.out.println("\t\t\t\tAddress    : " + resultSet.getString("stud_Address"));
					System.out.println("\t\t\t\tDepart     : " + resultSet.getString("stud_dept"));
					System.out.println("\t\t\t\tMobile     : " + resultSet.getLong("stud_mNo"));
				}

			} catch (SQLException e) {
				System.err.println("SQL alert[UserMySqlOperation.java] : " + e.getMessage());

			} finally {

				DatabaseUtill.close(schfNameStud);
				DatabaseUtill.close(connection);
		         DatabaseUtill.close(resultSet);

			}

			break;
		case 3:			try {
			schlNameStud=connection.prepareStatement("select * from student where stud_lName=?");

			schlNameStud.setString(1, student.getStudLastName());
	        resultSet=schlNameStud.executeQuery();
		
			while (resultSet.next()) {

				System.out.println();
				System.out.println("\t\t\t\tID         : " + resultSet.getInt("stud_id"));
				System.out.println("\t\t\t\tFirst Name : " + resultSet.getString("stud_fName"));
				System.out.println("\t\t\t\tLast Name  : " + resultSet.getString("stud_lName"));
				System.out.println("\t\t\t\tAddress    : " + resultSet.getString("stud_Address"));
				System.out.println("\t\t\t\tDepart     : " + resultSet.getString("stud_dept"));
				System.out.println("\t\t\t\tMobile     : " + resultSet.getLong("stud_mNo"));
			}

		} catch (SQLException e) {
			System.err.println("SQL alert[UserMySqlOperation.java] : " + e.getMessage());

		} finally {

			DatabaseUtill.close(schlNameStud);
			DatabaseUtill.close(connection);
	         DatabaseUtill.close(resultSet);

		}

			break;
		case 4:
			try {
				schDptStud=connection.prepareStatement("select * from student where stud_dept=?");

				schDptStud.setString(1, student.getStudDepartment());
		        resultSet=schDptStud.executeQuery();
				

				while (resultSet.next()) {

					System.out.println();
					System.out.println("\t\t\t\tID         : " + resultSet.getInt("stud_id"));
					System.out.println("\t\t\t\tFirst Name : " + resultSet.getString("stud_fName"));
					System.out.println("\t\t\t\tLast Name  : " + resultSet.getString("stud_lName"));
					System.out.println("\t\t\t\tAddress    : " + resultSet.getString("stud_Address"));
					System.out.println("\t\t\t\tDepart     : " + resultSet.getString("stud_dept"));
					System.out.println("\t\t\t\tMobile     : " + resultSet.getLong("stud_mNo"));
				}

			} catch (SQLException e) {
				System.err.println("SQL alert[UserMySqlOperation.java] : " + e.getMessage());

			} finally {

				DatabaseUtill.close(schDptStud);
				DatabaseUtill.close(connection);
		         DatabaseUtill.close(resultSet);

			}

			break;
		case 5:			try {
			
			 schMobileNoStud=connection.prepareStatement("select * from student where stud_mNo=?");
			 System.out.println("mNo : "+student.getStudMobileNo());
			 schMobileNoStud.setString(1, student.getStudMobileNo()+"");
			 resultSet=schMobileNoStud.executeQuery();
			

			while (resultSet.next()) {

				System.out.println();
				System.out.println("\t\t\t\tID         : " + resultSet.getInt("stud_id"));
				System.out.println("\t\t\t\tFirst Name : " + resultSet.getString("stud_fName"));
				System.out.println("\t\t\t\tLast Name  : " + resultSet.getString("stud_lName"));
				System.out.println("\t\t\t\tAddress    : " + resultSet.getString("stud_Address"));
				System.out.println("\t\t\t\tDepart     : " + resultSet.getString("stud_dept"));
				System.out.println("\t\t\t\tMobile     : " + resultSet.getString("stud_mNo"));
			}

		} catch (SQLException e) {
			System.err.println("SQL alert[UserMySqlOperation.java] : " + e.getMessage());
		
		} finally {

			DatabaseUtill.close(schMobileNoStud);
			DatabaseUtill.close(connection);
	         DatabaseUtill.close(resultSet);

		}

			break;
		default:
			System.out.println("\n\t\t\t\tInvalid Choice...!");
		}
	}

	@Override
	public void display(Student student, Connection connection) {
        PreparedStatement disStud = null;
        ResultSet resultSet=null;
		try {
			disStud = connection.prepareStatement("select * from student");
			resultSet=disStud.executeQuery();
	        while(resultSet.next())
	        {
		         
		         System.out.println();
		         System.out.println("\t\t\t\tID         : " + resultSet.getInt("stud_id"));
		         System.out.println("\t\t\t\tFirst Name : " + resultSet.getString("stud_fName"));
		         System.out.println("\t\t\t\tLast Name  : " + resultSet.getString("stud_lName"));
		         System.out.println("\t\t\t\tAddress    : " + resultSet.getString("stud_Address"));
		         System.out.println("\t\t\t\tDepart     : " + resultSet.getString("stud_dept"));
		         System.out.println("\t\t\t\tMobile     : " + resultSet.getLong("stud_mNo"));
		           	
	        }
		
		}  catch (SQLException e) {
			System.err.println("SQL alert[UserMySqlOperation.java] : " + e.getMessage());

		} finally {

			DatabaseUtill.close(disStud);
			DatabaseUtill.close(connection);
	         DatabaseUtill.close(resultSet);

		}

   
			
		
	}

}
