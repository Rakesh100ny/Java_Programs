/**********************************************************************************
 *  
 *  Purpose : Determine Strucral Design Pattern and In FacadeDesignPattern It is 
 *            OrderFacade class Its Helper Class Both Inventory or Payment.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ***********************************************************************************/

package com.bridgelab.designpattern.structuralpatterns.facadedesignpattern;

public class OrderFacade {

    private Payment pymt = new Payment();

    private Inventory inventry = new Inventory();

 

    public void placeOrder(String orderId) {

        String step1 = inventry.checkInventory(orderId);

        String step2 = pymt.deductPayment(orderId);

        System.out

                .println("Following steps completed : " + step1
                        + " & " + step2);

    }

}