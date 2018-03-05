/******************************************************************************
 *  
 *  Purpose : To use printWriter class and print 2D Array.
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/


package com.bridgelab.functionalprograms;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class Array2D
{
 public static void main(String[] args) 
 {
  Scanner scanner= new Scanner(System.in);
  System.out.println("Enter number of rows   : ");
  int row = scanner.nextInt();
  System.out.println("Enter number of colums : ");
  int colum = scanner.nextInt(); 
		        
  Integer array1[][]=Utility.takeInput(row,colum);
  Double  array2[][]=Utility.takeInput(row,colum);
  String  array3[][]=Utility.takeInput(row,colum);
  scanner.close();
  Utility.showOutput(array1,array2,array3,row,colum);
 }
}
