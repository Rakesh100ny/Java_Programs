/******************************************************************************
 *  
 *  Purpose : Determine Anagram and Store in 2DArray.    
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.dsaprograms;

import com.bridgelabz.utility.Utility;

public class AnagramUsing2DArray {

	public static void main(String[] args) {
		int lower = 0, high = 1000;
		int array1[] = Utility.printPrimeNumber(lower, high);
		Integer array2[][] = Utility.printAnagramNumber(array1);
		System.out.print("\nAnagram Number in this Range    : ");
		System.out.printf("[ %3d --> %3d ]", array2[0][0], array2[0][1]);
		System.out.println();

		for (int i = 1; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length - 1; j++) {
				System.out.printf("\t\t\t\t  [ %3d --> %3d ]", array2[i][j], array2[i][j + 1]);
			}
			System.out.println();
		}
	}
}
