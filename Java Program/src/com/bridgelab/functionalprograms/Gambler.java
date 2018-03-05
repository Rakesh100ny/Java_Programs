/******************************************************************************
 *  
 *  Purpose : Determine Gambler problem how many time he won and also calculate percentage  
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/



package com.bridgelab.functionalprograms;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class Gambler
{
 public static void main(String[] args)
 {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter Stake Value     : ");
  int $stack=scanner.nextInt();
  System.out.println("Enter Goal Value      : ");
  int $goal=scanner.nextInt();
  System.out.println("Enter Number of Times : ");
  int noOfTimes=scanner.nextInt();
  scanner.close();
  Utility.calculateGamblerWinLoss($stack,$goal,noOfTimes);  
 }
}
