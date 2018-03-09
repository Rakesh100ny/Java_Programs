package com.bridgelab.dsaprograms;

import static java.lang.System.*;

import java.util.*;

import com.bridgelab.utility.Utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Calendar
{
 public static void main(String[] args) 
 {
	 
	  System.out.println();
	  System.out.print("Enter the Month and Year in form [jan 2018] : ");
      Scanner scanner=new Scanner(System.in);
	  String dateInput=scanner.nextLine();
	  SimpleDateFormat sdf=new SimpleDateFormat("MMM y");
	  Date date=null;

	  try 
	  {
	   date=sdf.parse(dateInput);
	  }
	  catch(ParseException e)
	  {
	   out.println("Invalid date format ");
	   exit(1);
	  }
    
	  Utility.printCalender(date);
	  
  	 }
	}