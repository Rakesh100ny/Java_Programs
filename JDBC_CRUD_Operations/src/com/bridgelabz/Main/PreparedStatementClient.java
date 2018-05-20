package com.bridgelabz.Main;

import com.bridgelabz.Implementation.PreparedStatementImp;
import com.bridgelabz.Interface.preparedStatementInterface;
import com.bridgelabz.Utility.Utility;

public class PreparedStatementClient
{
 static String dbVendor=null;

 
 /**
 * @return the dbVendor
 */
public static String getDbVendor() {
	return dbVendor;
}


/**
 * @param dbVendor the dbVendor to set
 */
public static void setDbVendor(String dbVendor) {
	PreparedStatementClient.dbVendor = dbVendor;
}


public static void main(String[] args) 
 { 
  preparedStatementInterface implementation=new PreparedStatementImp();	 
  System.out.print("Enter Database Vendor : ");
  setDbVendor(Utility.getInstance().inputString());
   
	char input = ' ';
	do {

		System.out.print("\n\n\n\n\t\t\t\tEmployee Management System Using Statement");
		System.out.print("\n\t\t\t\t------------------------------------------");
		System.out.print("\n\t\t\t\t\tInsert  Employee : Enter 1");
		System.out.print("\n\t\t\t\t\tUpdate  Employee : Enter 2");
		System.out.print("\n\t\t\t\t\tDelete  Employee : Enter 3");
		System.out.print("\n\t\t\t\t\tSerach  Employee : Enter 4");
		System.out.print("\n\t\t\t\t\tDisplay Employee : Enter 5");
		System.out.print("\n\t\t\t\t\tExit             : Enter 6");
		System.out.print("\n\t\t\t\t-------------------------------------------\n");

		System.out.print("\n\t\t\t\tEnter Choice : ");
		int choice = Utility.getInstance().inputInteger();

		switch (choice) {
		case 1:	implementation.insert();
		      
			
			break;

		case 2:implementation.update();
			
			break;

		case 3:implementation.delete();
			
			break;

		case 4:implementation.serach();
			
			break;

		case 5:implementation.display();
			
			break;

		case 6 :implementation.exit();
			break;
		default:
			System.out.println("\n\t\t\t\tInvalid Choice...!");
		}
		System.out.println();
		System.out.print("\n\t\t\t\tDo you Want to continue (Y/N) : ");
		input = Utility.getInstance().inputCharacter();
	} while (input == 'Y' || input == 'y');
	
}

}
