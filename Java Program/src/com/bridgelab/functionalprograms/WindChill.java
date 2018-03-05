/******************************************************************************
 *  
 *  Purpose : To take two user input one is temperature and second one is speed 
 *            Then after Find out WindChill using given formula    
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.functionalprograms;

import java.util.Scanner;
import com.bridgelab.utility.Utility;

public class WindChill
{
 public static void main(String[] args) 
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter Temperature   : ");
  double temperature=scanner.nextDouble();

  System.out.println("Enter Speed of Wind : ");
  double speed=scanner.nextDouble();
	
  double windChil=Utility.calculateWindChill(temperature,speed);
  scanner.close();

  if(windChil>0)
   System.out.println("Wind Chill is      : "+windChil);
  else
   System.out.println("Invalid Input...!");	 
   
 }
}
