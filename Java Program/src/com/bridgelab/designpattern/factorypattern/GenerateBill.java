/******************************************************************************
 *  
 *  Purpose : Determine Factory Design Pattern and It is Generate Bill Class 
 *            and Its is Main class and Taking Action.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.designpattern.factorypattern;

import com.bridgelab.utility.Utility;

public class GenerateBill {

	public static void main(String[] args) {
	    GetPlanFactory planFactory = new GetPlanFactory();  
        Utility utility=new Utility();
	      System.out.print("Enter the name of plan for which the bill will be generated: ");  
	     
	      String planName=utility.inputString2(); 
	      System.out.print("Enter the number of units for bill will be calculated: ");  
	      int units=utility.inputInteger();  
	  
	      Plan p = planFactory.getPlan(planName);  
	      //call getRate() method and calculateBill()method of DomesticPaln.  
	  
	       System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
	           p.getRate();  
	           p.calculateBill(units);  
	            }  
	    }