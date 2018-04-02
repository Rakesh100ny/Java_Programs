/**********************************************************************************
 *  
 *  Purpose : Determine Strucral Design Pattern and In FacadeDesignPattern It is 
 *            Shopkeeper class Maintain EarRings,Nacklace,Chains Reference.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ***********************************************************************************/

package com.bridgelabz.facadedesignpattern;

public class ShopKeeper {  
    private JewelleryShop ear_ring;  
    private JewelleryShop nacklace;  
    private JewelleryShop chain;  
      
    public ShopKeeper(){  
        ear_ring= new EarRings();  
        nacklace=new Nacklace();  
        chain=new Chains();  
    }  
    
    public void earRingSale(){  
        ear_ring.Item();  
        ear_ring.price();  
    }  
        public void nacklaceSale(){  
        nacklace.Item();  
        nacklace.price();  
    }  
   public void chainSale(){  
    chain.Item();  
    chain.price();  
        }  
}  