package com.bridgelab.designpattern.singletonpattern;

public class ThreadSafeSingletonUsingDoubleCheckedLocking
{
private static ThreadSafeSingletonUsingDoubleCheckedLocking instance;
    
    private ThreadSafeSingletonUsingDoubleCheckedLocking(){}
    
    public static synchronized ThreadSafeSingletonUsingDoubleCheckedLocking getInstance(){
    	if(instance == null){
            synchronized (ThreadSafeSingletonUsingDoubleCheckedLocking.class) {
                if(instance == null){
                    instance = new ThreadSafeSingletonUsingDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }

}
