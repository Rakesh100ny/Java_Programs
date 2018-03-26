/******************************************************************************
 *  
 *  Purpose : Determine Prototype Design Pattern and it is Shape Abstract Class
 *            implement Cloneable.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.designpattern.prototypepattern;

public abstract class Shape implements Cloneable 
{
 private String id;
 protected String type;
 
 abstract void draw();
 
 public void setId(String id)
 {
  this.id=id;	 
 }
 
  public String getType()
 {
  return type;	 
 }
 
 public String getId()
 {
  return id;	 
 }
 
 public Object clone()
 {
  Object clone=null;
  
  try
  {
   clone=super.clone();	  
  }
  catch (Exception e) 
  {
	// TODO: handle exception
  }
  return clone;
 }
}
