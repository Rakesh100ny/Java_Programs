package com.bridgelab.utility;

public class QueueUsingString
{
 private Node front,rear;
 private int count=0;
 public void insert(String val)
 {
  Node nd=new Node(val);
  
  if(front==null)
   front=nd;
  else
   rear.next=nd;
  
  rear=nd;
  count++;
 }
 
 public  String delete()
 {
  if(front==null)return null;
  String n=front.val;
  front=front.next;
  count--;
  return n;
 }

 public int size()
 {
  return count;
 }

 public void print() 
 {
  Node forword=front;
  String n=forword.val;
  
  while((n=delete())!=null)
  {
   System.out.println(n);	  
  }
 }	

  
 class Node
 {
  String val;
  Node next;
  
  Node(){}
  
  Node(String val)
  {
   this.val=val;	  
  }
 }

}
