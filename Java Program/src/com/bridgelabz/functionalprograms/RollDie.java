package com.bridgelabz.functionalprograms;

import java.util.*;

public class RollDie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int value = 0;
		String s = "";
		int count = 0;
		for (int i = 0; i < n; i++) {
			int rand = (int) (Math.random() * 6) + 1;
			if (rand > 0) {
				arr[i] = rand;
			}
		}

		for (int x : arr) {
			System.out.print(x + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && arr[i] != value) {
					count++;
					value = arr[i];
					s += arr[i] + " ";
				}
			}
		}
		System.out.println();

		if (count == 0) {
			System.out.println("Cannot Repeat Dice");
		}
		System.out.println();
		if (s != "")
			System.out.println("Dice Is  : " + s);
		sc.close();
	}
}
