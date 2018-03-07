package com.bridgelab.dsaprograms;

import java.util.*;
import com.bridgelab.utility.Utility;
import com.bridgelab.utility.ReadFileData;
import com.bridgelab.utility.UnorderList;


public class UnorderListDemo
{
 public static void main(String[] args)
 {
  UnorderList list=new UnorderList();	 
  Scanner scanner=new Scanner(System.in);
  
  char input=' '; 
  do
  {
   System.out.println("*********************************************************");
   System.out.println();
   System.out.println("* String implement Using LinkedList  : Enter choice 1 *");	  
   System.out.println();
   System.out.println("* Integer implement Using LinkedList : Enter choice 2 *");	  
   System.out.println();
   System.out.println("*********************************************************");

   
   System.out.print("Enter Choice Which Type of Data You Want to Append : ");
   int choice=scanner.nextInt();

   switch (choice) 
   {
    case 1  : String string[]=ReadFileData.readListOfWords(choice);
    	      for(int i=0;i<string.length;i++)
              {
	           list.append(string[i]);
	          }
	          System.out.print("Elements persent in the File  : ");
	          list.print();
	          System.out.print(list);
	 
	          System.out.println();

	          System.out.print("Enter the Key Which you want  : ");
	          String key=scanner.next();
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
	          break;
 	       
   case 2 :  String string2[]=Utility.readListOfWords();
	         for(int i=0;i<string2.length;i++)
   			 {
	          list.append(Integer.parseInt(string2[i]));
	         }
	         System.out.print("Elements persent in the File  : ");
	         list.print();
	         System.out.print(list);
	 
	         System.out.println();

	         System.out.print("Enter the Key Which you want  : ");
	         int key2=scanner.nextInt();
	         int index2=0;
	         boolean result2=list.search(key2);
	         if(result2)
	         {
	          index2=list.index(key2);
	          System.out.print("Apply the action after Result : ");
	          System.out.println(key2+" Key is Found at the "+index2+" index");
	          list.remove(key2);
	          list.print();
	          System.out.println("After Remove Item Print List  : "+list);
	          Utility.fileUpdate(list);
	          System.out.println("File is Updated...!");
	         }
	         else
	         {
	          System.out.print("Apply the action after Result : ");	  
	          System.out.println(key2+" Key is not Found");	  
	          list.add(key2);
	          list.print();
	          System.out.println("After ADDing Item Print List  : "+list); 
	          Utility.fileUpdate(list); 
	          System.out.println("File is Updated...!");
	         }
	         break;
	         
    default : System.out.println("Invalid Choice Please Enter Valid Choice...!");
   }
   System.out.println("\nUser Want To Continue (Y/N) : ");
   input=scanner.next().charAt(0);
  }while(input=='Y' || input=='y');
 }
}