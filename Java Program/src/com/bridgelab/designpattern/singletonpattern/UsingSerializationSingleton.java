/*************************************************************************************
 *  
 *  Purpose : Determine Singleton Design Pattern and it is UsingSerializationSingleton
 *            Class and Using Serialization and Store Object.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 *************************************************************************************/

package com.bridgelab.designpattern.singletonpattern;

import java.io.Serializable;

public class UsingSerializationSingleton implements Serializable 
{
	 private static final long serialVersionUID = -7604766932017737115L;

	    private UsingSerializationSingleton(){}
	    
	    private static class SingletonHelper{
	        private static final UsingSerializationSingleton INSTANCE = new UsingSerializationSingleton();
	    }
	    
	    public static UsingSerializationSingleton getInstance(){
	        return SingletonHelper.INSTANCE;
	    }
}
