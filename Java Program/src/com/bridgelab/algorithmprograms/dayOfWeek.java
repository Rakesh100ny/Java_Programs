/******************************************************************************
 *  
 *  Purpose : To take user input proper date(D/M/Y) then FindOut day of Week.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.algorithmprograms;

import java.util.*;
import com.bridgelab.utility.Utility;

public class dayOfWeek
{
 public static void main(String[] args) 
 {
  Scanner scanner=new Scanner(System.in);
  System.out.print("Enter the Day   : ");
  int day=scanner.nextInt();
  System.out.print("Enter the Month : ");
  int month=scanner.nextInt();
  System.out.print("Enter the Year  : ");
  int year=scanner.nextInt();
  scanner.close();  
  Utility.calculateDayOfWeek(day,month,year);
 }
}
