package com.bridgelab.designpattern.structuralpatterns.adapterpattern;

public class Socket {

	public Volt getVolt(){
		return new Volt(120);
	}
}
