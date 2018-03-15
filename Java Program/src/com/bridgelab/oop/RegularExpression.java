package com.bridgelab.oop;

import com.bridgelab.utility.UserDetails;
import com.bridgelab.utility.Utility;

public class RegularExpression
{
 public static void main(String[] args) 
 {
  Utility utility=new Utility();
  UserDetails information=new UserDetails();
  System.out.print("Enter the First Name    : ");
  String firstName=utility.inputString();
  information.setFirstName(firstName);
  System.out.print("Enter the Last Name     : ");
  String lastName=utility.inputString();
  information.setLastName(lastName);
  System.out.print("Enter the Mobile No     : ");
  String mobileNo=utility.inputString();
  information.setMobileNo(mobileNo);
  System.out.print("Enter Date [dd-mm-yy]   : ");
  String date=utility.inputString();
  information.setDate(date);
  String string[]=utility.readListOfWords();
  String string2="";
  for(int i=0;i<string.length;i++)
  {
   string2+=string[i]+" ";	  
  }
  
  Utility.regularExpressionApply(information,string2);
 }
}
