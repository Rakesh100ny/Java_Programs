package com.bridgelab.utility;



public class DequeForPalindrome 
{
 private char array[]=new char[5];
 private int front=array.length,rear=-1;
 
 
 public static DequeForPalindrome deque()
 {
  DequeForPalindrome deque=new DequeForPalindrome();
  return deque;
 }

 

 public static void addFront(DequeForPalindrome  deque,char data)
 {
  if(deque.front-1!=deque.rear)
  {
   deque.array[--deque.front]=data;
  }
 }
	
 public static void addRear(DequeForPalindrome deque,char data)
 {
  if(deque.rear+1!=deque.front)
  {
   deque.array[++deque.rear]=data;
  }
 }

public static char removeFront(DequeForPalindrome deque)
{
 if(deque.front!=deque.size())
 {
  char temp=deque.array[deque.size()-1];
  int i=deque.size()-1;
  
  while(i>deque.front)
  {
   deque.array[i]=deque.array[i-1];
   i=i-1;
  }
  
  deque.front=deque.front+1;
  return temp;
 }
 return ' '; 
}
	
public static char removeRear(DequeForPalindrome deque)
{
 if(deque.rear!=-1)
 {
  char temp=deque.array[0];
  int i=1;
  
  while(i<=deque.rear)
  {
   deque.array[i-1]=deque.array[i];
   i=i+1;
  }
  
  deque.rear=deque.rear-1;
  return temp;
 }
 return ' '; 
}
	
public int size() 
{
 DequeForPalindrome deque=DequeForPalindrome.deque();
 
 int size=deque.array.length;
 
 if(size==0)
 {
  System.out.println("Deque is Empty...!");	 
 }
 
 return size;
}



public static boolean checkDeque(DequeForPalindrome deque) 
{
 if(deque.rear==deque.size()-1 || deque.front==deque.rear+1)
 {
  deque.rear=0;
  deque.front=deque.size()-1;
  int d=0;
  
  for(int i=deque.rear,j=deque.front;i<=j;i++,j--)
  {
   char temp1,temp2;
   temp1=deque.array[i];
   temp2=deque.array[j];
   
   if(temp1>='a' && temp1<='Z')
   {
	temp1=(char)(temp1-32);    
   }
   
   if(temp2>='a' && temp2<='Z')
   {
	temp2=(char)(temp1-32);    
   }
   
   d=(temp1-temp2);
  }

  if(d==0)
   return true;

 }
  return false;
 }	
}
