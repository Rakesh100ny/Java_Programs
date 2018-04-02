/******************************************************************************
 *  
 *  Purpose : Determine Gambler problem how many time he won and also calculate percentage  
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class Gambler {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter Stake Value     : ");
		int $stack = utility.inputInteger();
		System.out.println("Enter Goal Value      : ");
		int $goal = utility.inputInteger();
		System.out.println("Enter Number of Times : ");
		int noOfTimes = utility.inputInteger();

		Utility.calculateGamblerWinLoss($stack, $goal, noOfTimes);
	}
}
