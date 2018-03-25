package com.bridgelab.designpattern.behavioraldesignpatterns.observerpattern;

public interface Observable 
{
 public void addObserver(RedDressObserver observer);
 public void removeObserver(RedDressObserver observer);
 public void notifyObserver(boolean inStock);
}
