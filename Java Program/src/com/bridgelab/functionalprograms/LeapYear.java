/******************************************************************************
 *  
 *  Purpose : To take user input years and Determine it is Leap Year or not.    
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.functionalprograms;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class LeapYear 
{
 public static void main(String[] args) 
 {
   Scanner scanner=new Scanner(System.in);
   System.out.println("Enter a leap year : ");
   
   String year=scanner.next();
   
   boolean input=Utility.ensureInput(year);
   
   boolean value=Utility.checkLeapYear(year);
   scanner.close();
   if(!input)
   {
	 System.out.println("Invalid Input...!");   
   }
   else
   {
	   if(value && input)
	   {
		System.out.println(year+" is a Leap year...!");
	   }
	   else
	   {
		System.out.println(year+" is not a Leap year...!");
	   }
   }
 
  }
 }
