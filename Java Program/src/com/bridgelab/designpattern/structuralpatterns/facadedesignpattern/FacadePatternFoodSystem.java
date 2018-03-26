/**********************************************************************************
 *  
 *  Purpose : Determine Strucral Design Pattern and In FacadeDesignPattern It is 
 *            FacadePatternFoodSystem Main class Taking Action.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ***********************************************************************************/

package com.bridgelab.designpattern.structuralpatterns.facadedesignpattern;

public class FacadePatternFoodSystem {


	  public static void main(String args[]){

	      OrderFacade orderFacade = new OrderFacade();

	      orderFacade.placeOrder("OR123456");

	      System.out.println("Order processing completed");

	  }

	}
