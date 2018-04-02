/******************************************************************************
 *  
 *  Purpose : Determine Singleton Design Pattern and it is ThreadSafeSingleton Class 
 *            and using synchronized.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.singletonpattern;

public class ThreadSafeSingleton {

private static ThreadSafeSingleton INSTANCE;
    
    private ThreadSafeSingleton(){}
    
    public static synchronized ThreadSafeSingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ThreadSafeSingleton();
        }
        return INSTANCE;
    }
}
