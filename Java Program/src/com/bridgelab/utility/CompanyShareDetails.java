package com.bridgelab.utility;

public class CompanyShareDetails 
{
	 private String companyName;
	 private String companyShare;
	 private int    noOfShare;
	 private double shareAmmount;
	 
	 public CompanyShareDetails(){}
	 
	 public void setCompanyName(String companyName)
	 {
	  this.companyName=companyName;	 
	 }
	 
	 public void setCompanyShare(String companyShare)
	 {
	  this.companyShare=companyShare;	 
	 }
	 
	 public void setNoOfShare(int noOfShare)
	 {
	  this.noOfShare=noOfShare;	 
	 }
	 
	 public void setShareAmmount(double shareAmmount)
	 {
	  this.shareAmmount=shareAmmount;	 
	 }
	 
	 public String getCompanyName()
	 {
	  return companyName;	 
	 }
	 
	 public String getCompanyShare()
	 {
	  return companyShare;	 
	 }
	 
	 public int getNoOfShare()
	 {
	  return noOfShare;	 
	 }
	 
	 public double getShareAmmount()
	 {
	  return shareAmmount;	 
	 }
	}
