/******************************************************************************
 *  
 *  Purpose : Determine Prototype Design Pattern and it is Employees Class 
 *            implements Cloneable Interface.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.prototypepattern;


import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable
{
 private List<String> list;
 
 public Employees() 
 {
  list=new ArrayList<String>();	 
 }
 
 public Employees(List<String>list)
 {
  this.list=list;	 
 }
	
 public void loadData()
 {
  list.add("Rakesh");
  list.add("Ranu");
  list.add("Vikas");
  list.add("Viki");
  list.add("Manu");
 }
 
 public List<String> getList()
 {
  return list;	 
 }
 
 public Object clone()
 {
  List<String> temp=new ArrayList<String>();
  
  for(String s : this.getList())
  {
   temp.add(s);	  
  }
  return new Employees(temp);
 }
}
