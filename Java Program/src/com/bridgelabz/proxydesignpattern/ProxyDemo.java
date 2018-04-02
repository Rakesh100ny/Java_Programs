/**********************************************************************************
 *  
 *  Purpose : Determine Strucral Design Pattern and In ProxyDesignPattern It is 
 *            ProxyDemo Main class Taking Action.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ***********************************************************************************/

package com.bridgelabz.proxydesignpattern;

import com.bridgelabz.utility.Utility;

public class ProxyDemo {

	public static void main(String[] args) {
		 Utility utility=new Utility();
		  Internet intConn = new InternetProxy();
	        try {
	        	System.out.print("Enter the Site Name         : ");
	        	String s1=utility.inputString2();
	        	System.out.print("Enter the Another Site Name : ");
	        	String s2=utility.inputString2();
	        	
	            intConn.connectTo(s1);
	            intConn.connectTo(s2);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}