/******************************************************************************
 *  
 *  Purpose : Determine Behavioral Design Pattern and it is Observable interface.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.designpattern.behavioraldesignpatterns.observerpattern;

public interface Observable 
{
 public void addObserver(RedDressObserver observer);
 public void removeObserver(RedDressObserver observer);
 public void notifyObserver(boolean inStock);
}
