/******************************************************************************
 *  
 *  Purpose : Determine Prototype Design Pattern and it is ShapeStore Class 
 *            and It class Support Prototype Pattern    
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.designpattern.prototypepattern;

import java.util.HashMap;
import java.util.Map;

public class ShapeStore
{
 private static Map<String,Shape> map=new HashMap<String,Shape>();
 
 public static Shape getShape(String id)
 {
  Shape shape=map.get(id);
  return (Shape) shape.clone();
 }
 
 public static void loadStore()
 {
  Circle circle=new Circle();
  circle.setId("1");
  map.put(circle.getId(),circle);
  
  Rectangle rectangle=new Rectangle();
  rectangle.setId("2");
  map.put(rectangle.getId(),rectangle);
  
  Square square=new Square();
  square.setId("3");
  map.put(square.getId(),square);
 }
 
}
