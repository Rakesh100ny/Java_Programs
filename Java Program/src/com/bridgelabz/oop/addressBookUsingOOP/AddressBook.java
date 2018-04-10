
/******************************************************************************
 *  
 *  Purpose : Maintain Address Book And Manipulate Data in the Address Book
 *            example Edit(),Update(),Display().
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.oop.addressBookUsingOOP;

import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.parser.ParseException;
import java.io.File;
import com.bridgelabz.utility.Utility;

public class AddressBook {
	static File file;
	static String fname;
	static String filePath = "/home/brideit/files/AddressBook/";
	static ArrayList<Person> arrayList = new ArrayList<>();
	
	public static void main(String[] args) throws ParseException, IOException {
		AddressManager action = new AddressManager();
		Utility utility = new Utility();
		char input = ' ';
		do {
			System.out.print("\n\n\n\n\t\t\t\t A D D R E S S_B O O K-S Y S T E M ");
			System.out.print("\n\t\t\t\t----------------------------------");
			System.out.print("\n\t\t\t\t Create New Adress Book : Enter 1");
			System.out.print("\n\t\t\t\t Open   Adress Book     : Enter 2");
			System.out.print("\n\t\t\t\t Save   Adress Book     : Enter 3");
			System.out.print("\n\t\t\t\t SaveAs Adress Book     : Enter 4");
			System.out.print("\n\t\t\t\t Delete Adress Book     : Enter 5");
			System.out.print("\n\t\t\t\t Quit                   : Enter 6");
			System.out.print("\n\t\t\t\t----------------------------------\n");

			System.out.print("\n\t\t\t\tEnter Choice : ");
			
			int choice = utility.inputInteger();

			switch (choice) {
			case 1:
				action.createNewAddressBook();
				break;

			case 2:

				System.out.println();
				file = new File(filePath);
				File[] fileList = file.listFiles();
				System.out.println("\t\t\t\t	 LIST_OF_FILE");
				System.out.println("\t\t\t\t-----------------------------");
				System.out.println("\t\t\t\tDisplay_FileName | File_Size");

				for (File fileName : fileList) {

					System.out.printf("%45s %8d Bytes", fileName.getName(), fileName.length());
					System.out.println();
				}
				System.out.print("\n\t\tEnter the File Name Where you want to Add Information :");
				fname = utility.inputString2();
				arrayList = action.openAddressBook(fname);
				break;

			case 3:
				action.save(arrayList);
				break;

			case 4:
				action.saveAs();
				break;

			case 5:
				action.deleteFile();
				break;

			default:
				System.out.println("\n\t\t\t\tInvalid Choice...!");
			}
			System.out.print("\n\t\t\t\tDo you Want close AddressBook Menu(Y/N) : ");
			input = utility.inputCharacter();
		} while (input == 'Y' || input == 'y');
	}
}
