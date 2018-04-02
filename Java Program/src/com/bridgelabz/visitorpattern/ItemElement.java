/******************************************************************************
 *  
 *  Purpose : Determine Behavioral Design Pattern and it is ItemElement interface.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/


package com.bridgelabz.visitorpattern;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}