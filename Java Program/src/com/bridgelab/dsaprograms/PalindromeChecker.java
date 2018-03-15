/******************************************************************************
 *  
 *  Purpose : Determine PalindromeChecker UsingDeque.    
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.dsaprograms;

import com.bridgelab.utility.Deque;
import com.bridgelab.utility.Utility;

public class PalindromeChecker {
	public static void main(String[] args) {
		char choice, item;
		Utility utility = new Utility();
		Deque deque = Deque.deque();

		while (true) {
			System.out.print("\n\n\n\n\t\t\t\tD E Q U E-M E N U");
			System.out.print("\n\t\t\t\t-----------------\n");

			System.out.print("\n\t\t\t\t[I]nsert Item");
			System.out.print("\n\t\t\t\t[R]emove Item");
			System.out.print("\n\t\t\t\t[C]heck Palindrome");
			System.out.print("\n\t\t\t\t[Q]uit");

			System.out.print("\n\n\n\t\t\t\tEnter Choice : ");
			choice = utility.inputCharacter();

			switch (choice) {
			case 'I':
				System.out.print("\n\n\n\n\t\t\t\tD E Q U E -Insert(Rear)");
				System.out.print("\n\t\t\t\t-----------------------\n");

				System.out.print("\n\n\n\t\t\t\tEnter Item To Insert : ");
				item = utility.inputCharacter();

				Deque.addRear(deque, item);
				break;

			case 'i':
				System.out.print("\n\n\n\n\t\t\t\tD E Q U E -Insert(Front)");
				System.out.print("\n\t\t\t\t-------------------------\n");

				System.out.print("\n\n\n\t\t\t\tEnter Item To Insert : ");
				item = utility.inputCharacter();

				Deque.addFront(deque, item);
				break;

			case 'R':
				System.out.print("\n\n\n\n\t\t\t\tD E Q U E -Remove(Rear)");
				System.out.print("\n\t\t\t\t-----------------------\n");

				item = Deque.removeRear(deque);
				if (item != ' ') {
					System.out.println("\n\n\n\t\t\t\tItem deleted : " + item);
				} else {
					System.out.print("\n\n\n\n\n\t\t\t\tDeque UnderFlow...Deletion Rear Failed..\n");
				}
				break;

			case 'r':
				System.out.print("\n\n\n\n\t\t\t\tD E Q U E -Remove(Front)");
				System.out.print("\n\t\t\t\t-------------------------\n");

				item = Deque.removeFront(deque);
				if (item != ' ') {
					System.out.println("\n\n\n\t\t\t\tItem deleted : " + item);
				} else {
					System.out.print("\n\n\n\n\n\t\t\t\tDeque UnderFlow...Deletion Front Failed..\n");
				}
				break;

			case 'c':
			case 'C':
				boolean result = Deque.checkDeque(deque);
				if (result) {
					System.out.println("\n\n\n\t\t\t\tResult : String is Panlindrome in the Deque.......!");
				} else {
					System.out.println("\n\n\n\t\t\t\tResult : String is not Panlindrome in the Deque...!");
				}

			case 'Q':
			case 'q':
				System.exit(0);

			default:
				System.out.println("\n\n\n\n\t\t\t\tInvalid Choice - " + choice);

			}
		}
	}
}
