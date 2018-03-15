package com.bridgelab.utility;

public class InventoryDetails 
{
	 private String inventoryName;
	 private double weight;
	 private double price;
	 
	 public InventoryDetails(){}
	 
	 public void setInventoryName(String inventoryName)
	 {
	  this.inventoryName=inventoryName;	 
	 }
	 
	 public void setWeight(Double weight)
	 {
	  this.weight=weight;	 
	 }
	 
	 public void setPrice(double price)
	 {
	  this.price=price;	 
	 }
	 
	 public String getInventoryName()
	 {
	  return inventoryName;	 
	 }
	 
	 public double getWeight()
	 {
	  return weight;	 
	 }
	 
	 public double getPrice()
	 {
	  return price;	 
	 }
	 
}
