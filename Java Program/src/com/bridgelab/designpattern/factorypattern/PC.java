package com.bridgelab.designpattern.factorypattern;

 class PC extends Computer 
 {
   private String ram;
	private String hardisk;
	private String cpu;
	
	public PC(String ram, String hardisk, String cpu){
		this.ram=ram;
		this.hardisk=hardisk;
		this.cpu=cpu;
	}
	
	public String getRam() {
		return this.ram;
	}

	
	public String getHardDisk() {
		return this.hardisk;
	}

	public String getCPU() {
		return this.cpu;
	}

	
 }
