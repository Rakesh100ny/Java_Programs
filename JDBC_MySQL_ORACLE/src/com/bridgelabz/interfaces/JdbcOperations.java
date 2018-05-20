package com.bridgelabz.interfaces;

import java.sql.Connection;

import com.bridgelabz.pojo.Student;

public interface JdbcOperations 
{

	boolean insert(Student student, Connection connection);

	boolean update(Student student, Connection connection, int choice);

	boolean delete(Student student, Connection connection);

	void search(Student student, Connection connection, int choice);

	void display(Student student, Connection connection);

}
