/**********************************************************************************
 *  
 *  Purpose : Determine Strucral Design Pattern and In AdapterDesignPattern and 
 *            It is Charger Class.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ***********************************************************************************/

package com.bridgelab.designpattern.structuralpatterns.adapterpattern;

public class Charger 
{
 String brand;
 String color;
 
 public Charger(String brand,String color)
 {
  this.brand=brand;
  this.color=color;
 }
 
 public String getBrand()
 {
  return brand;	 
 }
 
 public String getcolor()
 {
  return color;	 
 }
}
