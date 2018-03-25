/***********************************************************************************
 *  
 *  Purpose : Create a Chain for each Slot to avoid Collision. If a number searched
 *            is found then pop it or else push it. Use Map of Slot Numbers and 
 *            Ordered LinkedList.
 *            Format then after print Calendar     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ***********************************************************************************/

package com.bridgelab.dsaprograms;

import com.bridgelab.utility.Utility;

public class HashingFunction {

	public static void main(String[] args) {
		String string[] = Utility.readHashingValue();
		Utility.hashingFunction(string);
	}
}