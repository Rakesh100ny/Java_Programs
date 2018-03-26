/**********************************************************************************
 *  
 *  Purpose : Determine Strucral Design Pattern and In FacadeDesignPattern It is 
 *            Chains class implement JewelleryShop Interface.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ***********************************************************************************/


package com.bridgelab.designpattern.structuralpatterns.facadedesignpattern;

public class Chains implements JewelleryShop {  
      
    public void Item() {  
    System.out.println("\n\t\t\t\t Gold-Chain Printing Model ");  
    }  
      
    public void price() {  
        System.out.println("\n\t\t\t\t Rs 75000.00 ");  
    }  
}  