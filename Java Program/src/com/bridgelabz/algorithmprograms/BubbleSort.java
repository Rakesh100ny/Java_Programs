/******************************************************************************
 *  
 *  Purpose : To Read the Data from file to given file path then after apply BuubleSort Algorithm.    
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class BubbleSort {
	public static void main(String[] args) {
		String string[] = Utility.readListOfWords();

		System.out.print("Print The Item Before Sorting : ");
		Utility.print(string);

		System.out.println();

		System.out.print("Print The Item After Sorting  : ");
		string = Utility.bubbleSort(string);
	}
}
