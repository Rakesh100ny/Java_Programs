package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		String string[] = Utility.readListOfWords();

		System.out.print("Print The Item Before Sorting : ");
		Utility.print(string);

		System.out.println();

		System.out.print("Print The Item After Sorting  : ");
		String sortedArray[]=Utility.mergeSort(string);
	    Utility.print(sortedArray);
	}

}
