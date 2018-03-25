package com.bridgelab.functionalprograms;

import java.util.Arrays;
import java.util.Scanner;

public class FillArray {

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 //System.out.println("Enter the Item in Array : ");
	 //int n=sc.nextInt();
	 char arr[][]=new char[3][3];
	 
	 for(char ch[] : arr)
	 {
	  Arrays.fill(ch, '_');
	 }
	 
	 for (char[] row : arr) 
	 {
		
	  System.out.print("|_" + row[0]+  "_|_" + row[1]+ "_|_" +  row[2]+"_|");
	  System.out.print("\n");
 	 }
		System.out.print("\n");
	 sc.close();
	}
	

}
