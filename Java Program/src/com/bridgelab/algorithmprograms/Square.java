/******************************************************************************
 *  
 *  Purpose : To take user input Then FindOut SqureRoot using given Formula.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.algorithmprograms;

import com.bridgelab.utility.Utility;

public class Square {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter Any Non-Zero Number : ");
		double number = utility.inputDouble();

		double t = Utility.findSqrt(number);
		System.out.println("Squre of Number is : " + t);

	}
}
