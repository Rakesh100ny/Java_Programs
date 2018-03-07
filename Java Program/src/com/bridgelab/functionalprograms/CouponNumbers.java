package com.bridgelab.functionalprograms;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class CouponNumbers 
{
 public static void main(String[] args) 
 {
  Scanner scanner=new Scanner(System.in);
  System.out.print("Enter The Number : ");
  int number=scanner.nextInt();
  
  int count=Utility.calculateDistinctCoupon(number);
  System.out.println();
  System.out.println(count);
 }
}
