package com.bridgelab.designpattern.structuralpatterns.adapterpattern;

public class OperatingSystem
{
 String name;
 int size;
 
 public OperatingSystem(String name,int size)
 {
  this.name=name;
  this.size=size;
 }
 
 public String getName()
 {
  return name;	 
 }
 
 public int getsize()
 {
  return size;	 
 }
}
