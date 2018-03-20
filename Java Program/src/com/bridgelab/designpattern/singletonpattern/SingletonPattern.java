package com.bridgelab.designpattern.singletonpattern;

import java.io.Serializable;

public class SingletonPattern implements Serializable {
	public static void main(String[] args) {
		System.out.print("\n\t\t\t\t       Eager Initialization Instance");
		System.out.print("\n\t\t\t\t----------------------------------------");
		EagerInitialization instance1 = EagerInitialization.getInstance();
		System.out.println("\n\t\t\t\tEagerInitialization Instance : "+instance1.hashCode());
	
		System.out.println();
		System.out.print("\n\t\t\t\t      Lazy Initialization Instance");
		System.out.print("\n\t\t\t\t-----------------------------------------");
		LazyInitialization instance3 = LazyInitialization.getInstance();
		System.out.println("\n\t\t\t\tLazy Initialization Instance : " + instance3.hashCode());

		System.out.println();
		System.out.print("\n\t\t\t\t       Thread Safe Singleton Instance");
		System.out.print("\n\t\t\t\t------------------------------------------");
		ThreadSafeSingleton instance4 = ThreadSafeSingleton.getInstance();
		System.out.println("\n\t\t\t\tThread Safe Singleton Instance : " + instance4.hashCode());

		System.out.println();
		System.out.print("\n\t\t\t\t      Static Block Initialization Instance");
		System.out.print("\n\t\t\t\t------------------------------------------------");
		StaticBlockInitialization instance2 = StaticBlockInitialization.getInstance();
		System.out.println("\n\t\t\t\tStatic Block Initialization Instance : " + instance2.hashCode());

		System.out.println();
		System.out.print("\n\t\t\t\t       Using Serialization Singleton Instance");
		System.out.print("\n\t\t\t\t---------------------------------------------------");
		UsingSerializationSingleton instance7 = UsingSerializationSingleton.getInstance();
		System.out.println("\n\t\t\t\tUsing Serialization Singleton Instance : " + instance7.hashCode());

		System.out.println();
		System.out.print("\n\t\t\t            Bill Pugh Singleton Implementation Instance");
		System.out.print("\n\t\t\t     --------------------------------------------------------");
		BillPughSingletonImplementation instance6 = BillPughSingletonImplementation.getInstance();
		System.out.println("\n\t\t\t     Bill Pugh Singleton Implementation Instance : " + instance6.hashCode());


		System.out.println();
		System.out.print("\n\t\t\t          Thread Safe Singleton Using DoubleCheckedLocking Instance");
		System.out.print("\n\t\t\t    ---------------------------------------------------------------------");
		ThreadSafeSingletonUsingDoubleCheckedLocking instance5 = ThreadSafeSingletonUsingDoubleCheckedLocking.getInstance();
		System.out.println("\n\t\t\t    Thread Safe Singleton Using DoubleCheckedLocking Instance : " + instance5.hashCode());


	}

}
