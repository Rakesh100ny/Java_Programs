package com.bridgelab.designpattern.structuralpatterns.facadedesignpattern;

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