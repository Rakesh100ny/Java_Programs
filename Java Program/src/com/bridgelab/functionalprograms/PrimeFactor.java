package com.bridgelab.functionalprograms;

import com.bridgelab.utility.Utility;

public class PrimeFactor {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter Any Number Which You Want To Find Prime Factor : ");
		int number = utility.inputInteger();

		Utility.findPrimeFactor(number);
	}

}
