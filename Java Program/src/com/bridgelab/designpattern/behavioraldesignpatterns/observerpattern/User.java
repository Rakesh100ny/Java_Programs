package com.bridgelab.designpattern.behavioraldesignpatterns.observerpattern;

public class User implements RedDressObserver{
  private Observable observable=new RedDress();
	String name;
	public User(String name)
	{
	 this.name=name;	
	}
	public void update(boolean inStock)
	{
	  buyDress(inStock);
	  unSubscribe(inStock);
	}

	private void unSubscribe(boolean inStock)
	{
	 if(inStock==true)
	 {
		observable.removeObserver(this); 
	 }
	 else
	 {
		 System.out.println("Please NotifyMe When Stock is Availabe Then Notification is Send...!"); 	 
	 }
	}

	private void buyDress(boolean inStock) 
	{
	 if(inStock==true)
	 {
  	  System.out.println("\n\tGot my new Red Dress");
	 }
	 else
	 {
	  System.out.println("Stock is Not Available...Out Off Stock");
	 
	 }
	}

}
