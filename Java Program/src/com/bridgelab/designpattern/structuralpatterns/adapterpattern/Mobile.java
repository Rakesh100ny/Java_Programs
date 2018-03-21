package com.bridgelab.designpattern.structuralpatterns.adapterpattern;

public class Mobile 
{
 OperatingSystem os=new OperatingSystem("Android", 2);
 
 public void hasA(Charger charger)
 {
  System.out.println(charger.getBrand());
  System.out.println(charger.getcolor());
 }
}
