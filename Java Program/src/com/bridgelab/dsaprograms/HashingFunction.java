package com.bridgelab.dsaprograms;

import java.util.Scanner;
import java.util.*;
import com.bridgelab.utility.OrderList;
import com.bridgelab.utility.ReadFileData;
import com.bridgelab.utility.Utility;

public class HashingFunction 
{
	 public static void main(String[] args)
	 {
	  	 
	  Scanner scanner=new Scanner(System.in);
	  OrderList list=new OrderList();	 
	  String string1[]=Utility.readListOfWords();

ArrayList<Integer> arrlist = new ArrayList<>();
	  LinkedHashMap<Integer, OrderList<Integer>> map = new LinkedHashMap<Integer, OrderList<Integer>>();
		for (Integer integer : arrlist){
			
			int slotNo = integer%11;
			list = map.get(slotNo);
			if( list == null )
			{
				list = new OrderList<Integer>();
				map.put(slotNo, list);
			}
			list.insert(integer);
}
	  
	  System.out.print("Elements persent in the File  : ");
	  list.print();
	  System.out.print(list);
	  System.out.println();
      System.out.print("Enter the Key Which you want  : ");
	  int key=scanner.nextInt();
	  int index=0;
	  boolean result=list.search(key);
	  int SlotNumber= key%11;
		
	  list = map.get(SlotNumber);
	  if(result)
	  {
	   index=list.index(key);
	   System.out.print("Apply the action after Result : ");
	   System.out.println(key+" Key is Found at the "+index+" index");
	   list.remove(key);
	   list.print();
	   System.out.println("After Remove Item Print List  : "+list);
	   Utility.fileUpdate(list);
	   System.out.println("File is Updated...!");
	  }
	  else
      {
	   System.out.print("Apply the action after Result : ");	  
	   System.out.println(key+" Key is not Found");	  
	   list.add(key);
	   list.print();
	   System.out.println("After ADDing Item Print List  : "+list); 
	   Utility.fileUpdate(list); 
	   System.out.println("File is Updated...!");
	  }
	  
	  
	 }
	}