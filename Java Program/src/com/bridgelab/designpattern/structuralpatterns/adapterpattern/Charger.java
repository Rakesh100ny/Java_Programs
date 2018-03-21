package com.bridgelab.designpattern.structuralpatterns.adapterpattern;

public class Charger 
{
 String brand;
 String color;
 
 public Charger(String brand,String color)
 {
  this.brand=brand;
  this.color=color;
 }
 
 public String getBrand()
 {
  return brand;	 
 }
 
 public String getcolor()
 {
  return color;	 
 }
}
