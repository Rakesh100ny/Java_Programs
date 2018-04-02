/**********************************************************************************
 *  
 *  Purpose : Determine Strucral Design Pattern and In ProxyDesignPattern It is 
 *            CommandExecutorImp1 implements CommandExecutor.     
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ***********************************************************************************/

package com.bridgelabz.proxydesignpattern;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor {

	@Override
	public void runCommand(String cmd) throws IOException {
                //some heavy implementation
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");
	}
}
