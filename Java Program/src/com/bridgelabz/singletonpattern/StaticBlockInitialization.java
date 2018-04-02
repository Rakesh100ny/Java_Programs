/************************************************************************************
 *  
 *  Purpose : Determine Singleton Design Pattern and it is StaticBlockInitialization 
 *            Using Static Block.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ************************************************************************************/

package com.bridgelabz.singletonpattern;

public class StaticBlockInitialization 
{
 private static StaticBlockInitialization INSTANCE;
    
    private StaticBlockInitialization(){}
    
    //static block initialization for exception handling
    static
    {
        try{
            INSTANCE = new StaticBlockInitialization();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating Singleton instance Using Static Block");
        }
    }
    
    public static StaticBlockInitialization getInstance(){
        return INSTANCE;
    }
}
