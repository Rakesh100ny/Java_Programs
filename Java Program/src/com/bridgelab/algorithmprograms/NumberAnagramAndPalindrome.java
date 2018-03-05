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
  System.out.println("Enter the Lower Range : ");
  int lower=scanner.nextInt();
  System.out.println("Enter the High Range  : ");
  int high=scanner.nextInt();
  scanner.close();
  int array[]=Utility.printPrimeNumber(lower,high);
	  
  Utility.printAnagramNumber(array);
  Utility.printPalindromeNumber(array);
 }


}
