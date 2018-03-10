/**********************************************************************************
 *  
 *  Purpose : To given range Determine already prime No now Check Anagram and PalindromeNo       
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.algorithmprograms;

import com.bridgelab.utility.Utility;

public class NumberAnagramAndPalindrome {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter the Lower Range             : ");
		int lower = utility.inputInteger();
		System.out.print("Enter the High Range              : ");
		int high = utility.inputInteger();

		int array1[] = Utility.printPrimeNumber(lower, high);
		Utility.printPalindromeNumber(array1);
		System.out.println();
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
