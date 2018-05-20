package com.bridgelabz.client;

import java.sql.Connection;
import java.sql.SQLException;

import com.bridgelabz.pojo.Student;
import com.bridgelabz.dbconnection.DBConnectionManager;
import com.bridgelabz.implementation.UserMysqlOperation;
import com.bridgelabz.interfaces.JdbcOperations;
import com.bridgelabz.utility.Utility;

public class PreparedStatementTest {

	public static void main(String[] args) {
		System.out.print("\n\n\n\t\t\t\t\tDatabase Vendor Information");
		System.out.print("\n\t\t\t\t\t---------------------------");
		System.out.print("\n\t\t\t\t\t MySQL  Database : Enter 1");
		System.out.print("\n\t\t\t\t\t ORACLE Database : Enter 2");
		System.out.print("\n\t\t\t\t\t---------------------------\n");

		System.out.print("\n\t\t\tEnter Choice Where you want to store the database : ");
		int dbChoice = Utility.getInstance().inputInteger();
		Connection connection = null;
		JdbcOperations operations = null;
		switch (dbChoice) {
		case 1:
			connection = DBConnectionManager.getConnectionMySql();
			operations = new UserMysqlOperation();
			break;

		case 2:
			connection = DBConnectionManager.getConnectionOracle();
			operations = new UserMysqlOperation();
//			operations = new UserOracleOperation();
			break;
		default:
			System.out.println("\n\t\t\t\tInvalid DB Vendor Choice...!");
			break;
		}
		Student student = null;
		boolean flag;
		int choice;
		char input = ' ';
		do {

			System.out.print("\n\t\t\t\t\t Employee Management System");
			System.out.print("\n\t\t\t\t\t----------------------------");
			System.out.print("\n\t\t\t\t\t Insert  Employee : Enter 1");
			System.out.print("\n\t\t\t\t\t Update  Employee : Enter 2");
			System.out.print("\n\t\t\t\t\t Delete  Employee : Enter 3");
			System.out.print("\n\t\t\t\t\t Serach  Employee : Enter 4");
			System.out.print("\n\t\t\t\t\t Display Employee : Enter 5");
			System.out.print("\n\t\t\t\t\t Exit             : Enter 6");
			System.out.print("\n\t\t\t\t\t----------------------------\n");

			System.out.print("\n\t\t\t\tEnter Choice : ");
			choice = Utility.getInstance().inputInteger();

			switch (choice) {
			case 1:
				
				try {
					if (connection.isClosed()) {
						switch (dbChoice) {
						case 1:
							connection = DBConnectionManager.getConnectionMySql();
							operations = new UserMysqlOperation();
							break;

						case 2:
							connection = DBConnectionManager.getConnectionOracle();
							operations = new UserMysqlOperation();
							//operations = new UserOracleOperation();
							break;
						default:
							System.out.println("\n\t\t\t\tInvalid DB Vendor Choice...!");
							break;
						}
					}
				} catch (SQLException e) {
					System.err.println("SQL alert[Test.java] : " + e.getMessage());
             	}

				System.out.println();
				System.out.println("\t\t\t\t\t       Student-Information");
				System.out.println("\t\t\t\t\t----------------------------------");
				student = new Student();
				student.setStudId(DBConnectionManager.getStudentId(connection));

				System.out.print("\t\t\t\t\tEnter Student First Name : ");
				student.setStudFirstName(Utility.getInstance().inputString());

				System.out.print("\t\t\t\t\tEnter Student Last Name  : ");
				student.setStudLastName(Utility.getInstance().inputString());

				System.out.print("\t\t\t\t\tEnter Student Address    : ");
				student.setStudAddress(Utility.getInstance().inputString());

				System.out.print("\t\t\t\t\tEnter Student Depart     : ");
				student.setStudDepartment(Utility.getInstance().inputString());

				System.out.print("\t\t\t\t\tEnter Student Mobile No  : ");
				student.setStudMobileNo(Utility.getInstance().inputLong());

				flag = operations.insert(student, connection);
				if (flag) {
					System.out.println("\n\t\t\t\tInsert Operation is sucessfully done...!");
				} else {
					System.out.println("\n\t\t\t\tInsert Operation is failed...!");
				}
				break;

			case 2:
				try {
					if (connection.isClosed()) {
						switch (dbChoice) {
						case 1:
							connection = DBConnectionManager.getConnectionMySql();
							operations = new UserMysqlOperation();
							break;

						case 2:
							connection = DBConnectionManager.getConnectionOracle();
							operations = new UserMysqlOperation();
							//operations = new UserOracleOperation();
							break;
						default:
							System.out.println("\n\t\t\t\tInvalid DB Vendor Choice...!");
							break;
						}
					}
				} catch (SQLException e) {
					System.err.println("SQL alert[Test.java] : " + e.getMessage());
             	}
				student = new Student();
				System.out.print("\n\t\tEnter the id Which Student You want to Update Information : ");
				student.setStudId(Utility.getInstance().inputInteger());

				System.out.println();
				System.out.print("\t\t\t\t\t     Update Employee");
				System.out.print("\n\t\t\t\t\t-----------------------");
				System.out.print("\n\t\t\t\t\t First  Name : Enter 1");
				System.out.print("\n\t\t\t\t\t Last   Name : Enter 2");
				System.out.print("\n\t\t\t\t\t Address     : Enter 3");
				System.out.print("\n\t\t\t\t\t Depart      : Enter 4");
				System.out.print("\n\t\t\t\t\t Mobile No   : Enter 5");
				System.out.print("\n\t\t\t\t\t-----------------------\n");

				System.out.print("\n\t\t\t\tEnter Choice : ");
				choice = Utility.getInstance().inputInteger();

				switch (choice) {
				case 1:
					System.out.print("\t\t\t\tEnter New First Name : ");
					student.setStudFirstName(Utility.getInstance().inputString());
					flag = operations.update(student, connection, choice);

					if (flag) {
						System.out.println("\n\t\t\t\tFirst Name is sucessfully Updated...!");
					} else {
						System.out.println("\n\t\t\t\tUpdation is failed...Please Check First Name Correctly!");
					}

					break;

				case 2:
					System.out.print("\t\t\t\tEnter New Last Name : ");
					student.setStudLastName(Utility.getInstance().inputString());
					flag = operations.update(student, connection, choice);
					if (flag) {
						System.out.println("\n\t\t\t\tLast Name is sucessfully Updated...!");
					} else {
						System.out.println("\n\t\t\t\tUpdation is failed...Please Check Last Name Correctly!");
					}

					break;

				case 3:
					System.out.println("\n\t\t\t\tEnter New Address   : ");
					student.setStudAddress(Utility.getInstance().inputString());
					flag = operations.update(student, connection, choice);
					if (flag) {
						System.out.print("\t\t\t\tAddress is sucessfully Updated...!");
					} else {
						System.out.print("\t\t\t\tUpdation is failed...Please Check Address Correctly!");
					}
					break;

				case 4:
					System.out.print("\t\t\t\tEnter New Depart    : ");
					student.setStudDepartment(Utility.getInstance().inputString());
					flag = operations.update(student, connection, choice);
					if (flag) {
						System.out.println("\n\t\t\t\tDepartment is sucessfully Updated...!");
					} else {
						System.out.println("\n\t\t\t\tUpdation is failed...Please Check Department Correctly!");
					}

					break;

				case 5:
					System.out.print("\t\t\t\tEnter New Mobile No : ");
					student.setStudMobileNo(Utility.getInstance().inputLong());
					flag = operations.update(student, connection, choice);
					if (flag) {
						System.out.println("\n\t\t\t\tMobile No is sucessfully Updated...!");
					} else {
						System.out.println("\n\t\t\t\tUpdation is failed...Please Check Mobile No Correctly!");
					}

					break;

				default:
					System.out.print("\t\t\t\tInvalid Choice...!");
				}
				System.out.println();

				break;

			case 3:
				try {
					if (connection.isClosed()) {
						switch (dbChoice) {
						case 1:
							connection = DBConnectionManager.getConnectionMySql();
							operations = new UserMysqlOperation();
							break;

						case 2:
							connection = DBConnectionManager.getConnectionOracle();
							operations = new UserMysqlOperation();
							//operations = new UserOracleOperation();
							break;
						default:
							System.out.println("\n\t\t\t\tInvalid DB Vendor Choice...!");
							break;
						}
					}
				} catch (SQLException e) {
					System.err.println("SQL alert[Test.java] : " + e.getMessage());
             	}
				System.out.print("\n\t\t\tEnter the id Which You want to delete Details : ");
				student = new Student();
				student.setStudId(Utility.getInstance().inputInteger());
				flag = operations.delete(student, connection);
				if (flag) {
					System.out.println("\n\t\t\t\t Student Id " + student.getStudId() + " is sucessfully Deleted...!");
				} else {
					System.out.println("\n\t\t\t\tUpdation is failed...Please Check Student Id Correctly!");
				}

				break;

			case 4:
				try {
					if (connection.isClosed()) {
						switch (dbChoice) {
						case 1:
							connection = DBConnectionManager.getConnectionMySql();
							operations = new UserMysqlOperation();
							break;

						case 2:
							connection = DBConnectionManager.getConnectionOracle();
							operations = new UserMysqlOperation();
							//operations = new UserOracleOperation();
							break;
						default:
							System.out.println("\n\t\t\t\tInvalid DB Vendor Choice...!");
							break;
						}
					}
				} catch (SQLException e) {
					System.err.println("SQL alert[Test.java] : " + e.getMessage());
             	}
				student = new Student();

				System.out.println();
				System.out.print("\t\t\t\t\t     Search Employee");
				System.out.print("\n\t\t\t\t\t-----------------------");
				System.out.print("\n\t\t\t\t\t Employee ID : Enter 1");
				System.out.print("\n\t\t\t\t\t First  Name : Enter 2");
				System.out.print("\n\t\t\t\t\t Last   Name : Enter 3");
				System.out.print("\n\t\t\t\t\t Department  : Enter 4");
				System.out.print("\n\t\t\t\t\t Mobile No   : Enter 5");
				System.out.print("\n\t\t\t\t\t-----------------------\n");

				System.out.print("\n\t\t\t\tEnter Choice : ");
				choice = Utility.getInstance().inputInteger();

				switch (choice) {
				case 1:
					System.out.print("\n\t\t\t\tEnter the id : ");
					student.setStudId(Utility.getInstance().inputInteger());
					operations.search(student, connection, choice);

					break;
				case 2:
					System.out.print("\n\t\t\t\tEnter the First Name : ");
					student.setStudFirstName(Utility.getInstance().inputString());
					operations.search(student, connection, choice);

					break;
				case 3:
					System.out.print("\n\t\t\t\tEnter the Last Name : ");
					student.setStudLastName(Utility.getInstance().inputString());
					operations.search(student, connection, choice);

					break;
				case 4:
					System.out.print("\n\t\t\t\tEnter the Department : ");
					student.setStudDepartment(Utility.getInstance().inputString());
					operations.search(student, connection, choice);
					break;
				case 5:
					System.out.print("\n\t\t\t\tEnter the Mobile NO : ");
					student.setStudMobileNo(Utility.getInstance().inputLong());
					operations.search(student, connection, choice);
					break;
				default:
					System.out.println("\n\t\t\t\tInvalid Choice...!");

				}

				break;

			case 5:
				try {
					if (connection.isClosed()) {
						switch (dbChoice) {
						case 1:
							connection = DBConnectionManager.getConnectionMySql();
							operations = new UserMysqlOperation();
							break;

						case 2:
							connection = DBConnectionManager.getConnectionOracle();
							operations = new UserMysqlOperation();
							//operations = new UserOracleOperation();
							break;
						default:
							System.out.println("\n\t\t\t\tInvalid DB Vendor Choice...!");
							break;
						}
					}
				} catch (SQLException e) {
					System.err.println("SQL alert[Test.java] : " + e.getMessage());
             	}
				student = new Student();
				operations.display(student, connection);

				break;

			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("\n\t\t\t\tInvalid Choice...!");
			}
			System.out.println();
			System.out.print("\n\t\t\t\tDo you Want to continue (Y/N) : ");
			input = Utility.getInstance().inputCharacter();
		} while (input == 'Y' || input == 'y');

	}
}
