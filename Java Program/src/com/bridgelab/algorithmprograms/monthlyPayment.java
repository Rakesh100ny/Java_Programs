/******************************************************************************
 *  
 *  Purpose : To take three user input then FindOut monthlyPayment using given formula      
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.algorithmprograms;

import java.util.*;
import com.bridgelab.utility.Utility;

public class monthlyPayment
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.print("Enter the Principal Amount : ");
  double principal=scanner.nextDouble();
  System.out.print("Enter the year             : ");
  double year=scanner.nextDouble();
  System.out.print("Enter the Amount Rate      : ");
  double rate=scanner.nextDouble();
  scanner.close();
  double payment=Utility.findMonthlyPayment(principal,year,rate);
	
  System.out.println("Monthly Payment : "+payment); 
 }

}
