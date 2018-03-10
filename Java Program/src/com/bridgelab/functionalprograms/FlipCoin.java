/******************************************************************************
 *  
 *  Purpose : Determine headPercentage as well as tailPercentage using Math class  
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.functionalprograms;

import com.bridgelab.utility.Utility;

public class FlipCoin {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter The Number : ");
		int number = utility.inputInteger();

		float headPercentage = Utility.calculateHeadPercentage(number);
		float tailPercentage = Utility.calculateTailPercentage(number);

		System.out.println("Percentage of Head " + headPercentage + "% " + "vs " + "Tails " + tailPercentage + "%");

	}
}
