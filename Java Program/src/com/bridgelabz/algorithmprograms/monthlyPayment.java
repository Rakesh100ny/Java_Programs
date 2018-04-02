/******************************************************************************
 *  
 *  Purpose : To take three user input then FindOut monthlyPayment using given formula      
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class monthlyPayment {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the Principal Amount : ");
		double principal = utility.inputDouble();
		System.out.print("Enter the year             : ");
		double year = utility.inputDouble();
		System.out.print("Enter the Amount Rate      : ");
		double rate = utility.inputDouble();

		double payment = Utility.findMonthlyPayment(principal, year, rate);

		System.out.println("Monthly Payment : " + payment);
	}

}
