/******************************************************************************
 *  
 *  Purpose : To take user input Then FindOut SqureRoot using given Formula.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.algorithmprograms;

import java.util.*;
import com.bridgelab.utility.Utility;

public class Sqrt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Any Non-Zero Number : ");
		double number = scanner.nextDouble();

		double t = Utility.findSqrt(number);
		System.out.println("Squre of Number is : " + t);
		scanner.close();
	}
}
