/******************************************************************************
 *  
 *  Purpose : Implement OrderList Using LinkedList.    
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.dsaprograms;

import com.bridgelab.utility.OrderList;
import com.bridgelab.utility.ReadFileData;
import com.bridgelab.utility.Utility;

public class OrderListDemo {
	public static void main(String[] args) {
		Utility utility = new Utility();
		char input = ' ';
		do {
			System.out.println("*********************************************************");
			System.out.println();
			System.out.println("* String implement Using LinkedList  : Enter choice 1 *");
			System.out.println();
			System.out.println("* Integer implement Using LinkedList : Enter choice 2 *");
			System.out.println();
			System.out.println("*********************************************************");

			System.out.print("Enter Choice Which Type of Data You Want to Append : ");
			int choice = utility.inputInteger();

			switch (choice) {
			case 1:
				OrderList<Comparable> list = new OrderList<Comparable>();
				String string[] = ReadFileData.readListOfWords(choice);
				for (int i = 0; i < string.length; i++) {
					list.insert(string[i]);
				}
				System.out.print("Elements persent in the File  : ");
				list.print();
				System.out.print(list);

				System.out.println();

				System.out.print("Enter the Key Which you want  : ");
				String key = utility.inputString2();
				int index = 0;
				boolean result = list.search(key);
				if (result) {
					index = list.index(key);
					System.out.print("Apply the action after Result : ");
					System.out.println(key + " Key is Found at the " + index + " index");
					list.remove(key);
					list.print();
					System.out.println("After Remove Item Print List  : " + list);
					Utility.fileUpdate(list, choice);
					System.out.println("File is Updated...!");
				} else {
					System.out.print("Apply the action after Result : ");
					System.out.println(key + " Key is not Found");
					list.add(key);
					list.print();
					System.out.println("After ADDing Item Print List  : " + list);
					Utility.fileUpdate(list, choice);
					System.out.println("File is Updated...!");
				}
				break;

			case 2:
				OrderList<Comparable> list2 = new OrderList<Comparable>();
				String string2[] = ReadFileData.readListOfWords(choice);
				for (int i = 0; i < string2.length; i++) {
					list2.insert(Integer.parseInt(string2[i]));
				}
				System.out.print("Elements persent in the File  : ");
				list2.print();
				System.out.print(list2);

				System.out.println();

				System.out.print("Enter the Key Which you want  : ");
				int key2 = utility.inputInteger();
				int index2 = 0;
				boolean result2 = list2.search(key2);
				if (result2) {
					index2 = list2.index(key2);
					System.out.print("Apply the action after Result : ");
					System.out.println(key2 + " Key is Found at the " + index2 + " index");
					list2.remove(key2);
					list2.print();
					System.out.println("After Remove Item Print List  : " + list2);
					Utility.fileUpdate(list2, choice);
					System.out.println("File is Updated...!");
				} else {
					System.out.print("Apply the action after Result : ");
					System.out.println(key2 + " Key is not Found");
					list2.add(key2);
					list2.print();
					System.out.println("After ADDing Item Print List  : " + list2);
					Utility.fileUpdate(list2, choice);
					System.out.println("File is Updated...!");
				}
				break;

			default:
				System.out.println("Invalid Choice Please Enter Valid Choice...!");
			}
			System.out.println("\nUser Want To Continue (Y/N) : ");
			input = utility.inputCharacter();

		} while (input == 'Y' || input == 'y');
	}
}
