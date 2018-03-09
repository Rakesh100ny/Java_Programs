package com.bridgelab.dsaprograms;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class PrimeNumberUsing2DArray
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Lower Range : ");
		int start = scanner.nextInt();
		System.out.print("Enter the High Range  : ");
		int end = scanner.nextInt();
	
		if(start==0 && end==1000)
		{
		 int array[][]=Utility.print2DArrayPrime(start, end);
		 for (int i=0; i<array.length; i++)
		    {
		     for (int j=0; j<array[i].length; j++)
		      System.out.printf("%4s ",array[i][j]+ " ");
		     System.out.println();
		    }
		}
		else
		{
		 System.out.println("Invalid Input Range Please Enter Start Range 0 and Last Range 1000 ");	
		}
		
		
		scanner.close();
	}
}
