/**********************************************************************************
 *  
 *  Purpose : Determine Strucral Design Pattern and In ProxyDesignPattern It is 
 *            CommandExecutor Interface.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ***********************************************************************************/

package com.bridgelabz.proxydesignpattern;


public interface CommandExecutor {

	public void runCommand(String cmd) throws Exception;
}