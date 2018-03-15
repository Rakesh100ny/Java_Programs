package com.bridgelab.oop;

import com.bridgelab.utility.Utility;

public class DeckOfCards 
{
 public static void main(String[] args) 
 {
  int noOfPlayers=4;
  int noOfCards=9;
  
  String initialize[]=Utility.initializeCards();
  System.out.println();
  String shuffle[]=Utility.shuffleCards(initialize);
  System.out.println();
  String distribute[][]=Utility.distributeCards(shuffle,noOfCards,noOfPlayers);
  
  
 }

}
