package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class PrimeFactor {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter Any Number Which You Want To Find Prime Factor : ");
		int number = utility.inputInteger();

		Utility.findPrimeFactor(number);
	}

}
