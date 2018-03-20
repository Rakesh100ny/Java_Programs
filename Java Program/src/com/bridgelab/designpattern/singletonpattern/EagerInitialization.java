package com.bridgelab.designpattern.singletonpattern;

public class EagerInitialization {
	private static EagerInitialization eagerInitialization = new EagerInitialization();

	private EagerInitialization() {
	}

	public static EagerInitialization getInstance() {

		return eagerInitialization;

	}
}
