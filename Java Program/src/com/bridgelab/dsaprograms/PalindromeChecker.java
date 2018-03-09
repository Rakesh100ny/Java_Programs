package com.bridgelab.dsaprograms;

import java.util.Scanner;
import com.bridgelab.utility.DequeForPalindrome;

public class PalindromeChecker 
{
 public static void main(String[] args) 
 {
  char choice,item;	 
  Scanner scanner=new Scanner(System.in);
  DequeForPalindrome deque=DequeForPalindrome.deque();
  
  while(true)
  {
   System.out.print("\n\n\n\n\t\t\t\tD E Q U E-M E N U");
   System.out.print("\n\t\t\t\t-----------------\n");
   
   System.out.print("\n\t\t\t\t[I]nsert Item");
   System.out.print("\n\t\t\t\t[R]emove Item");
   System.out.print("\n\t\t\t\t[C]heck Palindrome");
   System.out.print("\n\t\t\t\t[Q]uit");
	  
   System.out.print("\n\n\n\t\t\t\tEnter Choice : ");
   choice=scanner.next().charAt(0);
   
   
   switch(choice)
   {
    case 'I' : System.out.print("\n\n\n\n\t\t\t\tD E Q U E -Insert(Rear)");
    		   System.out.print("\n\t\t\t\t-----------------------\n");
               
    		   System.out.print("\n\n\n\t\t\t\tEnter Item To Insert : ");
    		   item=scanner.next().charAt(0);
    		   
    		   DequeForPalindrome.addRear(deque,item);
    		   break;

    		   
    case 'i' : System.out.print("\n\n\n\n\t\t\t\tD E Q U E -Insert(Front)");
	   		   System.out.print("\n\t\t\t\t-------------------------\n");
    
	   		   System.out.print("\n\n\n\t\t\t\tEnter Item To Insert : ");
	   		   item=scanner.next().charAt(0);
	   
	   		   DequeForPalindrome.addFront(deque,item);
	   		   break;
	   		   
    case 'R' : System.out.print("\n\n\n\n\t\t\t\tD E Q U E -Remove(Rear)");
			   System.out.print("\n\t\t\t\t-----------------------\n");
		    
			   item=DequeForPalindrome.removeRear(deque);
			   if(item!=' ')
			   {
				System.out.println("\n\n\n\t\t\t\tItem deleted : "+item);   
			   }
			   else
			   {
				System.out.print("\n\n\n\n\n\t\t\t\tDeque UnderFlow...Deletion Rear Failed..\n");   
			   }
			   break;
	   
    case 'r' : System.out.print("\n\n\n\n\t\t\t\tD E Q U E -Remove(Front)");
			   System.out.print("\n\t\t\t\t-------------------------\n");

			   item=DequeForPalindrome.removeFront(deque);
			   if(item!=' ')
			   {
				System.out.println("\n\n\n\t\t\t\tItem deleted : "+item);   
			   }
			   else
			   {
				System.out.print("\n\n\n\n\n\t\t\t\tDeque UnderFlow...Deletion Front Failed..\n");   
			   }
			   break;
			   
			   
    case 'c' :
    case 'C' :  boolean result=DequeForPalindrome.checkDeque(deque);
                if(result)
                {
                 System.out.println("\n\n\n\t\t\t\tResult : String is Panlindrome in the Deque.......!"); 	
                }
                else
                {
                 System.out.println("\n\n\n\t\t\t\tResult : String is not Panlindrome in the Deque...!");	
                }
	   		   
    case 'Q' :
    case 'q' : System.exit(0);
    		   
    default  : System.out.println("\n\n\n\n\t\t\t\tInvalid Choice - "+choice);
	
   }
  }
 }
}
