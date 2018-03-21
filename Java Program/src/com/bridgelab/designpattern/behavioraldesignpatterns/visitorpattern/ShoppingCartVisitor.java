package com.bridgelab.designpattern.behavioraldesignpatterns.visitorpattern;

public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}