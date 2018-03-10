package com.bridgelab.utility;


public class StackListForAnagram
{
 private Node top;
 
 public void push(int val)
 {
  Node nd=new Node(val);
  nd.next=top;
  top=nd;
  
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
  Node forword=top;
  int n=forword.val;
  
  while((n=pop())!=-1)
  {
   System.out.print(n+" ");	  
  }
 }	
 
 
 
 
 
 /*public void print()
 {
  _printRev(top);
 }
 
 
 private void _printRev(Node top)
 {
  if(top==null) return;
  _printRev(top.next);   
  System.out.print(top.val+" ");
 } 
*/

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
