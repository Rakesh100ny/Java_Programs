package com.bridgelab.dsaprograms;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class AnagramUsing2DArray
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Lower Range : ");
		int lower=scanner.nextInt();
		System.out.println("Enter the High Range  : ");
		int high=scanner.nextInt();
		scanner.close();
		if(lower==0 && high==1000)
		{
			int array[][]=Utility.print2DArrayPrime(lower, high);

			Utility.print2DAnagramNumber(array);

		}
		else
		{
			System.out.println("Invalid Input Range Please Enter Start Range 0 and Last Range 1000 ");	
		}
	}
}
