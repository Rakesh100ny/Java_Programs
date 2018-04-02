/******************************************************************************
 *  
 *  Purpose : To take user input Then FindOut SqureRoot using given Formula.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class Square {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter Any Non-Zero Number : ");
		double number = utility.inputDouble();

		double square = Utility.findSquare(number);
		System.out.println("Squre of Number is : " + square);

	}
}
