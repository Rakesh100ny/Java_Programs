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
