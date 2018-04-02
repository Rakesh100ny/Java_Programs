/********************************************************************************
 *  
 *  Purpose : Maintain All Cards And Perform Many Operation like initializeCards()
 *            ShufflesCards(),DistributesCards(),Sorting Using Queue.
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ********************************************************************************/

package com.bridgelabz.oop;

import com.bridgelabz.utility.Utility;

public class DeckOfCardsUsingQueue {
	public static void main(String[] args) {
		int noOfPlayers = 4;
		int noOfCards = 9;

		String initialize[] = Utility.initializeCards();
		System.out.println();
		String shuffle[] = Utility.shuffleCards(initialize);
		System.out.println();
		String distribute[][] = Utility.distributeCards(shuffle, noOfCards, noOfPlayers);
		Utility.printSortedUsingQueue(distribute, noOfCards, noOfPlayers);

	}
}
