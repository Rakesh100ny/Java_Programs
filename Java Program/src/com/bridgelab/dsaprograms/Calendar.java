package com.bridgelab.dsaprograms;

import static java.lang.System.*;

import java.util.Date;
import java.util.Scanner;
import java.text.*;

public class Calendar
{
 public static void main(String[] args) 
 {
	  int days;
	  out.println();
	  out.print("Enter the month and year in form [nov 2017] : ");
      Scanner scanner=new Scanner(System.in);
	  String date=scanner.next();
	  SimpleDateFormat sdf=new SimpleDateFormat("MMM y");
	  Date d=null;

	  try 
	  {
	   d=sdf.parse(date);
	  }
	  catch(ParseException e)
	  {
	   out.println("Invalid date format ");
	   exit(1);
	  }

	  @SuppressWarnings("deprecation")
	int first=d.getDay();
	  @SuppressWarnings("deprecation")
	int mon=d.getMonth();  
	  out.println("SUN MON TUE WED THU FRI SAT");
	  
	  if(mon==0 || mon==2 || mon==4 || mon==6 || mon==7 || mon==9 || mon==11)  
	  {
	    days=31;
	  } 
	  else
	  if(mon==1)
	  {
	   days=28; 
	  }                                                 
	  else
	  {   
	   days=30;
	  }
	  
	  int j; 
	  for(j=1;j<=first;j++)
	   out.print("    ");
	 
	  for(int i=1,sp=j;i<=days;i++,sp++)
	  {
	   if(sp==7)
	   {
	    out.printf("%3d ",i);
	    out.println();  
	    sp=0;
	   }   
	   else 
	    out.printf("%3d ",i);
	  }
	  out.println("\n");
	 }
	}