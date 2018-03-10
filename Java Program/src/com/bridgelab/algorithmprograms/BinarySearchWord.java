/******************************************************************************
 *  
 *  Purpose : To Read the Data from file to given file path then after apply BinarySearch Algorithm.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.algorithmprograms;

import com.bridgelab.utility.Utility;

public class BinarySearchWord {
	public static void main(String[] args) {
		Utility utility = new Utility();
		String string2[] = Utility.readListOfWords();

		System.out.print("Print The Item Before Sorting  : ");
		Utility.print(string2);

		System.out.println();

		System.out.print("Print The Item After Sorting   : ");
		Utility.printSort(string2);

		System.out.println();

		System.out.print("Enter the Key Value            : ");
		String string = utility.inputString();

		System.out.println();
		string2 = Utility.binarySearch(string2, string);

	}

}
