/******************************************************************************
 *  
 *  Purpose : Determine Factory Design Pattern and it is Plan Abstract Class.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.designpattern.factorypattern;

public abstract class Plan {
 protected double rate;
 abstract void getRate();
 
 public void calculateBill(int units)
 {
  System.out.println(units*rate);	 
 }
}
