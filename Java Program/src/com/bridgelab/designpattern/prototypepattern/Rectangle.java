/******************************************************************************
 *  
 *  Purpose : Determine Prototype Design Pattern and it is Rectangle Class 
 *            extends Shape Abstract Class.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/


package com.bridgelab.designpattern.prototypepattern;

public class Rectangle extends Shape
{
 public Rectangle() 
 {
  type="Rectangle";	
 }
 
 public void draw()
 {
  System.out.println("Rectangle is Draw...!");	 
 }
}
