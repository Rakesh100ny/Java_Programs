package com.bridgelabz.implementation;

import java.sql.Connection;

import com.bridgelabz.interfaces.JdbcOperations;
import com.bridgelabz.pojo.Student;

public class UserOracleOperation implements JdbcOperations {

	@Override
	public boolean insert(Student student, Connection connection) {

	return false;	 
	}

	@Override
	public boolean update(Student student, Connection connection, int choice) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Student student, Connection connection) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void search(Student student, Connection connection, int choice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display(Student student, Connection connection) {
		// TODO Auto-generated method stub
		
	}

}
