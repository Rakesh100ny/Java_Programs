package com.bridgelab.designpattern.structuralpatterns.facadedesignpattern;


import com.bridgelab.utility.Utility;

public class FacadePatternJewelleryShop {
	private static int choice;

	public static void main(String args[]) {
		Utility utility = new Utility();
		char input=' ';
		do {
			System.out.print("\n\t\t\t\t      Jewellery-Shop    ");
			System.out.print("\n\t\t\t\t----------------------------");
			System.out.print("\n\t\t\t\tPurchase Ear-Rings : Enter 1");
			System.out.print("\n\t\t\t\tPurchase Nacklace  : Enter 2");
			System.out.print("\n\t\t\t\tPurchase Chains    : Enter 3");
			System.out.print("\n\t\t\t\t----------------------------");
			System.out.println();
			System.out.print("\n\t\t\t\tEnter your choice: ");

			choice = utility.inputInteger();

			ShopKeeper shopKeeper = new ShopKeeper();

			switch (choice) {
			case 1: {
				shopKeeper.earRingSale();
			}
				break;
			case 2: {
				shopKeeper.nacklaceSale();
			}
				break;
			case 3: {
				shopKeeper.chainSale();
			}
				break;
			default: {
				System.out.println("Nothing You purchased");
			}
			
			}

			System.out.print("\n\t\t\t\tDo You Want To Continue (Y/N)?");
			input=utility.inputCharacter();
			
		} while (input=='Y' || input=='y');
	}
}