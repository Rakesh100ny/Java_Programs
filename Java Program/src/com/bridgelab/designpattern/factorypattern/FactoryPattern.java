/******************************************************************************
 *  
 *  Purpose : Determine Factory Design Pattern and it is Main Class Taking many 
 *            Action.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/


package com.bridgelab.designpattern.factorypattern;

public class FactoryPattern {

	public static void main(String[] args)
	{
		Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println();
		System.out.println("\t\t\t\t         PC Configuration  ");
		System.out.print("\t\t\t\t----------------------------------");
		System.out.print("\n\t\t\t\t"+pc);
        System.out.println();
        System.out.println();
		System.out.println("\t\t\t\t         Sever Configuration  ");
		System.out.print("\t\t\t\t----------------------------------");
		System.out.print("\n\t\t\t\t"+server);
		
	}


}
