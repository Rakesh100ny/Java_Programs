/******************************************************************************
 *  
 *  Purpose : Determine Prototype Design Pattern and it is Square Class extends 
 *            Shape Abstract Class.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/


package com.bridgelab.designpattern.prototypepattern;

public class Square extends Shape
{
	 public Square() 
	 {
	  type="Square";	
	 }
	 
	 public void draw()
	 {
	  System.out.println("Square is Draw...!");	 
	 }
}
