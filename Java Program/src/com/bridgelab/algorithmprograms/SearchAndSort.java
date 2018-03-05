/******************************************************************************
 *  
 *  Purpose : In this Project Many Algorithm Apply Searching And Sorting      
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.algorithmprograms;

import java.util.*;
import com.bridgelab.utility.Utility;

public class SearchAndSort
{
 public static void main(String[] args) 
 {
  Scanner scanner=new Scanner(System.in);
  Scanner scanner2=new Scanner(System.in);
  long start1=0,end1=0,start2=0,end2=0,start3=0,end3=0,start4=0,end4=0,start5=0,end5=0,start6=0,end6=0;
  long elapsed1=0,elapsed2=0,elapsed3=0,elapsed4=0,elapsed5=0,elapsed6=0;
  char input;

  do
  {
   System.out.println("--------------------------------------------");
   System.out.println();
   System.out.println(" Binary Search For Integer   : Enter bfi ");	  
   System.out.println();
   System.out.println(" Binary Search For String    : Enter bfs ");	  
   System.out.println();
   System.out.println(" Inseration Sort For Integer : Enter isi ");	  
   System.out.println();
   System.out.println(" Inseration Sort For String  : Enter iss ");	  
   System.out.println();
   System.out.println(" Bubble Sort For Integer     : Enter bsi ");	  
   System.out.println();
   System.out.println(" Bubble Sort For String      : Enter bss ");	  
   System.out.println();
   System.out.println("---------------------------------------------");	  
   
	  
	  
   System.out.print("Enter The Choice : ");
   String choice=scanner.next();
	  
	  
	  
   switch (choice)
   {
    case "bfi" :  
    case "BFI" : 
    	         start1=System.currentTimeMillis();
    	         Integer array1[]=Utility.takeInputInteger();
				 System.out.print("Enter the Key                 : ");
				 int key1=scanner2.nextInt();
				 System.out.print("Print The Item Before Sorting : ");
			     Utility.print(array1);
                 System.out.print("Print The Item After Sorting  : ");
			     Utility.printSort(array1);
	             array1=Utility.binarySearch(array1,key1);
				 end1=System.currentTimeMillis();
    	         elapsed1=(end1-start1)/1000;
    	         break;
    
    case "bfs" :
    case "BFS" : start2=System.currentTimeMillis();
                 String[] string1=Utility.takeInputString();
		         System.out.print("Enter the Key                  : "); 
		         String key2=scanner.next();
		         System.out.print("Print The Item Before Sorting  : ");
		         Utility.print(string1);

		         System.out.print("Print The Item After Sorting   : ");
		         Utility.printSort(string1);
		         string1=Utility.binarySearch(string1,key2);
    	         end2=System.currentTimeMillis();
    	         elapsed2=(end2-start2)/1000;
                 break;
    
    case "isi" : 
    case "ISI" : start3=System.currentTimeMillis();
                 Integer array2[]=Utility.takeInputInteger();
                 System.out.print("Print The Item Before Sorting  : ");
		         Utility.print(array2);

	             System.out.print("\nPrint The Item After Sorting   : ");
	             array2=Utility.inserationSort(array2);
              
	             end3=System.currentTimeMillis();
    	         elapsed3=(end3-start3)/1000;
                 break;

    case "iss" :
    case "ISS" : start4=System.currentTimeMillis();
                 String[] string2=Utility.takeInputString();
                 System.out.print("Print The Item Before Sorting  : ");
		         Utility.print(string2);

                 
                 System.out.print("Print The Item After Sorting   : ");
                 string2=Utility.inserationSort(string2);
                 end4=System.currentTimeMillis();
    	         elapsed4=(end4-start4)/1000;
                 break;

    
    case "bsi" : 
    case "BSI" : start5=System.currentTimeMillis();
				 Integer array3[]=Utility.takeInputInteger();
				 System.out.print("Print The Item Before Sorting  : ");
		         Utility.print(array3);

			     System.out.print("Print The Item After Sorting   : ");
			     array3=Utility.bubbleSort(array3);
                 end5=System.currentTimeMillis();
    	         elapsed5=(end5-start5)/1000;
        		 break;
    
    case "bss" : 
    case "BSS" : start6=System.currentTimeMillis();
                 String[] string3=Utility.takeInputString();
				 
                 System.out.print("Print The Item Before Sorting  : ");
		         Utility.print(string3);

				 System.out.print("Print The Item After Sorting   : ");
				 string3=Utility.bubbleSort(string3);
                 end6=System.currentTimeMillis();
    	         elapsed6=(end6-start6)/1000;
        		 break;

    
    default    : System.out.println("Invalid Choice Input...!");
	                                
   }
   System.out.println("\nUser Want To Continue (Y/N) : ");
   input=scanner.next().charAt(0);
  }while(input=='Y' || input=='y');
  scanner.close();
  scanner2.close();
  System.out.println("Binary Search For Integer   : "+elapsed1);
  System.out.println("Binary Search For String    : "+elapsed2);
  System.out.println("Inseration Sort For Integer : "+elapsed3);
  System.out.println("Inseration Sort For String  : "+elapsed4);
  System.out.println("Bubble Sort For Integer     : "+elapsed5);
  System.out.println("Bubble Sort For String      : "+elapsed6);
 }
}