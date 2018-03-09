package com.bridgelab.utility;

import org.omg.CORBA.PRIVATE_MEMBER;

public class StackListForAnagram
{
 private Node top;
 
 public boolean push(int val)
 {
  Node nd=new Node(val);
  nd.next=top;
  top=nd;
  return true;
 }
	
 public int pop()
 { 
  if(top==null)return -1;
  int n=top.val;
  top=top.next;
  return n;
 }
 
 public void print()
 {
  _printRev(top);	 
 }
 
 
 private void _printRev(Node top)
 {
  Node forword=top;
  if(forword==null) return;
  
  _printRev(top.next);
  System.out.print(top.val+" ");
  
  
 } 


class Node
 {
  public int val;
  public Node next;
  
  Node(){}
  
  Node(int val)
  {
   this.val=val;	  
  }
 }
}
