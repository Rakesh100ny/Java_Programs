/******************************************************************************
 *  
 *  Purpose : To take user input String and Determine the permutation of String.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.functionalprograms;

import java.util.*;
import com.bridgelab.utility.Utility;

public class Permutation
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.print("Enter a String : ");
  String string=scanner.next();
  scanner.close();
  Utility.permutateString(string);
 }
}
