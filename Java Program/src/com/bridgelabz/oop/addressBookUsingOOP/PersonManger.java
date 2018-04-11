package com.bridgelabz.oop.addressBookUsingOOP;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import com.bridgelabz.utility.Utility;

public class PersonManger implements PersonInterface
{
	AddressManager addressManager = new AddressManager();
	String filePath = "/home/brideit/files/AddressBook/";
	private Utility utility = new Utility();
	
	
	
	public ArrayList<Person> add(ArrayList<Person> arrayList) throws IOException 
	{
		Person person = new Person();

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
		System.out.println();
		System.out.println("List : "+arrayList);
		
		return arrayList;
	}

	public ArrayList<Person> edit(ArrayList<Person> arrayList) throws IOException {
		System.out.println("\n\t\t\t\tEnter the Full-Name Which You are want to edit Details!");
		System.out.println();
		System.out.print("\t\t\t\tEnter the First Name : ");
		String firstName = utility.inputString2();
		System.out.print("\t\t\t\tEnter the Last Name  : ");
		String lastName = utility.inputString2();

		for (int i = 0; i < arrayList.size(); i++) {
			if (firstName.equals(arrayList.get(i).getFirstName()) && lastName.equals(arrayList.get(i).getLastName())) {
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
				System.out.println();
				System.out.println("List : " + arrayList);
			}
		}
       return arrayList;
	}

	public ArrayList<Person> delete(ArrayList<Person> arrayList) throws IOException 
	{
		System.out.println("\n\t\t\t\tEnter the Full-Name Which You are want to edit Details!");
		System.out.println();
		System.out.print("\t\t\t\tEnter the First Name : ");
		String firstName = utility.inputString2();
		System.out.print("\t\t\t\tEnter the Last Name  : ");
		String lastName = utility.inputString2();

		for (int i = 0; i < arrayList.size(); i++) {
			if (firstName.equals(arrayList.get(i).getFirstName()) && lastName.equals(arrayList.get(i).getLastName())) {
			 	arrayList.remove(i);
			}
		}
		System.out.println();
		System.out.println("List : " + arrayList);
		return arrayList;
	}

	public ArrayList<Person> sort(ArrayList<Person> arrayList) throws IOException {
		System.out.println("\n\t\t\t\t         S O R T-M E N U");
		System.out.println("\t\t\t\t------------------------------");
		System.out.print("\n\t\t\t\tSort By Name     : Enter 1");
		System.out.print("\n\t\t\t\tSort By Zip      : Enter 2");
		System.out.println();
		System.out.print("\n\t\t\t\tEnter the Choice : ");
		int choice = utility.inputInteger();

		switch (choice) {
		case 1:
			arrayList=sortByName(arrayList);
			System.out.println("\n\t\t\t\tSuccessfully Sort By Name !");
			break;
		case 2:
			arrayList=sortByZip(arrayList);
			System.out.println("\n\t\t\t\tSuccessfully Sort By Zip  !");
			break;
		default:
			System.out.println("Invalid Choice...Please Enter the Correct Choice !");
		}

		return arrayList;
	}

	private ArrayList<Person> sortByZip(ArrayList<Person> arrayList) throws IOException 
	{
		 /* Sorting on Rollno property*/
		   System.out.println("Sorting Accounting to Person ZipCode : ");
		   Collections.sort(arrayList, Person.byZipComparator);
		   for(Person str: arrayList){
				System.out.println(str);
		   }

		return arrayList;
	}

	private ArrayList<Person> sortByName(ArrayList<Person> arrayList) 
	{
		 System.out.println("Sorting Accounting to Person Name : ");
		 Collections.sort(arrayList, Person.byNameComparator);

		   for(Person str: arrayList){
				System.out.println(str);
		   }
	     return arrayList;	  
	}

	
}
