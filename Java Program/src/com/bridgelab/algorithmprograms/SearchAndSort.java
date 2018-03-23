/******************************************************************************
 *  
 *  Purpose : In this Project Many Algorithm Apply Searching And Sorting      
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.algorithmprograms;

import com.bridgelab.utility.Utility;

public class SearchAndSort {
	public static void main(String[] args) {
		Utility utility = new Utility();
		long start1 = 0, end1 = 0, start2 = 0, end2 = 0, start3 = 0, end3 = 0, start4 = 0, end4 = 0, start5 = 0,
				end5 = 0, start6 = 0, end6 = 0;
		long elapsed1 = 0, elapsed2 = 0, elapsed3 = 0, elapsed4 = 0, elapsed5 = 0, elapsed6 = 0;
		char input;

		do {
			System.out.print("\n\t\t\t\t           S O R T & S E A R C H");
			System.out.print("\n\t\t\t\t--------------------------------------------");
			System.out.println();
			System.out.println("\t\t\t\t   Binary Search For Integer   : Enter 1 ");
			System.out.println();
			System.out.println("\t\t\t\t   Binary Search For String    : Enter 2 ");
			System.out.println();
			System.out.println("\t\t\t\t   Inseration Sort For Integer : Enter 3 ");
			System.out.println();
			System.out.println("\t\t\t\t   Inseration Sort For String  : Enter 4 ");
			System.out.println();
			System.out.println("\t\t\t\t   Bubble Sort For Integer     : Enter 5 ");
			System.out.println();
			System.out.print("\t\t\t\t   Bubble Sort For String      : Enter 6 ");
			System.out.println("\n\t\t\t\t---------------------------------------------");

			System.out.print("\n\t\t\t\t    Enter The Choice : ");
			int choice = utility.inputInteger();

			switch (choice) {

			case 1:
				start1 = System.currentTimeMillis();
				Integer array1[] = Utility.takeInputInteger();
				System.out.print("\n\t\t\t\tEnter the Key                 : ");
				int key1 = utility.inputInteger();
				System.out.print("\n\t\t\t\tPrint The Item Before Sorting : ");
				Utility.print(array1);
				System.out.print("\n\t\t\t\tPrint The Item After Sorting  : ");
				Utility.printSort(array1);
				array1 = Utility.binarySearch(array1, key1);
				end1 = System.currentTimeMillis();
				elapsed1 = (end1 - start1) / 1000;
				break;

			case 2:
				start2 = System.currentTimeMillis();
				String[] string1 = Utility.takeInputString();
				System.out.print("\n\t\t\t\tEnter the Key                  : ");
				String key2 = utility.inputString2();
				System.out.print("\n\t\t\t\tPrint The Item Before Sorting  : ");
				Utility.print(string1);
				System.out.print("\n\t\t\t\tPrint The Item After Sorting   : ");
				Utility.printSort(string1);
				string1 = Utility.binarySearch(string1, key2);
				end2 = System.currentTimeMillis();
				elapsed2 = (end2 - start2) / 1000;
				break;

			case 3:
				start3 = System.currentTimeMillis();
				Integer array2[] = Utility.takeInputInteger();
				System.out.print("\n\t\t\t\tPrint The Item Before Sorting  : ");
				Utility.print(array2);

				System.out.print("\n\t\t\t\tPrint The Item After Sorting   : ");
				array2 = Utility.inserationSort(array2);

				end3 = System.currentTimeMillis();
				elapsed3 = (end3 - start3) / 1000;
				break;

			case 4:
				start4 = System.currentTimeMillis();
				String[] string2 = Utility.takeInputString();
				System.out.print("\n\t\t\t\tPrint The Item Before Sorting  : ");
				Utility.print(string2);

				System.out.print("\n\t\t\t\tPrint The Item After Sorting   : ");
				string2 = Utility.inserationSort(string2);
				end4 = System.currentTimeMillis();
				elapsed4 = (end4 - start4) / 1000;
				break;

			case 5:
				start5 = System.currentTimeMillis();
				Integer array3[] = Utility.takeInputInteger();
				System.out.print("\n\t\t\t\tPrint The Item Before Sorting  : ");
				Utility.print(array3);

				System.out.print("\n\t\t\t\tPrint The Item After Sorting   : ");
				array3 = Utility.bubbleSort(array3);
				end5 = System.currentTimeMillis();
				elapsed5 = (end5 - start5) / 1000;
				break;

			case 6:
				start6 = System.currentTimeMillis();
				String[] string3 = Utility.takeInputString();

				System.out.print("\n\t\t\t\tPrint The Item Before Sorting  : ");
				Utility.print(string3);

				System.out.print("\n\t\t\t\tPrint The Item After Sorting   : ");
				string3 = Utility.bubbleSort(string3);
				end6 = System.currentTimeMillis();
				elapsed6 = (end6 - start6) / 1000;
				break;

			default:
				System.out.println("\n\t\t\t\tInvalid Choice Input...!");

			}
			System.out.print("\t\t\t\tUser Want To Continue (Y/N) : ");
			input = utility.inputCharacter();
		} while (input == 'Y' || input == 'y');

		System.out.println("\n\t\t\t\tBinary Search For Integer   : " + elapsed1);
		System.out.println("\n\t\t\t\tBinary Search For String    : " + elapsed2);
		System.out.println("\n\t\t\t\tInseration Sort For Integer : " + elapsed3);
		System.out.println("\n\t\t\t\tInseration Sort For String  : " + elapsed4);
		System.out.println("\n\t\t\t\tBubble Sort For Integer     : " + elapsed5);
		System.out.println("\n\t\t\t\tBubble Sort For String      : " + elapsed6);
	}
}