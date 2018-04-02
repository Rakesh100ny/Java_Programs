/******************************************************************************
 *  
 *  Purpose : To take number then after ask to user think any Digit between given 
 *            range and Determine what exact number think user apply binarySearch.        
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import static java.lang.Math.*;

import com.bridgelabz.utility.Utility;

public class NumberFindOut {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter The Number : ");
		int number = utility.inputInteger();

		int lower = 0;
		int high = (int) pow(2, number) - 1;
		System.out.println("Think Any Digit Between 0 to " + high);

		int result = Utility.findGuessingNumber(lower, high);

		if (result != -1)
			System.out.println("Your Digit is : " + result);
		else
			System.out.println("Invalid Number...!");

	}

}
