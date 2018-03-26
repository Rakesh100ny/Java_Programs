/******************************************************************************
 *  
 *  Purpose : Determine Singleton Design Pattern and it is BillPunghSingleton 
 *            Using SingletonHelper Inner Class.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.designpattern.singletonpattern;

public class BillPughSingletonImplementation 
{
	 private BillPughSingletonImplementation(){}
	    
	    private static class SingletonHelper{
	        private static final BillPughSingletonImplementation INSTANCE = new BillPughSingletonImplementation();
	    }
	    
	    public static BillPughSingletonImplementation getInstance(){
	        return SingletonHelper.INSTANCE;
	    }
}
