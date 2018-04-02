/******************************************************************************
 *  
 *  Purpose : Read the Data From File and return String Array  
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFileData {
	/**
	 * @return read the data in the file then after return string array
	 */
	public static String[] readListOfWords(int choice) {
		String string1[] = null, string3[] = null;
		switch (choice) {
		case 1:
			try {
				FileReader fr = new FileReader("/home/brideit/string.txt");
				BufferedReader br = new BufferedReader(fr);

				String string2 = "";

				while (true) {
					string2 = br.readLine();
					if (string2 == null)
						break;
					else
						string1 = string2.split(" ");
				}
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		case 2:
			try {
				FileReader fr = new FileReader("/home/brideit/int.txt");
				BufferedReader br = new BufferedReader(fr);
				String string4 = "";
				while (true) {
					string4 = br.readLine();
					if (string4 == null)
						break;
					else
						string3 = string4.split(" ");
				}
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		default:
			System.out.println("Invalid Choice...!");

		}

		if (choice == 1)
			return string1;
		else if (choice == 2)
			return string3;
		else
			return null;
	}
}
