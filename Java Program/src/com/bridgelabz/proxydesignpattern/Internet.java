/**********************************************************************************
 *  
 *  Purpose : Determine Strucral Design Pattern and In ProxyDesignPattern It is 
 *            Internet Interface.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ***********************************************************************************/


package com.bridgelabz.proxydesignpattern;

public interface Internet 
{
 public void connectTo(String host) throws Exception;
}