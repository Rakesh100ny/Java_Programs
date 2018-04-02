package com.bridgelabz.functionalprograms;

import java.util.*;

public class TidyNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		String str = sc.next();
		char ch[] = str.toCharArray();
		int len = str.length();

		for (int i = len - 2; i >= 0; i--) {
			if (ch[i] > ch[i + 1]) {
				ch[i]--;
				for (int j = i + 1; j < len; j++) {
					ch[j] = '9';
				}
			}
		}

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		sc.close();
	}

}
