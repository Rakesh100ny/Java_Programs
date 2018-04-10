package com.bridgelabz.oop.addressBookUsingOOP;


import java.io.File;

import java.io.IOException;
import java.util.ArrayList;


import com.bridgelabz.utility.Utility;

public class PersonManger 
{


	AddressManager addressManager = new AddressManager();
	String filePath = "/home/brideit/files/AddressBook/";
	private Utility utility = new Utility();
	Person person = new Person();
	ArrayList<Person> arrayList=new ArrayList<Person>();
	public ArrayList<Person> add(File fileName) throws IOException {

		ArrayList<Person> arrayList;
		arrayList = utility.readJsonDataConvertIntoList(fileName);

		System.out.println("List : " + arrayList);

		System.out.println("\n\t\t\t\tP E R S O N-D E T A I L S");
		System.out.println("\t\t\t\t----------------------------");
		System.out.print("\t\t\t\tEnter the First Name : ");
		String firstName = utility.inputString2();
		person.setFirstName(firstName);
		System.out.print("\t\t\t\tEnter the Last Name  : ");
		String lastName = utility.inputString2();
		person.setLastName(lastName);
		System.out.print("\t\t\t\tEnter the Address    : ");
		String address = utility.inputString2();
		person.setAddress(address);
		System.out.print("\t\t\t\tEnter the City       : ");
		String city = utility.inputString2();
		person.setCity(city);
		System.out.print("\t\t\t\tEnter the State      : ");
		String state = utility.inputString2();
		person.setState(state);
		System.out.print("\t\t\t\tEnter the Zip-Code   : ");
		int zip = utility.inputInteger();
		person.setZip(zip);
		System.out.print("\t\t\t\tEnter the Mobile No  : ");
		long mobileNo = utility.inputLong();
		person.setMobileNo(mobileNo);

		arrayList.add(person);
		System.out.println(arrayList);
		;
		return arrayList;
	}

	public ArrayList<Person> edit(File fileName) throws IOException {
		ArrayList<Person> arrayList = utility.readJsonDataConvertIntoList(fileName);
		System.out.println("\n\t\t\t\tEnter the Full-Name Which You are want to edit Details!");
		System.out.println();
		System.out.print("\t\t\t\tEnter the First Name : ");
		String firstName = utility.inputString2();
		System.out.print("\t\t\t\tEnter the Last Name  : ");
		String lastName = utility.inputString2();

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("r1");
			System.out.println("name : " + arrayList.get(i).getFirstName());
			if (firstName.equals(arrayList.get(i).getFirstName()) && lastName.equals(arrayList.get(i).getLastName())) {
				System.out.println("r2");
				System.out.println("\n\t\t\t\t   E D I T-D E T A I L S");
				System.out.println("\t\t\t\t--------------------------------");
				System.out.print("\n\t\t\t\tEdit User   Address : Enter 1");
				System.out.print("\n\t\t\t\tEdit User   City    : Enter 2");
				System.out.print("\n\t\t\t\tEdit User   State   : Enter 3");
				System.out.print("\n\t\t\t\tEdit Zip    Number  : Enter 4");
				System.out.print("\n\t\t\t\tEdit Mobile Number  : Enter 5");
				System.out.println();
				System.out.print("\n\t\t\t\tEnter Key Which You Want to Edit : ");
				int key = utility.inputInteger();

				String newAddress = "", newCity = "", newState = "";
				int newZip = 0;
				long newMobileno = 0;

				switch (key) {

				case 1:
					System.out.println("r3");
					System.out.print("\n\t\t\t\tEnter New User Address   : ");
					newAddress = utility.inputString2();
					arrayList.get(i).setAddress(newAddress);

					break;

				case 2:
					System.out.print("\n\t\t\t\tEnter New User City      : ");
					newCity = utility.inputString2();
					arrayList.get(i).setCity(newCity);
					break;

				case 3:
					System.out.print("\n\t\t\t\tEnter New User State     : ");
					newState = utility.inputString2();
					arrayList.get(i).setState(newState);

					break;

				case 4:
					System.out.print("\n\t\t\t\tEnter New Zip Code       : ");
					newZip = utility.inputInteger();
					arrayList.get(i).setZip(newZip);

					break;

				case 5:
					System.out.print("\n\t\t\t\tEnter New User MobileNo  : ");
					newMobileno = utility.inputLong();
					arrayList.get(i).setMobileNo(newMobileno);
					break;

				default:
					System.out.print("\n\t\t\t\tInvalid Key ...Please Enter Valid Key");

				}
				
				System.out.println("List : " + arrayList);
			}
		}
       return arrayList;
	}

	public ArrayList<Person> delete(File fileName) throws IOException 
	{
		ArrayList<Person> arrayList = utility.readJsonDataConvertIntoList(fileName);
		System.out.println("\n\t\t\t\tEnter the Full-Name Which You are want to edit Details!");
		System.out.println();
		System.out.print("\t\t\t\tEnter the First Name : ");
		String firstName = utility.inputString2();
		System.out.print("\t\t\t\tEnter the Last Name  : ");
		String lastName = utility.inputString2();

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("r1");
			System.out.println("name : " + arrayList.get(i).getFirstName());
			if (firstName.equals(arrayList.get(i).getFirstName()) && lastName.equals(arrayList.get(i).getLastName())) {
				System.out.println("r2");
			 	arrayList.remove(i);
			}
			System.out.println("List : " + arrayList);
		}
		return arrayList;
	}

	public ArrayList<Person> sort(File fileName) throws IOException {
		System.out.println("\n\t\t\t\t         S O R T-M E N U");
		System.out.println("\t\t\t\t------------------------------");
		System.out.print("\n\t\t\t\tSort By Name     : Enter 1");
		System.out.print("\n\t\t\t\tSort By Zip      : Enter 2");
		System.out.println();
		System.out.print("\n\t\t\t\tEnter the Choice : ");
		int choice = utility.inputInteger();

		switch (choice) {
		case 1:
			arrayList=sortByName(fileName);
			System.out.println("\n\t\t\t\tSuccessfully Sort By Name !");
			break;
		case 2:
			arrayList=sortByZip(fileName);
			System.out.println("\n\t\t\t\tSuccessfully Sort By Zip  !");
			break;
		default:
			System.out.println("Invalid Choice...Please Enter the Correct Choice !");
		}

		return arrayList;
	}

	private ArrayList<Person> sortByZip(File fileName) throws IOException 
	{
		arrayList = utility.readJsonDataConvertIntoList(fileName);
		
		String array[] = new String[arrayList.size()];              
		for(int j =0;j<arrayList.size();j++){
		  array[j] = arrayList.get(j).toString();
		}
		
		
		System.out.println("\n\t\t\t\tBefore Apply Sorting : ");
		System.out.println("\n\t\t\t\t[ ");
		for (String x : array) {
			System.out.println("\t\t\t\t   " + x);
		}
		System.out.println("\t\t\t\t]");

		System.out.println();

	/*	array = utility.bubbleSort(array);

		System.out.println("\n\t\t\t\tAfter Apply Sorting : ");
		System.out.println("\n\t\t\t\t[ ");
		System.out.println("\t\t\t\t                                            D I S P L A Y-B Y-N A M E");
		System.out.println(
				"\t\t\t\t------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"\t\t\t\tFirst_Name | Last_Name  |   User_Mobile   |     User_Address     | User_ZipCode |  User_City  |   User_State ");

		for(int i=0;i<array.length;i++)
		{
			System.out.printf("%40s  %10s  %16s  %14s  %19s  %15s  %11s", array[i], array[i], array[i],
					array[i], array[i], array[i], array[i]);	
		}
*/		
		return arrayList;
	}

	private ArrayList<Person> sortByName(File fileName) 
	{
		// TODO Auto-generated method stub
		return arrayList;
	}

	
}
