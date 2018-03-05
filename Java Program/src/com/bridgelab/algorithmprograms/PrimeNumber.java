/***********************************************************************************
 *  
 *  Purpose : To take two range 0 to 1000 then after Calculate between range prime No     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ***********************************************************************************/

package com.bridgelab.algorithmprograms;

import java.util.*;
import com.bridgelab.utility.Utility;

public class PrimeNumber 
{
 public static void main(String[] args) 
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter the Lower Range : ");
  int lower=scanner.nextInt();
  System.out.println("Enter the High Range  : ");
  int high=scanner.nextInt();
  scanner.close();
  int array[]=Utility.printPrimeNumber(lower,high);
  System.out.print("\nPrime Number in this Range : [ ");
  for(int value : array)
  {
   System.out.print(value+" ");	  
  }
  System.out.print(" ]");
 }
}
