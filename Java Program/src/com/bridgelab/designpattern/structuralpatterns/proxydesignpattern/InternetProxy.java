package com.bridgelab.designpattern.structuralpatterns.proxydesignpattern;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet {
	 private Internet internet = new RealInternet();
	    private static List<String> restrictedSites;
	     
	    static {
	        restrictedSites = new ArrayList<String>();
	        restrictedSites.add("jumbxyz.com");
	        restrictedSites.add("testme.com");
	        restrictedSites.add("www.adult-site.com");
	        restrictedSites.add("bad-site.com");
	    }
	     
	    @Override
	    public void connectTo(String host) throws Exception {
	         
	        if(!restrictedSites.contains(host.toLowerCase())){
	            internet.connectTo(host);
	        }
	        System.out.println("\n\\t\tMessage...!");
	        throw new Exception("Company Restricted  Site View...Please Removed Otherwise the Company Take Action against you");
	 
	    }
	 
	}
