package com.bridgelab.designpattern.singletonpattern;

public class EagerInitialization {
	private static EagerInitialization INSTANCE = new EagerInitialization();

	private EagerInitialization(){}

	public static EagerInitialization getInstance() 
	{

		return INSTANCE;

	}
}
