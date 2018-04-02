/******************************************************************************
 *  
 *  Purpose : Determine Behavioral Design Pattern and it is RedDress(Item) Class
 *            implemnt Observable interface.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.observerpattern;

import java.util.ArrayList;

public class RedDress implements Observable
{
 private ArrayList<RedDressObserver> users=new ArrayList<RedDressObserver>();
 
 private boolean inStock=true;
 
 public boolean isInStock()
 {
  return inStock;
  
 }
 public void setInStock(boolean inStock)
 {
  this.inStock=inStock;	
  notifyObserver(inStock);
 }

public void addObserver(RedDressObserver observer) {
	users.add(observer);
	System.out.println();
	System.out.println("User Subscribe...! ");
}

public void removeObserver(RedDressObserver observer)
{
	users.remove(observer);
	System.out.println();
    System.out.println("User Unsubscribed...!");	
}

public void notifyObserver(boolean inStock) {
 for(RedDressObserver user : users)
 {
  user.update(inStock);	 
 }
}


}
