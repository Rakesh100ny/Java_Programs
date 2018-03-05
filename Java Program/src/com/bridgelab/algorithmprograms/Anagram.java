/******************************************************************************
 *  
 *  Purpose : To take two user String then after determine Both Strings are Anagram or not.    
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.algorithmprograms;

import java.util.Scanner;
import com.bridgelab.utility.Utility;

public class Anagram 
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.print("Enter The First String  : ");
  String string1=scanner.next();
  
  System.out.print("Enter The Second String : ");
  String string2=scanner.next();
  
  scanner.close();
  
  boolean result=Utility.CheckAnagram(string1,string2);
 
  if(result)
  {
	System.out.println("Both Strings are Anagram...!");   
  }
  else
  {
	System.out.println("Both Strings are not Anagram...!");  
  }	 
 }
}
