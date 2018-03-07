package com.bridgelab.utility;

public class Node<T>
{
 T data;
 Node<?> next;
 
 Node(){}
 
 public void setData(T data)
 {
  this.data=data;	 
 }
 
 public T getData()
 {
  return data;	
 }
 
 public String toString()
 {
  return data+"";	 
 }
}
