/******************************************************************************
 *  
 *  Purpose : Maintain User Details and making Setter and Getter.
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.utility;

public class UserDetails {
	private String firstName;
	private String lastName;
	private String mobileNo;
	private String date;

	public UserDetails() {
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getDate() {
		return date;
	}
}
