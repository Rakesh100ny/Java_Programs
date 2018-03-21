package com.bridgelab.designpattern.singletonpattern;

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
