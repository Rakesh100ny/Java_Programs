/******************************************************************************
 *  
 *  Purpose : Determine Number of Binary Search Tree Using CatalinFormula  .    
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.dsaprograms;

import com.bridgelab.utility.Utility;

public class NumberOfBinarySearchTree {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the Number of Node : ");
		int node = utility.inputInteger();

		int array[] = new int[node];
		for (int i = 0; i < array.length; i++) {
			array[i] = utility.inputInteger();
		}

		System.out.println();
		Utility.findNumberOfBinarySearchTree(array);
	}
}
