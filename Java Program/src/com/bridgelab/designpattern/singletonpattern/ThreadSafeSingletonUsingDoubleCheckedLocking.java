/******************************************************************************
 *  
 *  Purpose : Determine Singleton Design Pattern and it is ThreadSafeSingleton Class 
 *            and Using Double Checked Locking.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.designpattern.singletonpattern;

public class ThreadSafeSingletonUsingDoubleCheckedLocking
{
private static ThreadSafeSingletonUsingDoubleCheckedLocking INSTANCE;
    
    private ThreadSafeSingletonUsingDoubleCheckedLocking(){}
    
    public static synchronized ThreadSafeSingletonUsingDoubleCheckedLocking getInstance(){
    	if(INSTANCE == null){
            synchronized (ThreadSafeSingletonUsingDoubleCheckedLocking.class) {
                if(INSTANCE == null){
                    INSTANCE = new ThreadSafeSingletonUsingDoubleCheckedLocking();
                }
            }
        }
        return INSTANCE;
    }

}
