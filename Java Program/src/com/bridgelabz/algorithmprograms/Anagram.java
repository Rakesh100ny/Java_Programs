/******************************************************************************
 *  
 *  Purpose : To take two user String then after determine Both Strings are Anagram or not.    
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class Anagram {
	public static void main(String[] args) {
		System.out.print("Enter The First String  : ");
		Utility utility = new Utility();
		String string1 = utility.inputString();
		System.out.print("Enter The Second String : ");
		String string2 = utility.inputString();

		boolean result = Utility.checkAnagram(string1, string2);

		if (result) {
			System.out.println("Both Strings are Anagram...!");
		} else {
			System.out.println("Both Strings are not Anagram...!");
		}
	}
}
