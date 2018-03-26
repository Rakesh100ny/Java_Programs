/******************************************************************************
 *  
 *  Purpose : Determine Factory Design Pattern and it is My ComputerFactory Class.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/


package com.bridgelab.designpattern.factorypattern;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu)
	{
		if("PC".equalsIgnoreCase(type))
		 return new PC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type))
		  return new Server(ram, hdd, cpu);
		
		return null;
	}
}