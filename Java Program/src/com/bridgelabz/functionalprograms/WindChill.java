/******************************************************************************
 *  
 *  Purpose : To take two user input one is temperature and second one is speed 
 *            Then after Find out WindChill using given formula    
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class WindChill {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter Temperature   : ");
		double temperature = utility.inputDouble();

		System.out.println("Enter Speed of Wind : ");
		double speed = utility.inputDouble();

		double windChil = Utility.calculateWindChill(temperature, speed);

		if (windChil > 0)
			System.out.println("Wind Chill is      : " + windChil);
		else
			System.out.println("Invalid Input...!");

	}
}
