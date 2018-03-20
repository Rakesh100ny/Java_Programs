package com.bridgelab.designpattern.singletonpattern;

import java.io.Serializable;

public class SingletonTest implements Serializable {

	static public SingletonTest instance=new  SingletonTest();

	SingletonTest() {
		// private constructor
	}

	// implement readResolve method
	protected Object readResolve() {
		return instance;
	}

}