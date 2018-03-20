/******************************************************************************
 *  
 *  Purpose : To take user input String and Determine the permutation of String.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.functionalprograms;

import com.bridgelab.utility.Utility;

public class Permutation {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter a String : ");
		String string = utility.inputString();

		Utility.permutateString("",string);
	}
}
