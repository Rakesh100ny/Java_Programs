/******************************************************************************
 *  
 *  Purpose : Determine Factory Design Pattern and it is My Sever Class extends Computer
 *            Abstract Class.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.factorypattern;

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