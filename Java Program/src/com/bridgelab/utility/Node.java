/******************************************************************************
 *  
 *  Purpose : Making NodeOfUserDefind and Performing OrderLinkedList and
 *            UnorderLinkedList
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/


package com.bridgelab.utility;

public class Node<T>
{
 T data;
 Node<T> next;
 
 Node(){}
 
 
 public T getData()
 {
  return data;	
 }
 
 public String toString()
 {
  return data+"";	 
 }

 public void setData(T data) 
 {
  this.data=data;	 
 }
}
