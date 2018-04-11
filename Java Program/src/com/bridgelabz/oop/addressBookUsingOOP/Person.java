package com.bridgelabz.oop.addressBookUsingOOP;

import java.util.Comparator;

public class Person
{
	private String firstName;
	private String lastName;
	private String address;
	private long mobileNo;
	private String city;
	private String state;
	private int zip;
	
	public Person() {
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public int getZip() {
		return zip;
	}
	
	public static Comparator<Person> byNameComparator = new Comparator<Person>()
	{
			@Override
			public int compare(Person p1, Person p2) {
				   String person1 = p1.getLastName().toUpperCase();
				   String person2 = p2.getLastName().toUpperCase();

				   //ascending order
				   return person1.compareTo(person2);

				   //descending order
				   //return StudentName2.compareTo(StudentName1);
			}
	};
	
	public static Comparator<Person> byZipComparator = new Comparator<Person>()
	 {
			@Override
			public int compare(Person p1, Person p2) {
				  int person1 = p1.getZip();
				  int person2 = p2.getZip();

				   /*For ascending order*/
				   return person1-person2;

				   /*For descending order*/
				   //rollno2-rollno1;
			}
	};

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", mobileNo="
				+ mobileNo + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	
}
