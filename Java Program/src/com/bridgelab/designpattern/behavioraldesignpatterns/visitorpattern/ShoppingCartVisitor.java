/******************************************************************************
 *  
 *  Purpose : Determine Behavioral Design Pattern and it is ShoppinCartVisitor 
 *            interface.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.designpattern.behavioraldesignpatterns.visitorpattern;

public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}