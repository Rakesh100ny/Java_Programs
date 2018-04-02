/**********************************************************************************
 *  
 *  Purpose : Determine Strucral Design Pattern and In ProxyDesignPattern It is 
 *            RealInternet class implements Internet.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ***********************************************************************************/

package com.bridgelabz.proxydesignpattern;


	public class RealInternet implements Internet {
		 
	    @Override
	    public void connectTo(String host) {
	        System.out.println("Connecting to "+host+"Site ");
	    }
	}

