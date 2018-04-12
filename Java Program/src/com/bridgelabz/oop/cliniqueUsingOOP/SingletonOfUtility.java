package com.bridgelabz.oop.cliniqueUsingOOP;

import com.bridgelabz.utility.Utility;

public class SingletonOfUtility
{
	 private SingletonOfUtility(){}
	    
	    private static class SingletonHelper{
	        private static final Utility INSTANCE = new Utility();
	    }
	    
	    public static Utility getInstance(){
	        return SingletonHelper.INSTANCE;
	    }

}
