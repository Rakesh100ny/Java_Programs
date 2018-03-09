package com.bridgelab.dsaprograms;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class NumberOfBinarySearchTree
{
 public static void main(String[] args) 
 {
  Scanner scanner=new Scanner(System.in);
  System.out.print("Enter the Number of Node : ");
  int node=scanner.nextInt();
  
  int array[]=new int[node];
  for(int i=0;i<array.length;i++)
  {
   array[i]=scanner.nextInt();	  
  }
 
  System.out.println();
  Utility.findNumberOfBinarySearchTree(array);
  
  
 }
}
