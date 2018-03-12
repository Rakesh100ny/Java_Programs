package com.bridgelab.dsaprograms;

import java.util.LinkedHashMap;

import com.bridgelab.utility.OrderList;
import com.bridgelab.utility.Utility;

public class HashFun {

	private static LinkedHashMap<Integer, OrderList<Integer>> map = new LinkedHashMap<Integer, OrderList<Integer>>();
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		  OrderList <Integer>list=new OrderList<Integer>();	 
		  String string[]=Utility.readListOfWords();

		  for(int i=0;i<string.length;i++)
		  {
			 int rem= Integer.parseInt(string[i])%11;
			 
			 if(map.containsKey(rem))
			 {
			  list=new OrderList();
			  list=map.get(rem);
			  list.insert(Integer.parseInt(string[i]));
			  map.put(rem, list);
			 }
			 else
			 {
			  list=map.get(rem);
			  list.insert(Integer.parseInt(string[i]));
			  map.put(rem, list);
			 }
			}
		
		    System.out.println(map);
		  	System.out.print("Elements persent in the File  : ");
			list.print();
			System.out.print(list);

			System.out.println();

			System.out.print("Enter the Key Which you want  : ");
			int key = utility.inputInteger();
			char input=' '; 
			int index = 0;
		    do
		    {
			boolean result = list.search(key);
			if (result) {
				index = list.index(key);
				System.out.print("Apply the action after Result : ");
				System.out.println(key + " Key is Found at the " + index + " index");
				list.remove(key);
				list.print();
				System.out.println("After Remove Item Print List  : " + list);
				//Utility.fileUpdate(list2, choice);
		
				System.out.println("File is Updated...!");
			} else {
				System.out.print("Apply the action after Result : ");
				System.out.println(key + " Key is not Found");
				list.add(key);
				list.print();
				System.out.println("After ADDing Item Print List  : " + list);
				//Utility.fileUpdate(list2, choice);
				System.out.println("File is Updated...!");
			}
			System.out.println("Do u wish to continue..type(Y/N)");
            input = utility.inputCharacter();
			addToSlot(key);
			
		    }while(input=='Y' || input=='y');
		    
			System.out.println(map);
		}

	private static void addToSlot(int key)
	{
		int remainder = 0;
		remainder =key % 11;
		System.out.println(remainder);
        map.get(remainder).add(key);
		
	}

}
