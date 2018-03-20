package com.bridgelab.designpattern.factorypattern;

public abstract class Computer {
	
	public abstract String getRam();
	public abstract String getHardDisk();
	public abstract String getCPU();
	
	public String toString()
	{
	 return "RAM= "+this.getRam()+", HDD="+this.getHardDisk()+", CPU="+this.getCPU();
	}
}