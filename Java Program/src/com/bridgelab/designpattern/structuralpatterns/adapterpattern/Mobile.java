/**********************************************************************************
 *  
 *  Purpose : Determine Strucral Design Pattern and In AdapterDesignPattern It is
 *            Mobile Class.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ***********************************************************************************/

package com.bridgelab.designpattern.structuralpatterns.adapterpattern;

public class Mobile 
{
 OperatingSystem os=new OperatingSystem("Android", 2);
 
 public void hasA(Charger charger)
 {
  System.out.println(charger.getBrand());
  System.out.println(charger.getcolor());
 }
}
