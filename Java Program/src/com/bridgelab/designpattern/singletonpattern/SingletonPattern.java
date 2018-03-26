/******************************************************************************
 *  
 *  Purpose : Determine Singleton Design Pattern and it is Main Class and Implements.
 *            All Singleton Pattern.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.designpattern.singletonpattern;

import java.io.Serializable;

public class SingletonPattern implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		System.out.print("\n\t\t\t\t       Eager Initialization Instance");
		System.out.print("\n\t\t\t\t----------------------------------------");
		EagerInitialization instance1 = EagerInitialization.getInstance();
		System.out.println("\n\t\t\t\tEagerInitialization Instance : "+instance1.hashCode());
	
		System.out.println();
		System.out.print("\n\t\t\t\t      Lazy Initialization Instance");
		System.out.print("\n\t\t\t\t-----------------------------------------");
		Thread thread1=new Thread(new Runnable() {
		public void run() {
			LazyInitialization instance3 = LazyInitialization.getInstance();
			System.out.println("\n\t\t\t\tLazy Initialization Instance1 : " + instance3.hashCode());
				
			}
		});
		thread1.start();
		Thread thread2=new Thread(new Runnable() {
		public void run() {
			LazyInitialization instance8 = LazyInitialization.getInstance();
			System.out.println("\n\t\t\t\tLazy Initialization Instance2 : " + instance8.hashCode());
				
			}
		});
		
		thread2.start();	
	       
		System.out.println();
		System.out.print("\n\t\t\t\t       Thread Safe Singleton Instance");
		System.out.print("\n\t\t\t\t------------------------------------------");
		Thread thread3=new Thread(new Runnable() {
			public void run() {
				ThreadSafeSingleton instance4 = ThreadSafeSingleton.getInstance();
				System.out.println("\n\t\t\t\tThread Safe Singleton Instance 1: " + instance4.hashCode());
	 	
			}
		});
        thread3.start();
        System.out.println();
		Thread thread5=new Thread(new Runnable() {
			public void run() {
				ThreadSafeSingleton instance4 = ThreadSafeSingleton.getInstance();
				System.out.println("\n\t\t\t\tThread Safe Singleton Instance 2: " + instance4.hashCode());
	 	
			}
		});
        thread5.start();	
 		System.out.println();
		System.out.print("\n\t\t\t\t      Static Block Initialization Instance");
		System.out.print("\n\t\t\t\t------------------------------------------------");
		StaticBlockInitialization instance2 = StaticBlockInitialization.getInstance();
		System.out.println("\n\t\t\t\tStatic Block Initialization Instance : " + instance2.hashCode());

	
		System.out.println();
		System.out.print("\n\t\t\t            Bill Pugh Singleton Implementation Instance");
		System.out.print("\n\t\t\t     --------------------------------------------------------");
		BillPughSingletonImplementation instance6 = BillPughSingletonImplementation.getInstance();
		System.out.println("\n\t\t\t     Bill Pugh Singleton Implementation Instance : " + instance6.hashCode());


		System.out.println();
		System.out.print("\n\t\t\t          Thread Safe Singleton Using DoubleCheckedLocking Instance");
		System.out.print("\n\t\t\t    ---------------------------------------------------------------------");
		Thread thread4=new Thread(new Runnable() {
			
			public void run() {
				ThreadSafeSingletonUsingDoubleCheckedLocking instance5 = ThreadSafeSingletonUsingDoubleCheckedLocking.getInstance();
				System.out.println("\n\t\t\t    Thread Safe Singleton Using DoubleCheckedLocking Instance : " + instance5.hashCode());
		    }
		});
	    thread4.start(); 

	}

}
