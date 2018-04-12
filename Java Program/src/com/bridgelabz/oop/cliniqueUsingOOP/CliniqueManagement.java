package com.bridgelabz.oop.cliniqueUsingOOP;


import java.io.IOException;


public class CliniqueManagement 
{
 public static void main(String[] args) throws IOException 
 {
		ManagerInterface action = new CliniqueManager();
		char input = ' ';
		do {

			System.out.print("\n\n\n\n\t\t\t\t       Clinique Management System ");
			System.out.print("\n\t\t\t\t  -----------------------------------");
			System.out.print("\n\t\t\t\t    Add     Doctor/Patient : Enter 1");
			System.out.print("\n\t\t\t\t    Serach  Doctor/Patient : Enter 2");
			System.out.print("\n\t\t\t\t    Display Doctor/Patient : Enter 3");
			System.out.print("\n\t\t\t\t    Take    Appointment    : Enter 4");
			System.out.print("\n\t\t\t\t    Popular Specialization : Enter 5");
			System.out.print("\n\t\t\t\t  -----------------------------------\n");

			System.out.print("\n\t\t\t\t \t  Enter Choice : ");
			int choice = SingletonOfUtility.getInstance().inputInteger();

			switch (choice) {
			case 1:
				action.add();
				break;

			case 2:
				action.search();
				break;

			case 3:
				action.display();
				break;

			case 4:
				action.takeAppointment();
				break;

			case 5:
				action.popularDoctor();
				break;

			default:
				System.out.println("\n\t\t\t\tInvalid Choice...!");
			}
			System.out.println();
			System.out.print("\n\t\t\t\t   Do you Want to continue (Y/N) : ");
			input = SingletonOfUtility.getInstance().inputCharacter();
		} while (input == 'Y' || input == 'y');
	}
}
