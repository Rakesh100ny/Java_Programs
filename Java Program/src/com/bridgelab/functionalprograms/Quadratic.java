/******************************************************************************
 *  
 *  Purpose : To take three user input and after Find delta using formula then after find outs roots.  
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.functionalprograms;

import java.util.Scanner;
import com.bridgelab.utility.Utility;

public class Quadratic 
{
 public static void main(String[] args) 
 {
  Scanner scanner = new Scanner(System.in);

  System.out.println("Enter the Values of a : ");
  float a = scanner.nextFloat();
  System.out.println("Enter the Values of b : ");
  float b = scanner.nextFloat();
  System.out.println("Enter the Values of c : ");
  float c = scanner.nextFloat();
		
  float delta=Utility.findDelta(a,b,c);
  scanner.close();
  Utility.findRoots(a,b,delta); 
  
 }
}
