package com.bridgelab.designpattern.singletonpattern;

public class EnumDemo {
	private static void simpleEnumExample(ThreadStates th) {
		if (th == ThreadStates.START)
			System.out.println("Thread is started");
		else if (th == ThreadStates.WAITING)
			System.out.println("Thread is waiting");
		else if (th == ThreadStates.RUNNING)
			System.out.println("Thread is running");
		else
			System.out.println("Thread is dead");
	}

	private static void simpleConstantsExample(int i) {
		if (i == ThreadStatesConstant.START)
			System.out.println("Thread is started");
		else if (i == ThreadStatesConstant.WAITING)
			System.out.println("Thread is waiting");
		else if (i == ThreadStatesConstant.RUNNING)
			System.out.println("Thread is running");
		else
			System.out.println("Thread is dead");
	}

	public static void main(String[] args) {
		System.out.println("    Using Enum");
		simpleEnumExample(ThreadStates.START);
		simpleEnumExample(ThreadStates.WAITING);
		simpleEnumExample(ThreadStates.RUNNING);
		simpleEnumExample(ThreadStates.DEAD);
		simpleEnumExample(ThreadStates.RUNNING);
		
		System.out.println();
		System.out.println(" Using Constant");
		simpleConstantsExample(1);
		simpleConstantsExample(2);
		simpleConstantsExample(3);
		simpleConstantsExample(4);
		// we can pass any int constant
		simpleConstantsExample(5);
		simpleConstantsExample(6);

	}

}	
