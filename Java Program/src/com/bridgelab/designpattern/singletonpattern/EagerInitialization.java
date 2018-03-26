/******************************************************************************
 *  
 *  Purpose : Determine Singleton Design Pattern and it is EagerInitialization
 *            Class and it is First and Simple Singleton Pattern.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.designpattern.singletonpattern;

public class EagerInitialization {
	private static EagerInitialization INSTANCE = new EagerInitialization();

	private EagerInitialization(){}

	public static EagerInitialization getInstance() 
	{

		return INSTANCE;

	}
}
