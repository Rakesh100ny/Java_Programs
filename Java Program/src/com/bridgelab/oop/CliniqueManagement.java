package com.bridgelab.oop;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelab.utility.AddressBookOperation;
import com.bridgelab.utility.CliniqueManagementOperation;
import com.bridgelab.utility.Utility;

public class CliniqueManagement
{
 public static void main(String[] args) throws IOException, ParseException 
 {
	 CliniqueManagementOperation action=new CliniqueManagementOperation();	 
	  Utility utility=new Utility();
	  char input=' ';
	  do
	  {

	  	System.out.print("\n\n\n\n\t\t\t\t    Clinique Management System ");
	  	System.out.print("\n\t\t\t\t-----------------------------------");
	  	System.out.print("\n\t\t\t\t    Add   Doctor      : Enter 1");
	  	System.out.print("\n\t\t\t\t    Add   Patient     : Enter 2");
	  	System.out.print("\n\t\t\t\t    Take  Appointment : Enter 3");
	  	System.out.print("\n\t\t\t\t    Search Both       : Enter 4");

	  	System.out.print("\n\t\t\t\t------------------------------------\n");

	  	
	  	System.out.print("\n\t\t\t\tEnter Choice : ");
	    int choice=utility.inputInteger();

	   switch (choice)
	   {
	     case 1 : action.addDocotor();
	    	      break;
	     
	     case 2 : action.addPatient();
	              break;
	              
	     case 3 : action.takeAppointment();
	              break;
	              
	     case 4 : action.search();
	              break;
	              
	    default : System.out.println("\n\t\t\t\tInvalid Choice...!");		       
	   }
	   System.out.print("\n\t\t\t\tDo you Want to continue (Y/N) : ");
	   input=utility.inputCharacter();
	  }while(input=='Y' || input=='y');
	 }
	}
