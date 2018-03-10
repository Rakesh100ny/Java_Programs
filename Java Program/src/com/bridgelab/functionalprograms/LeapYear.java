/******************************************************************************
 *  
 *  Purpose : To take user input years and Determine it is Leap Year or not.    
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.functionalprograms;

import com.bridgelab.utility.Utility;

public class LeapYear {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter a leap year : ");

		String year = utility.inputString();

		boolean input = Utility.ensureInput(year);

		boolean value = Utility.checkLeapYear(year);

		if (!input) {
			System.out.println("Invalid Input...!");
		} else {
			if (value && input) {
				System.out.println(year + " is a Leap year...!");
			} else {
				System.out.println(year + " is not a Leap year...!");
			}
		}

	}
}
