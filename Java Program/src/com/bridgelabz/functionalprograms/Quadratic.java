/******************************************************************************
 *  
 *  Purpose : To take three user input and after Find delta using formula then after find outs roots.  
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class Quadratic {
	public static void main(String[] args) {
		Utility utility = new Utility();

		System.out.println("Enter the Values of a : ");
		float a = utility.inputFloat();
		System.out.println("Enter the Values of b : ");
		float b = utility.inputFloat();
		System.out.println("Enter the Values of c : ");
		float c = utility.inputFloat();

		float delta = Utility.findDelta(a, b, c);

		Utility.findRoots(a, b, delta);

	}
}
