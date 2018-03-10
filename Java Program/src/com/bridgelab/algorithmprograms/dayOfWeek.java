/******************************************************************************
 *  
 *  Purpose : To take user input proper date(D/M/Y) then FindOut day of Week.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.algorithmprograms;

import com.bridgelab.utility.Utility;

public class dayOfWeek {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the Day   : ");
		int day = utility.inputInteger();
		System.out.print("Enter the Month : ");
		int month = utility.inputInteger();
		System.out.print("Enter the Year  : ");
		int year = utility.inputInteger();

		Utility.calculateDayOfWeek(day, month, year);
	}
}
