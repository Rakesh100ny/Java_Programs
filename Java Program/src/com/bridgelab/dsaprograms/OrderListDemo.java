package com.bridgelab.dsaprograms;

import java.util.Scanner;
import com.bridgelab.utility.OrderList;
import com.bridgelab.utility.Utility;

public class OrderListDemo
{
 public static void main(String[] args)
 {
      OrderList list=new OrderList();	 
	  Scanner scanner=new Scanner(System.in);
	  String string[]=Utility.readListOfWords();
	

	  System.out.println();
	  
	  for(int i=0;i<string.length;i++)
	  {
	   list.insert(Integer.parseInt(string[i]));
	  }

	  System.out.print("Elements persent in the File  : ");
	  list.print();
	  System.out.print(list);
	 
	  System.out.println();

	  System.out.print("Enter the Key Which you want  : ");
	  int key=scanner.nextInt();
	  
	  
	  int index=0;
	  boolean result=list.search(key);
	  if(result)
	  {
	   index=list.index(key);
	   System.out.print("Apply the action after Result : ");
	   System.out.println(key+" Key is Found at the "+index+" index");
	   list.remove(key);
	   list.print();
	   System.out.println("After Remove Item Print List  : "+list);
	  }
	  else
	  {
	   System.out.print("Apply the action after Result : ");	  
	   System.out.println(key+" Key is not Found");	  
	   list.add(key);
	   list.print();
	   System.out.println("After ADDing Item Print List  : "+list);  }
	 
	}
 }
