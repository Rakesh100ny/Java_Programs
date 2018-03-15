package com.bridgelab.dsaprograms;

import com.bridgelab.utility.Utility;

public class HashingFunction {

	public static void main(String[] args) {
		String string[] = Utility.readListOfWords();
		Utility.hashingFunction(string);
	}
}