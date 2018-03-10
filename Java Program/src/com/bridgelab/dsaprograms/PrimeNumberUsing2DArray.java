/******************************************************************************
 *  
 *  Purpose : Determine Prime Number and Store 2DArray.    
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.dsaprograms;


import com.bridgelab.utility.Utility;

public class PrimeNumberUsing2DArray
{
	public static void main(String[] args)
	{
		int lower=0,high=1000;
		 int array[][]=Utility.print2DArrayPrime(lower, high);
		 for (int i=0; i<array.length; i++)
		    {
		     for (int j=0; j<array[i].length; j++)
		      System.out.printf("%4s ",array[i][j]+ " ");
		     System.out.println();
		    }
		
		

	}
}
