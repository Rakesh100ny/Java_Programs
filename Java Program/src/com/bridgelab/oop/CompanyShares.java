/******************************************************************************
 *  
 *  Purpose : Maintain Company Share And Perform Many Operation like
 *            Add CompanyShare(),Remove CompanyShare().
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.oop;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelab.utility.CompanyShareMaintain;
import com.bridgelab.utility.Utility;

public class CompanyShares {
	public static void main(String[] args) throws IOException, ParseException {
		CompanyShareMaintain maintainList = new CompanyShareMaintain();
		Utility utility = new Utility();
		char input = ' ';
		do {

			System.out.print("\n\n\n\n\t\t\t\t    S T O C K-A C C O U N T");
			System.out.print("\n\t\t\t\t------------------------------");
			System.out.print("\n\t\t\t\tADD    Comapny Share : Enter 1");
			System.out.print("\n\t\t\t\tRemove Company Share : Enter 2");
			System.out.print("\n\t\t\t\tExit   The Program   : Enter 3");
			System.out.print("\n\t\t\t\t------------------------------\n");

			System.out.print("\n\t\t\t\tEnter Choice : ");
			int choice = utility.inputInteger();

			switch (choice) {
			case 1:
				maintainList.addShare();
				break;

			case 2:
				maintainList.RemoveShare();
				break;

			case 3:
				maintainList.quit();
				break;

			default:
				System.out.println("\n\t\t\t\tInvalid Choice...!");
			}
			System.out.print("\n\t\t\t\tDo you Want to continue (Y/N) : ");
			input = utility.inputCharacter();
		} while (input == 'Y' || input == 'y');
	}

}
