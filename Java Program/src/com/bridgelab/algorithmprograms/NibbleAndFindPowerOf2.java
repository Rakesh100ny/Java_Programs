/**********************************************************************************
 *  
 *  Purpose : To take decimal input then after convert Binary Format then use swap
 *            concept and make new Binary Format then FindOut calculate PowerOf2 is
 *            equal or not.       
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.algorithmprograms;

import com.bridgelab.utility.Utility;

public class NibbleAndFindPowerOf2 {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter any Decimal Value : ");
		int decimal = utility.inputInteger();

		String binary = Utility.toBinary(decimal);
		int array[] = new int[8];

		if (binary.length() < 8) {
			array[0] = 0;
			for (int i = binary.length() - 1, j = 1; i >= 0 && j < array.length; i--, j++) {
				array[j] = (binary.charAt(i) - 48);
			}
		} else {
			for (int i = binary.length() - 1, j = 1; i >= 0 && j < array.length; i--, j++) {
				array[j] = (binary.charAt(i) - 48);
			}

		}

		array = Utility.divideAndNewNumber(array);

		double result = Utility.checkPowerOf2(array);

		if (result != 0) {
			System.out.println("The Number " + decimal + " is a Power Of 2.......!");
		} else {
			System.out.println("The Number " + decimal + " is not a Power Of 2...!");
		}
	}
}
