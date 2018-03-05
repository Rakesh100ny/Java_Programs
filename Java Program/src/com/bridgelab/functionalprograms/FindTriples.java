/******************************************************************************
 *  
 *  Purpose : Determines FindTriples to check zero,first and second index sum is Zero or not.
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/



package com.bridgelab.functionalprograms;

/**
 * @author RakeshSoni
 * @version 1.0
 * @since   05-03-2018
 */

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class FindTriples 
{
 public static void main(String[] args) 
 {
	Scanner scanner=new Scanner(System.in);
		
   	System.out.print("Enter the Length of Array : ");
	int length=scanner.nextInt();
	int array[]=new int [length];
	
	array=Utility.takeInput(array);
		
	Utility.findTriples(array,length);
	scanner.close();
 }
}
