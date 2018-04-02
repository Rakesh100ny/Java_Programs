/******************************************************************************
 *  
 *  Purpose : Determine Factory Design Pattern and it is My PC Class extends Computer
 *            Abstract Class.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/


package com.bridgelabz.factorypattern;

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
