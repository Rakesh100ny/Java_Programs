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
