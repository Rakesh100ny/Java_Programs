/**************************************************************************************
 *  
 *  Purpose : To take user input amount Then after Find how many notes is given amount.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 *************************************************************************************/

package com.bridgelab.algorithmprograms;

import java.util.*;
import com.bridgelab.utility.Utility;

public class VendingMachine
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.print("Enter The Amount : ");
  int value=scanner.nextInt();
  Utility.findNotes(value);
  scanner.close();
 }
}
