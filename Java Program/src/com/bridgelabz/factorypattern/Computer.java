/******************************************************************************
 *  
 *  Purpose : Determine Factory Design Pattern and it is abstract Class.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.factorypattern;

public abstract class Computer {
	
	public abstract String getRam();
	public abstract String getHardDisk();
	public abstract String getCPU();
	
	public String toString()
	{
	 return "RAM= "+this.getRam()+", HDD="+this.getHardDisk()+", CPU="+this.getCPU();
	}
}