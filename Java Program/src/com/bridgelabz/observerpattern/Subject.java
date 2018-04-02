/******************************************************************************
 *  
 *  Purpose : Determine Behavioral Design Pattern and it is Subject interface.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/


package com.bridgelabz.observerpattern;

public interface Subject {
	//methods to register and unregister observers
		public void register(Observer obj);
		public void unregister(Observer obj);
		
		//method to notify observers of change
		public void notifyObservers();
		
		//method to get updates from subject
		public Object getUpdate(Observer obj);
}
