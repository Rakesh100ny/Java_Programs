package com.bridgelab.utility;

public class StackList
{
 private Node top;

 public void push(char operator,int position)
 {
  Node node=new Node(operator,position);
  node.next=getTop();
  setTop(node);
 }
 
 public char pop()
 {
  char character=' ';	 
  if(getTop()!=null)
  {
   character=getTop().operator;
   setTop(getTop().next);
  }
  return character;
 }

 public Node getTop()
 {
	return top;
 }

 public void setTop(Node top) 
 {
	this.top = top;
 }

 public boolean isEmpty()
 {
  return getTop()==null;	 
 }
 
 public class Node
 {
  char operator;
  int position;
  Node next;
  
  Node (){}
  
  Node(char operator,int position)
  {
   this.operator=operator;
   this.setPosition(position);
  }

  public int getPosition()
  {
	return position;
  }

  public void setPosition(int position) 
  {
	this.position = position;
  }
 }
}
