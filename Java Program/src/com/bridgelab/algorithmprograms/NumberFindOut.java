/******************************************************************************
 *  
 *  Purpose : To take number then after ask to user think any Digit between given 
 *            range and Determine what exact number think user apply binarySearch.        
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.algorithmprograms;

import java.util.Scanner;
import com.bridgelab.utility.Utility;

import static java.lang.Math.*;

public class NumberFindOut
{

	public static void main(String[] args)
	{
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter The Number : ");
     int number=scanner.nextInt();
     scanner.close();
     int lower=0;
     int high=(int)pow(2,number)-1;
     System.out.println("Think Any Digit Between 0 to "+high);
     
     int result=Utility.findGuessingNumber(lower,high);
     
     if(result!=-1)
      System.out.println("Your Digit is : "+result);
     else
      System.out.println("Invalid Number...!");	 
		
	}

}
