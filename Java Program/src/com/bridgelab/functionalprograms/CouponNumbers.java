package com.bridgelab.functionalprograms;

import com.bridgelab.utility.Utility;

public class CouponNumbers {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter The Number : ");
		int number = utility.inputInteger();

		int count = Utility.calculateDistinctCoupon(number);
		System.out.println("No. of Count     : "+count);

	}
}
