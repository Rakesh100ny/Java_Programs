/**********************************************************************************
 *  
 *  Purpose : Determine Strucral Design Pattern and In AdapterDesignPattern It is 
 *            Operating System Class.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ***********************************************************************************/

package com.bridgelab.designpattern.structuralpatterns.adapterpattern;

public class OperatingSystem
{
 String name;
 int size;
 
 public OperatingSystem(String name,int size)
 {
  this.name=name;
  this.size=size;
 }
 
 public String getName()
 {
  return name;	 
 }
 
 public int getsize()
 {
  return size;	 
 }
}
