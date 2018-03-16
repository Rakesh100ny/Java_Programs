package com.bridgelab.oop;

import org.json.simple.parser.ParseException;

import com.bridgelab.utility.UserDetails;
import com.bridgelab.utility.Utility;

public class RegularExpression
{
 public static void main(String[] args) throws ParseException 
 {
  Utility utility=new Utility();
  UserDetails information=new UserDetails();
  System.out.println("\n\t\t\t  U S E R-D E T A I L S");
  System.out.println("\t\t\t------------------------");
  System.out.print("\t\t\tEnter the First Name    : ");
  String firstName=utility.inputString();
  information.setFirstName(firstName);
  System.out.print("\t\t\tEnter the Last Name     : ");
  String lastName=utility.inputString();
  information.setLastName(lastName);
  System.out.print("\t\t\tEnter the Mobile No     : ");
  String mobileNo=utility.inputString();
  information.setMobileNo(mobileNo);
  System.out.print("\t\t\tEnter Date [dd-mm-yy]   : ");
  String date=utility.inputString();
  information.setDate(date);
  String string[]=utility.readListOfWords();
  String string2="";
  for(int i=0;i<string.length;i++)
  {
   string2+=string[i]+" ";	  
  }
  
  boolean isCorrectName=Utility.checkName(firstName,lastName);
  boolean isCorrectMobileNo=Utility.checkMobile(mobileNo);
  boolean isCoorectDate=Utility.checkDate(date);
  if(isCoorectDate && isCorrectMobileNo && isCorrectName)
  {
   Utility.regularExpressionApply(information,string2);
  }
 
 }
}
