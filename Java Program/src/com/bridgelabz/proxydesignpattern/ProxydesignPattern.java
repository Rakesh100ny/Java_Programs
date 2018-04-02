/**********************************************************************************
 *  
 *  Purpose : Determine Strucral Design Pattern and In ProxyDesignPattern It is 
 *            ProxydesignPattern Main class Taking Action.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ***********************************************************************************/


package com.bridgelabz.proxydesignpattern;

public class ProxydesignPattern {

	public static void main(String[] args){
		CommandExecutor executor = new CommandExecutorProxy("Rakesh", "wrong_pwd");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}

}