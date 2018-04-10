package com.bridgelabz.oop.addressBookUsingOOP;

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

	public void Update(String address,long mobileNo,String city,String state,int zip)
	{
	 this.address=address;
	 this.mobileNo=mobileNo;
	 this.city=city;
	 this.state=state;
	 this.zip=zip;
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

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", mobileNo="
				+ mobileNo + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	
}
