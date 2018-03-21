package com.bridgelab.designpattern.singletonpattern;

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
