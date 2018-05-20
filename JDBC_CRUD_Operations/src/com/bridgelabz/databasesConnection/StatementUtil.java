package com.bridgelabz.databasesConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgelabz.POJO.Employee;

public class StatementUtil
{
 static String insQuery = "", updateQuery = "", delQuery = "", searchQuery = "", disQuery = "";
 static int empId;
 static Connection connection = null;

 public static int getEmpid() {
		Statement statement;
		try {
			Employee employee = new Employee();
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select max(emp_id) as maxid from employee");
			resultSet.next();
			empId = resultSet.getInt("maxid");

			if (empId == 0)
				empId = 101;
			else
				empId++;

			employee.setEmpId(empId);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empId;
	}
 
 public static String getQuery(String identify, Employee employee) {
		String Result = "";
		switch (identify) {
		case "insert":
			insQuery = "insert into employee(emp_id,emp_fName,emp_lName,emp_Address,emp_salary,emp_mNo) values ("
					+ getEmpid() + ",'" + employee.getEmpFirstName() + "','"
					+ employee.getEmpLastName() + "','" + employee.getEmpAddress() + "'," + employee.getEmpSalary()
					+ "," + employee.getEmpMobile() + ")";
			Result = insQuery;

			break;
		case "updatefName":
			updateQuery = "update employee set emp_fName='" + employee.getEmpFirstName() + "' where emp_id="
					+ employee.getEmpId() + " ";
			Result = updateQuery;

			break;
		case "updatelName":
			updateQuery = "update employee set emp_lName='" + employee.getEmpLastName() + "' where emp_id="
					+ employee.getEmpId() + " ";
			Result = updateQuery;
			break;
		case "updateAddress":
			updateQuery = "update employee set emp_Address='" + employee.getEmpAddress() + "' where emp_id="
					+ employee.getEmpId() + " ";
			Result = updateQuery;
			break;

		case "updateSalary":
			updateQuery = "update employee set emp_mNo='" + employee.getEmpMobile() + "' where emp_id="
					+ employee.getEmpId() + " ";
			Result = updateQuery;
			break;
		case "updateMobileNo":
			updateQuery = "update employee set emp_salary='" + employee.getEmpSalary() + "' where emp_id="
					+ employee.getEmpId() + " ";
			Result = updateQuery;
		case "delete":
			delQuery = "delete from employee where emp_id=" + employee.getEmpId() + "";
			Result = delQuery;

			break;
		case "searchId":
			searchQuery = "select * from employee where emp_id=" + employee.getEmpId() + "";
			Result = searchQuery;

			break;
		case "searchfName":
			searchQuery = "select * from employee where emp_fName=" + employee.getEmpFirstName() + "";
			Result = searchQuery;
			break;
		case "searchlName":
			searchQuery = "select * from employee where emp_lName=" + employee.getEmpLastName() + "";
			Result = searchQuery;
			break;

		case "searchSalary":
			searchQuery = "select * from employee where emp_salary=" + employee.getEmpSalary() + "";
			Result = searchQuery;

			break;
		case "searchMobileNo":
			searchQuery = "select * from employee where emp_mNo=" + employee.getEmpMobile() + "";
			Result = searchQuery;

			break;
		case "display":
			disQuery = "select * from employee";
			Result = disQuery;

			break;
		default:
			System.out.println("Invalid Identify...Please Check correctly");

		}
		return Result;
	}


}
