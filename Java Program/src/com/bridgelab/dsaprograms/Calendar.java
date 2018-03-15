/******************************************************************************
 *  
 *  Purpose : To take date Input using SimpleDateFormat and make one Standard
 *            Format then after print Calendar     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.dsaprograms;




import com.bridgelab.utility.Utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calendar
{
 public static void main(String[] args) 
 {
	 
	  System.out.println();
	  System.out.print("Enter the Month and Year in form [jan 2018] : ");
      Utility utility=new Utility();
      String dateInput=utility.inputString();
     
	  SimpleDateFormat sdf=new SimpleDateFormat("MMM y");
	  Date date=null;

	  try 
	  {
	   date=sdf.parse(dateInput);
	  }
	  catch(ParseException e)
	  {
	   System.out.println("Invalid date format ");
	   System.exit(1);
	  }
    
	  Utility.printCalender(date);
	  
  	 }
	}