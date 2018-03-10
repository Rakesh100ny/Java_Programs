/******************************************************************************
 *  
 *  Purpose : Determines the distance between Origin Points(0,0) to take another Points(x,y).
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.functionalprograms;

import com.bridgelab.utility.Utility;

public class Distance {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter First Argument  : ");
		int pointX = utility.inputInteger();
		System.out.println("Enter Second Argument : ");
		int pointY = utility.inputInteger();

		int originX = 0, originY = 0;

		Utility.calculateDistance((pointX - originX), (pointY - originY));
	}
}
