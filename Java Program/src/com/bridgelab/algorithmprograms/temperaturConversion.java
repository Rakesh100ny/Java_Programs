/******************************************************************************
 *  
 *  Purpose : Determine Temperature Conversion System using Given Formula      
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.algorithmprograms;

import java.util.*;
import com.bridgelab.utility.Utility;

public class temperaturConversion
{
 public static void main(String[] args) 
 {
  Scanner scanner=new Scanner(System.in);
  System.out.print("Enter the Fahrenheit Temperature  : ");
  int fahrenheit=scanner.nextInt();
  System.out.print("Fahrenheit Temperature To Celsius : ");
  fahrenheit=Utility.FTC(fahrenheit);
  System.out.print(fahrenheit);
  
  
  System.out.print("Enter the Celsius Temperature     : ");
  int celsius =scanner.nextInt();
  System.out.print("Celsius Temperature To Fahrenheit : ");
  celsius=Utility.CTF(celsius);
  System.out.print(celsius);
  scanner.close();
  
 }
}
