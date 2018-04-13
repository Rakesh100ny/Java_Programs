/******************************************************************************
 *  
 *  Purpose : Determine TICTACTOE Game and check all condition Diagnoal and Row
 *            and also Column and Display Who's Winner     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

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

		utility.ticTacToe(moves, player1, player2, switchTurn, arr);
		System.out.println();
		utility.display(arr);

		utility.decision(player1,player2);
		
	}

}