/******************************************************************************
 *  
 *  Purpose : Determines the distance between Origin Points(0,0) to take another Points(x,y).
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/


package com.bridgelab.functionalprograms;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class Distance 
{
 public static void main(String[] args)
 {
  Scanner scanner = new Scanner (System.in); 
  System.out.println("Enter First Argument  : ");
  int pointX = scanner.nextInt();
  System.out.println("Enter Second Argument : ");
  int pointY = scanner.nextInt();

  int originX=0,originY=0;
  scanner.close();
  Utility.calculateDistance((pointX-originX),(pointY-originY));
 }
}
