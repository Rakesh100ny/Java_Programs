/**********************************************************************************
 *  
 *  Purpose : Determine Strucral Design Pattern and In AdapterDesignPattern Main
 *            Class Using Mobile and Charger Example.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ***********************************************************************************/

package com.bridgelab.designpattern.structuralpatterns.adapterpattern;

public class Demo {

	public static void main(String[] args)
	{
     Mobile mobile=new Mobile();
     System.out.println(mobile.os.getName());
     System.out.println(mobile.os.getsize());
     
     Charger charger=new Charger("IPhone","black");
     mobile.hasA(charger);
     
     mobile=null;
     //System.out.println(mobile.os.getName());
     //System.out.println(mobile.os.getsize());
     System.out.println();
     System.out.println(charger.getBrand());
     System.out.println(charger.getcolor());
     
	}

}
