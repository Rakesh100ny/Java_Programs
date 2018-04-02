/******************************************************************************
 *  
 *  Purpose : Determine Prototype Design Pattern and it is Main Class Taking
 *            Many Action.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.prototypepattern;

import java.util.List;

public class PrototypePattern 
{
 public static void main(String[] args)
 {
  System.out.println("\n\t\tEmployee Class Related...!");
  System.out.println("----------------------------------------------------");
  Employees emp=new Employees();
  emp.loadData();
  Employees emp1=(Employees)emp.clone();
  Employees emp2=(Employees)emp.clone();
  List<String> list=emp1.getList();
  list.add("Chiku");
  List<String> list1=emp2.getList();
  list1.remove("Ranu");
  
  
  System.out.println("emp  List : "+emp.getList());
  System.out.println("emp1 List : "+list);
  System.out.println("emp2 List : "+list1);
  System.out.println("----------------------------------------------------");
  System.out.println();
  System.out.println("Shape Class Related...!");
  System.out.println("-----------------------");

 
  
  ShapeStore.loadStore();
  Shape shape1=ShapeStore.getShape("1");
  System.out.println("Shape : "+shape1.getType());

  Shape shape2=ShapeStore.getShape("2");
  System.out.println("Shape : "+shape2.getType());

  Shape shape3=ShapeStore.getShape("3");
  System.out.println("Shape : "+shape3.getType());
  System.out.println("-----------------------");

 }
}
