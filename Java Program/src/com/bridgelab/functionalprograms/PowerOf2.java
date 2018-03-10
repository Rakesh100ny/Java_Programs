/******************************************************************************
 *  
 *  Purpose : To take user input number and print the table of PowerOf2 still number.    
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.functionalprograms;

import com.bridgelab.utility.Utility;

public class PowerOf2 {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter a Number : ");
		int number = utility.inputInteger();

		System.out.println("Printing the all Power Value untill " + number);

		double array[] = Utility.powerOf(number);

		for (int i = 0; i < array.length; i++) {
			System.out.println("Power of 2^" + i + " is : " + array[i]);

		}

	}
}
