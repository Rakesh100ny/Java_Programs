/**********************************************************************************
 *  
 *  Purpose : To given range Determine already prime No now Check Anagram and PalindromeNo       
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/


package com.bridgelab.algorithmprograms;

import java.util.*;
import com.bridgelab.utility.Utility;

public class NumberAnagramAndPalindrome
{
 public static void main(String[] args) 
 {
  Scanner scanner=new Scanner(System.in);
  System.out.print("Enter the Lower Range             : ");
  int lower=scanner.nextInt();
  System.out.print("Enter the High Range              : ");
  int high=scanner.nextInt();
  scanner.close();
  int array1[]=Utility.printPrimeNumber(lower,high);
  Utility.printPalindromeNumber(array1);
  System.out.println();
  int array2[]=Utility.printAnagramNumber(array1);
  System.out.print("\nAnagram Number in this Range    : [ ");
  for(int value : array2)
  {
   System.out.print(value+" ");	  
  }
  System.out.println("] ");  
 }
}
