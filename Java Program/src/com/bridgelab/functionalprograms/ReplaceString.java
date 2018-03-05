/******************************************************************************
 *  
 *  Purpose : To take user input string and replace in the pattern using regexAPI.   
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.functionalprograms;

import java.util.*;
import com.bridgelab.utility.Utility;

public class ReplaceString
{
 public static void main(String[] args)
 {
	Scanner scanner = new Scanner (System.in);
    String string = "Hello <<UserName>>, How are you?";
     
    System.out.println("Enter User Name : ");
    String userName =scanner.next();
    scanner.close();
    boolean pattern=Utility.checkPattern(userName);
    
    if(!pattern)
      System.out.println("User Name Not Valid...!");
     else
       Utility.replaceWithUserName(string, userName);
 }
}