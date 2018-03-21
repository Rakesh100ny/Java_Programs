package com.bridgelab.designpattern.behavioraldesignpatterns.visitorpattern;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}