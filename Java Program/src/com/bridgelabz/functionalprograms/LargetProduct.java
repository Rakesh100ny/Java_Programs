package com.bridgelabz.functionalprograms;

import java.util.*;

public class LargetProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of Array : ");
		int number = sc.nextInt();

		int arr[] = new int[number];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("# " + (i + 1) + " Item --> ");
			arr[i] = sc.nextInt();
		}

		for (int x : arr) {
			System.out.print(x + " ");
		}

		int max = 0, index1 = 0, index2 = 0;
		max = arr[0] * arr[1];
		for (int i = 0; i < arr.length - 2; i++) {
			System.out.println("MAX : " + max);
			if (max < arr[i + 1] * arr[i + 2]) {
				max = arr[i + 1] * arr[i + 2];
				index1 = i + 1;
				index2 = i + 2;
			}

		}

		if (max == arr[0] || max == arr[1]) {
			index1 = 0;
			index2 = 1;
		}

		System.out.println();
		System.out.println("Max Product  : " + max);
		System.out.println("Index First  : " + index1);
		System.out.println("Index Second : " + index2);
		sc.close();
	}
}
