/*************************************************************************************
 *  
 *  Purpose : Determine Singleton Design Pattern and it is UsingReflectionSingletonPattern
 *            Class and Using EagerInitialization Instance.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 *************************************************************************************/

package com.bridgelab.designpattern.singletonpattern;

import java.lang.reflect.Constructor;

public class UsingReflectionSingletonPattern {
	protected static Object readResolve() {
	    return EagerInitialization.getInstance();
	}
	public static void main(String[] args) {
		EagerInitialization instanceOne = EagerInitialization.getInstance();
		EagerInitialization instanceTwo = null;
		try {
			Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (EagerInitialization) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
		
		instanceOne=(EagerInitialization) UsingReflectionSingletonPattern.readResolve();
	    instanceTwo=(EagerInitialization) UsingReflectionSingletonPattern.readResolve();
	
	System.out.println();
	
	System.out.println(instanceOne.hashCode());
	System.out.println(instanceTwo.hashCode());
	
	}

}
