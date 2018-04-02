/******************************************************************************
 *  
 *  Purpose : Determine Prototype Design Pattern and it is Circle Class extends 
 *            Shape Abstract Class.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.prototypepattern;

public class Circle extends Shape 
{
	 public Circle() 
	 {
	  type="Circle";	
	 }
	 
	 public void draw()
	 {
	  System.out.println("Circle is Draw...!");	 
	 }

}
