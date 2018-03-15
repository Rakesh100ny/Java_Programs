/******************************************************************************
 *  
 *  Purpose : Determine Anagram Using Stack implement LinkedList.    
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/


package com.bridgelab.dsaprograms;

 import com.bridgelab.utility.Utility;
import com.bridgelab.utility.Stack;

public class AnagramUsingStack
{
 public static void main(String[] args) 
 {
  Stack stack=new Stack(); 	 
  int lower=0;
  int high=1000;
  int array1[]=Utility.printPrimeNumber(lower,high);
  Integer array2[][]=Utility.printAnagramNumber(array1);

  for(int i=0;i<array2.length;i++)
  {
   for(int j=0;j<array2[i].length;j++)
   {
    stack.push(array2[i][j]);
   }
  }
  
  System.out.print("\nAnagram Number in this Range : [ ");
  stack.print();
  System.out.println("] ");  

 }
}
