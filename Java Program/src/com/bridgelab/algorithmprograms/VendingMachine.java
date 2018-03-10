/**************************************************************************************
 *  
 *  Purpose : To take user input amount Then after Find how many notes is given amount.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 *************************************************************************************/

package com.bridgelab.algorithmprograms;

import com.bridgelab.utility.Utility;

public class VendingMachine {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter The Amount : ");
		int value = utility.inputInteger();
		Utility.findNotes(value);

	}
}
