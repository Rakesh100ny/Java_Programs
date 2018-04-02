/******************************************************************************
 *  
 *  Purpose : Determine Behavioral Design Pattern and it is Mian Class and Taking
 *            Many Action.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.observerpattern;

public class ObserverPatternRedDress {
 public static void main(String args[])
 {

  User user1=new User("Rakesh");
  User user2=new User("Ranu");
  User user3=new User("Vikas");
  
  RedDress redDress1=new RedDress();
  RedDress redDress2=new RedDress();
  RedDress redDress3=new RedDress();
  redDress1.addObserver(user1);
  redDress1.setInStock(true);
  redDress2.addObserver(user2);
  redDress2.setInStock(true);
  
  redDress3.addObserver(user3);
  redDress3.setInStock(false);
 }
}
