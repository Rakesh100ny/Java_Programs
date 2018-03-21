package com.bridgelab.designpattern.structuralpatterns.proxydesignpattern;

import java.util.Scanner;

public class ProxyDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  Internet intConn = new InternetProxy();
	        try {
	        	System.out.print("Enter the Site Name         : ");
	        	String s1=sc.next();
	        	System.out.print("Enter the Another Site Name : ");
	        	String s2=sc.next();
	        	
	            intConn.connectTo(s1);
	            intConn.connectTo(s2);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}