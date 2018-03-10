/******************************************************************************
 *  
 *  Purpose : To take user input Then after Convert Decimal to Binary Format     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.algorithmprograms;

import com.bridgelab.utility.Utility;

public class toBinary {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter any Decimal Value : ");
		int decimal = utility.inputInteger();

		String binary = Utility.toBinary(decimal);

		for (int i = binary.length() - 1; i >= 0; i--) {
			System.out.print(binary.charAt(i));
		}
	}
}
