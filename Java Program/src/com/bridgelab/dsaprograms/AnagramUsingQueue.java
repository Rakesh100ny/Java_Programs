package com.bridgelab.dsaprograms;

import com.bridgelab.utility.QueueListForAnagram;
import com.bridgelab.utility.StackListForAnagram;
import com.bridgelab.utility.Utility;

public class AnagramUsingQueue 
{
 public static void main(String[] args) 
 {
	  QueueListForAnagram queue=new QueueListForAnagram(); 	 
	  int lower=0;
	  int high=1000;
	  int array1[]=Utility.printPrimeNumber(lower,high);
	  int array2[]=Utility.printAnagramNumber(array1);
	  System.out.print("\nAnagram Number in this Range    : [ ");
	  for(int value : array2)
	  {
	   System.out.print(value+" ");	  
	  }
	  System.out.println("] ");  
	  
	  for(int i=0;i<array2.length;i++)
	  {
	   queue.insert(array2[i]);	  
	  }
	  
	  System.out.print("\nAnagram Number in this Range    : [ ");
	  queue.print();
	    System.out.println("] ");  

 }
}
