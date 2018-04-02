/******************************************************************************
 *  
 *  Purpose : Determines FindTriples to check zero,first and second index sum is Zero or not.
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class FindTriples {
	public static void main(String[] args) {
		Utility utility = new Utility();

		System.out.print("Enter the Length of Array : ");
		int length = utility.inputInteger();
		int array[] = new int[length];

		array = Utility.takeInput(array);

		Utility.findTriples(array, length);

	}
}
