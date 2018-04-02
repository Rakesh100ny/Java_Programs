/******************************************************************************
 *  
 *  Purpose : Determine Singleton Design Pattern and it is LazyInitialization
 *            Class and it is Advanced to Eager Singleton Pattern.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.singletonpattern;

public class LazyInitialization
{
private static LazyInitialization INSTANCE;
    
    private LazyInitialization(){}
    
    public static LazyInitialization getInstance(){
        if(INSTANCE == null){
            INSTANCE = new LazyInitialization();
        }
        return INSTANCE;
    }
}
