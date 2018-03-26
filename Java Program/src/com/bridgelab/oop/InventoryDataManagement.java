/********************************************************************************
 *  
 *  Purpose : Maintain Inventory Management System And Perform Many Operation like
 *            Add Inventory(),CalculateValueOfInventory().
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ********************************************************************************/

package com.bridgelab.oop;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import com.bridgelab.utility.Utility;

public class InventoryDataManagement {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		Utility utility = new Utility();

		char input = ' ';

		do {
			System.out.print("\n\n\n\n\t\t\t\t       D A T A-M A N A G E M E N T ");
			System.out.print("\n\t\t\t\t-----------------------------------------");

			System.out.print("\n\t\t\t\t Add Inventory                 : Enter 1");
			System.out.print("\n\t\t\t\t Calculate Value of Inventory  : Enter 2");

			System.out.print("\n\t\t\t\t-----------------------------------------\n");
			System.out.print("\n\t\t\t\tEnter the Choice Which You Want : ");
			int choice = utility.inputInteger();

			switch (choice) {
			case 1:
				Utility.writeInventory();
				break;

			case 2:
				Utility.calculateValueOfInventory();
				break;
			default:
				System.out.println("\n\t\t\t\tInvalid Choice...!");

			}
			System.out.print("\n\t\t\t\t         Do You Want To Continue (Y/N) : ");
			input = utility.inputCharacter();
		} while (input == 'Y' || input == 'y');

	}

}
