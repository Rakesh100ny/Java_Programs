/******************************************************************************
 *  
 *  Purpose : Determine TICTACTOE Game and check all condition Diagnoal and Row
 *            and also Column and Display Who's Winner     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.functionalprograms;

import java.util.*;

import com.bridgelab.utility.Utility;

public class TicTacToe {
	public static void main(String args[]) {
		Utility utility = new Utility();
		int moves = 0;
		boolean player1 = false, player2 = false, switchTurn = false;
		char[][] arr = new char[3][3];
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t T I C-T A C-T O E GAME");
		System.out.print("\t\t\t------------------------");
		System.out.println();
		arr = utility.fill(arr);

		while (moves < 9 && !player1 && !player2) {
			utility.display(arr);
			if (switchTurn) {
				boolean isEmpty = false;
				Random random = new Random();
				while (!isEmpty) {
					int pick = random.nextInt(9);
					switch (pick) {
					case 0:
						if (arr[0][0] == '_') {
							arr[0][0] = 'O';
							isEmpty = true;
						}
						break;
					case 1:
						if (arr[0][1] == '_') {
							arr[0][1] = 'O';
							isEmpty = true;
						}
						break;
					case 2:
						if (arr[0][2] == '_') {
							arr[0][2] = 'O';
							isEmpty = true;
						}
						break;
					case 3:
						if (arr[1][0] == '_') {
							arr[1][0] = 'O';
							isEmpty = true;
						}
						break;
					case 4:
						if (arr[1][1] == '_') {
							arr[1][1] = 'O';
							isEmpty = true;
						}
						break;
					case 5:
						if (arr[1][2] == '_') {
							arr[1][2] = 'O';
							isEmpty = true;
						}
						break;
					case 6:
						if (arr[2][0] == '_') {
							arr[2][0] = 'O';
							isEmpty = true;
						}
						break;
					case 7:
						if (arr[2][1] == '_') {
							arr[2][1] = 'O';
							isEmpty = true;
						}
						break;
					case 8:
						if (arr[2][2] == '_') {
							arr[2][2] = 'O';
							isEmpty = true;
						}
						break;
					}
				}
				switchTurn = false;
			} else {
				System.out.println("\t\t\tInsert '0' Position : Enter 0");
				System.out.println("\t\t\tInsert '1' Position : Enter 1");
				System.out.println("\t\t\tInsert '2' Position : Enter 2");
				System.out.println("\t\t\tInsert '3' Position : Enter 3");
				System.out.println("\t\t\tInsert '4' Position : Enter 4");
				System.out.println("\t\t\tInsert '5' Position : Enter 5");
				System.out.println("\t\t\tInsert '6' Position : Enter 6");
				System.out.println("\t\t\tInsert '7' Position : Enter 7");
				System.out.println("\t\t\tInsert '8' Position : Enter 8");
				System.out.print("\n\t\t  Enter the Position which you want to mark : ");
				int userTurn = utility.inputInteger();
				switch (userTurn) {
				case 0:
					if (arr[0][0] == '_') {
						arr[0][0] = 'X';

					}
					break;
				case 1:
					if (arr[0][1] == '_') {
						arr[0][1] = 'X';

					}
					break;
				case 2:
					if (arr[0][2] == '_') {
						arr[0][2] = 'X';

					}
					break;
				case 3:
					if (arr[1][0] == '_') {
						arr[1][0] = 'X';

					}
					break;
				case 4:
					if (arr[1][1] == '_') {
						arr[1][1] = 'X';

					}
					break;
				case 5:
					if (arr[1][2] == '_') {
						arr[1][2] = 'X';

					}
					break;
				case 6:
					if (arr[2][0] == '_') {
						arr[2][0] = 'X';

					}
					break;
				case 7:
					if (arr[2][1] == '_') {
						arr[2][1] = 'X';

					}
					break;
				case 8:
					if (arr[2][2] == '_') {
						arr[2][2] = 'X';

					}
					break;
				}
				switchTurn = true;
			}
			moves++;
			if (utility.checkCol(arr, 'X') || utility.checkRows(arr, 'X') || utility.checkDiag(arr, 'X')) {
				player1 = true;
			} else {
				if (utility.checkCol(arr, 'O') || utility.checkRows(arr, 'O') || utility.checkDiag(arr, 'O')) {
					player2 = true;
				}
			}
		}
		System.out.println();
		utility.display(arr);
		if (player1) {
			System.out.println("\n\t\t\t\tYou win");
		} else {
			if (player2) {
				System.out.println("\n\t\t\t\t Computer Wins");
			} else {
				System.out.println("\n\t\t\t\t Game Draw");
			}
		}
	}

}