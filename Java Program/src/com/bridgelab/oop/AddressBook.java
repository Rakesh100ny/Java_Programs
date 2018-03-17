package com.bridgelab.oop;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelab.utility.AddressBookOperation;
import com.bridgelab.utility.Utility;

public class AddressBook 
{
 public static void main(String[] args) throws ParseException, IOException 
 {
	 
  AddressBookOperation action=new AddressBookOperation();	 
  Utility utility=new Utility();
  char input=' ';
  do
  {

  	System.out.print("\n\n\n\n\t\t\t\t    B O O K-S Y S T E M ");
  	System.out.print("\n\t\t\t\t----------------------------");

  	System.out.print("\n\t\t\t\tAdd    Adress Book : Enter 1");
  	System.out.print("\n\t\t\t\tEdit   Adress Book : Enter 2");
  	System.out.print("\n\t\t\t\tDelete Adress Book : Enter 3");
  	System.out.print("\n\t\t\t\tSort   Adress Book : Enter 4");

  	System.out.print("\n\t\t\t\t-----------------------------\n");

  	
  	System.out.print("\n\t\t\t\tEnter Choice : ");
    int choice=utility.inputInteger();

   switch (choice)
   {
     case 1 : action.add();
    	      break;
     
     case 2 : action.edit();
              break;
              
     case 3 : action.delete();
              break;
              
     case 4 : action.sort();
              break;
              
    default : System.out.println("\n\t\t\t\tInvalid Choice...!");		       
   }
   System.out.print("\n\t\t\t\tDo you Want to continue (Y/N) : ");
   input=utility.inputCharacter();
  }while(input=='Y' || input=='y');
 }
}
