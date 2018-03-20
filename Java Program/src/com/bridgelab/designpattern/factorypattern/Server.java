package com.bridgelab.designpattern.factorypattern;

public class Server extends Computer {

	private String ram;
	private String harddisk;
	private String cpu;
	
	public Server(String ram, String harddisk, String cpu){
		this.ram=ram;
		this.harddisk=harddisk;
		this.cpu=cpu;
	}

	public String getRam() {
		return this.ram;
	}

	public String getHardDisk() {
		return this.harddisk;
	}

	public String getCPU() {
		return this.cpu;
	}

}