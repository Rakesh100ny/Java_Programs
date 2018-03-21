package com.bridgelab.designpattern.structuralpatterns.proxydesignpattern;

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