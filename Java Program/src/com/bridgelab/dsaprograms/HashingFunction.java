package com.bridgelab.dsaprograms;

import java.util.Scanner;



import java.util.LinkedHashMap;
import java.util.Map;

import com.bridgelab.utility.OrderList;

import com.bridgelab.utility.Utility;

public class HashingFunction 
{
	public static void toSearchElem(int data,LinkedHashMap <Integer,OrderList> map)
	{
	int rem = data/11;
	
	if(map.get(rem).search(data)) {
		map.get(rem).remove(data);
		
		System.out.println("Element remove");
		Utility.fileUpdate(map);
	}
	else {
		map.get(rem).insert(data);
		System.out.println("Element add");
		Utility.fileUpdate(map);
	}
   }

	 public static void main(String[] args)
	 {
	  	  Scanner scanner=new Scanner(System.in);
	  OrderList list=new OrderList();	 
	  String string[]=Utility.readListOfWords();

	  for (int i = 0; i < string.length; i++) {
			list.insert(Integer.parseInt(string[i]));
		}
    
	  for(String s : string)
	  {
	   System.out.print(s+" ");	  
	  }
	  
	  
	  int intArr[] = new int[string.length];
		
		for(int i=0;i<string.length;i++){
			intArr[i] = Integer.valueOf(string[i]);
		}
		
		OrderList Obj1 = new OrderList();
		OrderList Obj2 = new OrderList();
		OrderList Obj3 = new OrderList();
		OrderList Obj4 = new OrderList();
		OrderList Obj5 = new OrderList();
		OrderList Obj6 = new OrderList();
		OrderList Obj7 = new OrderList();
		OrderList Obj8 = new OrderList();
		OrderList Obj9 = new OrderList();
		OrderList Obj10 = new OrderList();
		
		LinkedHashMap<Integer, OrderList> map=new LinkedHashMap<Integer, OrderList>();
		
		for(int i=0;i<intArr.length;i++) {
			
			int rem=intArr[i]%11;
			
			switch(rem) {
			
			case 0:Obj1.insert(intArr[i]);
					break;
			case 1:Obj2.insert(intArr[i]);
				break;
			case 2:Obj3.insert(intArr[i]);
				break;
			case 3:Obj4.insert(intArr[i]);
				break;
			case 4:Obj5.insert(intArr[i]);
				break;
			case 5:Obj6.insert(intArr[i]);
				break;
			case 6:Obj7.insert(intArr[i]);
				break;
			case 7:Obj8.insert(intArr[i]);
				break;
			case 8:Obj9.insert(intArr[i]);
				break;
			case 9:Obj10.insert(intArr[i]);
				break;
			default :
					
			}
		}
		map.put(0,Obj1);
		map.put(1,Obj2);
		map.put(2,Obj3);
		map.put(3,Obj4);
		map.put(4,Obj5);
		map.put(5,Obj6);
		map.put(6,Obj7);
		map.put(7,Obj8);
        map.put(8,Obj9);
		map.put(9,Obj10);
		
		System.out.println("Elements Successfully inserted in the appropriate slot..");
		
	  System.out.print("Elements persent in the File  : ");
	  list.print();
	  System.out.print(list);
	  System.out.println();
      System.out.print("Enter the Key Which you want  : ");
	  int key=scanner.nextInt();
	  toSearchElem(key,map);
	
			for (int j = 0; j < map.size(); j++) {
				System.out.println( j+" "+ map.get(j) + "  ");
}
		  
      System.out.println("updated list successfully added in file :");
	 }
	 }