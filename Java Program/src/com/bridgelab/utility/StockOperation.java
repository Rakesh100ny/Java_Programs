package com.bridgelab.utility;

import java.awt.Checkbox;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StockOperation 
{
	 private JSONObject jsonUserObject=new JSONObject();
	 private JSONArray  jsonUserArray=new JSONArray();
	 private JSONObject jsonShareObject=new JSONObject();
	 private JSONArray  jsonShareArray=new JSONArray();
	 private Queue queue=new Queue();
	 private Stack stack=new Stack();
	
	 private String userFile="/home/brideit/userAccount.json";
	 private String shareFile="/home/brideit/share.json";
     Utility utility=new Utility();
     private int onlyTry=0;
     public void createUser() throws IOException, ParseException 
	{
		 FileReader fr=new FileReader(userFile);
		  BufferedReader br=new BufferedReader(fr);
		  
		  if(br.readLine()==null)
		  { 
		   addUserObject(jsonUserArray);	  
		  }
		  else
		  {
		   jsonUserArray=getCurrentUserObject();
		   addUserObject(jsonUserArray);
		  }	
	}

	private JSONArray getCurrentUserObject() throws FileNotFoundException, IOException, ParseException 
	{
		 JSONParser parser=new JSONParser();
		  Object obj=parser.parse(new FileReader(userFile));
		  JSONObject temp=(JSONObject)obj;
		  JSONArray jsonArray=(JSONArray)temp.get("User_Account");
		  return jsonArray;
	}

	private void addUserObject(JSONArray jsonUserArray) throws IOException 
	{
		 System.out.println("\n\t\t\t\t    U S E R-A C C O U N T");
		  System.out.println("\t\t\t\t----------------------------");
		  System.out.print("\n\t\t\t\tEnter the User Name            : ");
		  String userName=utility.inputString2();
		  System.out.print("\n\t\t\t\tEnter the Share                : ");
		  double userShare=utility.inputDouble();
		  System.out.print("\n\t\t\t\tEnter the Amount of Each Share : ");
		  double shareAmmount=utility.inputDouble();
		  System.out.print("\n\t\t\t\tEnter the User Mobile Number   : ");
		  String userMobile=utility.inputString2();

		  JSONObject temp=new JSONObject();
		  temp.put("User_Name"    , userName);
		  temp.put("User_Share"   , userShare);
		  temp.put("Share_Ammount", shareAmmount);
		  temp.put("User_MobileNo", userMobile);
		  temp.put("Ammount_Total", (userShare*shareAmmount));
		  jsonUserArray.add(temp);
		  jsonUserObject.put("User_Account", jsonUserArray);
		  
		  uploadOnUserFile(jsonUserObject);
		  

		
	}

	private void uploadOnUserFile(JSONObject jsonObject) throws IOException
	{
		FileWriter fw = new FileWriter(userFile);
		fw.write(jsonObject.toString());
	    fw.flush();		
	}

	public void buy() throws FileNotFoundException, IOException, ParseException
	{ 
		String companyShare="";
		 System.out.print("\n\t\t\t\tEnter Name of the User     : ");
		 String name = utility.inputString2();
		 System.out.print("\n\t\t\t\tEnter MobileNo of the User : ");
		 String mobile = utility.inputString2();
		 
		 boolean isFind=toCheckUserDetails(name,mobile);
		 if(isFind)
		 {
			 System.out.print("\n\t\t\t\tEnter The Company Name Which you want to buy share     : ");
			 String companyName = utility.inputString2();
			 System.out.print("\n\t\t\t\tEnter Share Symbol Which you want to buy share [@,#,!] : ");
			 companyShare = utility.inputString2();
			 System.out.print("\n\t\t\t\tHow Many Share Which you want to buy share [@,#,!]     : ");
			 int noOfShare = utility.inputInteger();
			 jsonUserArray=getCurrentUserObject();
			 JSONObject toCheck=null;
		    
			
			 boolean isFindCompnayShare=toCheckComanyDetails(companyName,companyShare,noOfShare);
		
		
			 if(isFindCompnayShare)
			 {
			    	JSONParser parser=new JSONParser();
			    	Object obj=parser.parse(new FileReader(shareFile));
				    JSONObject object=(JSONObject)obj;
				    JSONArray jsonShareArray=(JSONArray)object.get("Share_Info");
				    JSONObject toCheck2=null;
				    double companyShareAmmount=0;
					 for(int p=0;p<jsonShareArray.size();p++)
					 {
					  toCheck2=(JSONObject)jsonShareArray.get(p);	 
					  if(toCheck2.get("Company_Name").equals(companyName) && toCheck2.get("Company_Share").equals(companyShare))
					  {
					   companyShareAmmount=Double.parseDouble(toCheck2.get("Share_Ammount").toString());
					   double shareCount=Double.parseDouble(toCheck2.get("Number_Of_Share").toString());
					   double newShareCount=shareCount-noOfShare;
					   toCheck2.put("Number_Of_Share", newShareCount);
					  }
					 }					  

					 
					  for(int i=0;i<jsonUserArray.size();i++)
					  {
					   toCheck=(JSONObject)jsonUserArray.get(i);
					   if(toCheck.get("User_Name").equals(name) && toCheck.get("User_MobileNo").equals(mobile))
					   {
						double userShare= Double.parseDouble(toCheck.get("User_Share").toString());
						double newShare=userShare+noOfShare;
				        toCheck.put("User_Share", newShare);
				    	double shareAmount=  Double.parseDouble(toCheck.get("Share_Ammount").toString());
					      double newAmmount=shareAmount-(noOfShare*companyShareAmmount);
					      toCheck.put("Share_Ammount", newAmmount);
						         
					      toCheck.put("Ammount_Total", (newAmmount*newShare));
					    
				        }
						
							 
					  }

					  jsonUserObject.put("User_Account", jsonUserArray);
					  uploadOnUserFile(jsonUserObject);
					  jsonShareObject.put("Share_Info", jsonShareArray);
					  uploadOnShareFile(jsonShareObject);
					  System.out.println("\n\t\t\t\tUpdate is successfully...!");
					  long time=System.currentTimeMillis();
					  Date date=new Date(time);
					  queue.insert(date);
					  
					  stack.push(companyShare);
					  System.out.println("\n\t\t\t\tCompany Share Buy --> "+stack.pop()+" at the Time of "+queue.delete());
										  
			 }
			 else
			 {
				  System.out.print("\n\t\t\t\tCompany is not Available...!");
				  System.out.print("\n\t\t\t\tCompany Share is not Available...!");
				  System.out.print("\n\t\t\t\tCompany Number Of Share is less than You are want...!");
				  System.out.print("\n\t\t\t\tFirst To Check Company Share List (Y/N) ?");
				  char input=' ';
				   input=utility.inputCharacter();
				   if(input=='Y' || input=='y')
				   {
					   displayCompanyShare();  		  
				   } 	
					 
			 }
		 }
		 else
		 {
			  System.out.print("\n\t\t\t\tUser Account is not Available in the Database So....To First Create User Account(Y/N) ");
			   char input=' ';
			   input=utility.inputCharacter();
			   if(input=='Y' || input=='y')
			   {
				   createUser();  		  
			   } 	
		 }
	 
	}

	private boolean toCheckNumberOfShare(String companyName,int noOfShare) throws FileNotFoundException, IOException, ParseException
	{ 
	 String shareNumber=Integer.toString(noOfShare);	
	 JSONParser parser=new JSONParser();
	 Object obj=parser.parse(new FileReader(shareFile));
	 JSONObject object=(JSONObject)obj;
	 
	 JSONArray storeData=(JSONArray)object.get("Share_Info");
	 JSONObject toCheck=null;
	 for(int i=0;i<storeData.size();i++)
	 {
	  toCheck=(JSONObject)storeData.get(i);	 
	  
	  if(toCheck.get("Company_Name").equals(companyName) );
	  {
	   if(shareNumber.compareTo(toCheck.get("Number_Of_Share").toString())<=0)
	   {
		 return true;
	   }
	   else
	   {
		break;    
	   }
	  }
	
	 }
	  return false;
	}

	private boolean toCheckShareDetails(String companyName,String companyShare) throws FileNotFoundException, IOException, ParseException 
	{
		 JSONParser parser=new JSONParser();
		 Object obj=parser.parse(new FileReader(shareFile));
		 JSONObject object=(JSONObject)obj;
		 
		 JSONArray storeData=(JSONArray)object.get("Share_Info");
		 JSONObject toCheck=null;
		 for(int i=0;i<storeData.size();i++)
		 {
		  toCheck=(JSONObject)storeData.get(i);	 
		  
		  if(toCheck.get("Company_Name").equals(companyName));
		  {
			if(toCheck.get("Company_Share").toString().equals(companyShare))
			{
			 return true;  
			}
			else
			{
			 break;	
			}
		  }
		 }
		  return false;
	}

	private void uploadOnShareFile(JSONObject jsonShareObject) throws IOException
	{
		FileWriter fw = new FileWriter(shareFile);
		fw.write(jsonShareObject.toString());
	    fw.flush();		
	
	}

	private boolean toCheckComanyDetails(String companyName,String companyShare,int noOfShare) throws FileNotFoundException, IOException, ParseException
	{
		 String shareNumber=Integer.toString(noOfShare);	

		 JSONParser parser=new JSONParser();
		 Object obj=parser.parse(new FileReader(shareFile));
		 JSONObject object=(JSONObject)obj;
		 
		 JSONArray storeData=(JSONArray)object.get("Share_Info");
		 JSONObject toCheck=null;
		 for(int i=0;i<storeData.size();i++)
		 {
		  toCheck=(JSONObject)storeData.get(i);	 
		  

		  String name=toCheck.get("Company_Name").toString();
		  switch (name)
		  {
		   case "TCS" : if(name.equals(companyName) && toCheck.get("Company_Share").equals(companyShare) && shareNumber.compareTo(toCheck.get("Number_Of_Share").toString())<=0)
		                {
			             return true;
		                }
						break;

						
		   case "MERU" : if(name.equals(companyName) && toCheck.get("Company_Share").equals(companyShare) && shareNumber.compareTo(toCheck.get("Number_Of_Share").toString())<=0)
           				 {
			   			  return true;
           				 }
						 break;

		   case "YATRA" : if(name.equals(companyName) && toCheck.get("Company_Share").equals(companyShare) && shareNumber.compareTo(toCheck.get("Number_Of_Share").toString())<=0)
           				  {
			   				return true;
           				  }
						  break;

		   default      : System.out.println("Invalid Company Name : ");
			
		} 
	  }
		  return false;
	}

	public void sell() throws FileNotFoundException, IOException, ParseException 
	{
		 System.out.print("\n\t\t\t\tEnter Name of the User     : ");
		 String name = utility.inputString2();
		 System.out.print("\n\t\t\t\tEnter MobileNo of the User : ");
		 String mobile = utility.inputString2();
		 
		 boolean isFind=toCheckUserDetails(name,mobile);
		 if(isFind)
		 {
			 System.out.print("\n\t\t\t\tEnter The Company Name Which you want to buy share     : ");
			 String companyName = utility.inputString2();
			 System.out.print("\n\t\t\t\tEnter Share Symbol Which you want to buy share [@,#,!] : ");
			 String companyShare = utility.inputString2();
			 System.out.print("\n\t\t\t\tHow Many Share Which you want to Sell share [@,#,!]     : ");
			 int noOfShare = utility.inputInteger();
			 jsonUserArray=getCurrentUserObject();
			 JSONObject toCheck=null;
		    
			
			 boolean isFindCompnayDetails=toCheckComanyDetails(companyName,companyShare,noOfShare);
			 
		
			 if(isFindCompnayDetails)
			 {
			    	JSONParser parser=new JSONParser();
			    	Object obj=parser.parse(new FileReader(shareFile));
				    JSONObject object=(JSONObject)obj;
				    JSONArray jsonShareArray=(JSONArray)object.get("Share_Info");
				    JSONObject toCheck2=null;
				    double companyShareAmmount=0;
					 for(int p=0;p<jsonShareArray.size();p++)
					 {
					  toCheck2=(JSONObject)jsonShareArray.get(p);	 
					  if(toCheck2.get("Company_Name").equals(companyName) && toCheck2.get("Company_Share").equals(companyShare))
					  {
					   companyShareAmmount=Double.parseDouble(toCheck2.get("Share_Ammount").toString());
					   double shareCount=Double.parseDouble(toCheck2.get("Number_Of_Share").toString());
					   double newShareCount=shareCount-noOfShare;
					   toCheck2.put("Number_Of_Share", newShareCount);
					  }
					 }					  

					 
					  for(int i=0;i<jsonUserArray.size();i++)
					  {
					   toCheck=(JSONObject)jsonUserArray.get(i);
					   if(toCheck.get("User_Name").equals(name) && toCheck.get("User_MobileNo").equals(mobile))
					   {
						double userShare= Double.parseDouble(toCheck.get("User_Share").toString());
						double newShare=userShare-noOfShare;
				        toCheck.put("User_Share", newShare);
				    	double shareAmount=  Double.parseDouble(toCheck.get("Share_Ammount").toString());
					      double newAmmount=shareAmount+(noOfShare*companyShareAmmount);
					      toCheck.put("Share_Ammount", newAmmount);
						         
					      toCheck.put("Ammount_Total", (newAmmount*newShare));
					    
				        }
						
							 
					  }

					  jsonUserObject.put("User_Account", jsonUserArray);
					  uploadOnUserFile(jsonUserObject);
					  jsonShareObject.put("Share_Info", jsonShareArray);
					  uploadOnShareFile(jsonShareObject);
					  System.out.println("\n\t\t\t\tUpdate is successfully...!");
			 }
			 else
			 {
				  System.out.print("\n\t\t\t\tCompany is not Available...!");
				  System.out.print("\n\t\t\t\tCompany Share is not Available...!");
				  System.out.print("\n\t\t\t\tCompany Number Of Share is less than You are want...!");
				  System.out.print("\n\t\t\t\tFirst To Check Company Share List (Y/N) ?");
				  char input=' ';
				   input=utility.inputCharacter();
				   if(input=='Y' || input=='y')
				   {
					   displayCompanyShare();  		  
				   } 	
					 
			 }
		 }
		 else
		 {
			  System.out.print("\n\t\t\t\tUser Account is not Available in the Database So....To First Create User Account(Y/N) ");
			   char input=' ';
			   input=utility.inputCharacter();
			   if(input=='Y' || input=='y')
			   {
				   createUser();  		  
			   } 	
		 }
		
	}

	public void dispalyReport() throws FileNotFoundException, IOException, ParseException 
	{
		System.out.print("\n\t\t\t\t  D I S P L A Y-D E T A I L S");
		System.out.println("\n\t\t\t\t-------------------------------");
		System.out.println("\t\t\t\tDispaly User Account  : Enter 1 ");
		System.out.println("\t\t\t\tDispaly Company Stock : Enter 2 ");
		System.out.print("\n\t\t\t  Enter the Choice Which You Want to Dispaly : ");
		int choice = utility.inputInteger();
		
		switch(choice) {
			
		case 1  : displayUserAcount();
			      break;	
		case 2  : displayCompanyShare();
				  break;
		default : System.out.println("Enter correct choice please...");
	  }	
	}

	private void displayCompanyShare() throws FileNotFoundException, IOException, ParseException
	{
		  
	JSONParser parse = new JSONParser();
	Object obj = parse.parse(new FileReader(shareFile));
	JSONObject outer = (JSONObject) obj;
	JSONArray jsonArray = (JSONArray) outer.get("Share_Info");
	JSONObject compareObj;
	System.out.println();
	    System.out.println("\t\t\t               C O M P A N Y_S H A R E_D E T A I L S");
	    System.out.println("\t\t\t------------------------------------------------------------");
	    System.out.println("\t\t\tCompany_Name | Company_Share  | Share_Count | Share_Ammount ");
	
	    
		for(int i=0;i<jsonArray.size();i++) 
		{
		    compareObj=(JSONObject) jsonArray.get(i);
			String companyName = (String) compareObj.get("Company_Name");
			String companyShare = (String)compareObj.get("Company_Share");
			String shareAmmount = compareObj.get("Share_Ammount").toString();
			String shareCount = compareObj.get("Number_Of_Share").toString();
			System.out.printf("%32s %12s %15s %15s ",companyName,companyShare,shareCount,shareAmmount);
	        System.out.println(); 
		      
		}
		
		
	}

	private void displayUserAcount() throws FileNotFoundException, IOException, ParseException
	{
		System.out.print("\n\t\t\t       D I S P L A Y-D E T A I L S");
		System.out.println("\n\t\t\t    --------------------------------------");
		System.out.println("\t\t\t    Dispaly User Account By Name : Enter 1 ");
		System.out.println("\t\t\t    Dispaly All User Account     : Enter 2 ");
		System.out.print("\n\t\t\t  Enter the Choice Which You Want to Dispaly : ");
		int choice = utility.inputInteger();

		switch(choice) {
			
		case 1  : displayUserByName();
			      break;	
		case 2  : displayEachUserAccount();
				  break;
		default : System.out.println("Enter correct choice please...");
	  }	

	}

	private void displayEachUserAccount() throws FileNotFoundException, IOException, ParseException 
	{
	 System.out.print("\n\t\t\t\tEnter Name of the User     : ");
	 String name = utility.inputString2();
	 System.out.print("\n\t\t\t\tEnter MobileNo of the User : ");
	 String mobile = utility.inputString2();
	 
	 boolean isFind=toCheckUserDetails(name,mobile);
		if(isFind)
		{
			  
		JSONParser parse = new JSONParser();
		Object obj = parse.parse(new FileReader(userFile));
		JSONObject outer = (JSONObject) obj;
		JSONArray jsonArray = (JSONArray) outer.get("User_Account");
		JSONObject compareObj;
		System.out.println();
		    System.out.println("\t\t\t                         U S E R_A C C O U N T_D E T A I L S");
	 	    System.out.println("\t\t\t-------------------------------------------------------------------------------");
	 	    System.out.println("\t\t\tUser_Name    | User_Share  | Share_Ammount | User_Mobile_Number | Total_Ammount");
		
	 	    
			for(int i=0;i<jsonArray.size();i++) 
			{
			    compareObj=(JSONObject) jsonArray.get(i);
				String userName = compareObj.get("User_Name").toString();
				String userShare = (String)compareObj.get("User_Share").toString();
				String shareAmmount = compareObj.get("Share_Ammount").toString();
				String userMobileNo = compareObj.get("User_MobileNo").toString();
				String total=compareObj.get("Ammount_Total").toString();
				System.out.printf("%32s %12s %15s %25s %10s ",userName,userShare,shareAmmount,userMobileNo,total);
		        System.out.println(); 
			      
			}
		}
		else
		{
			 System.out.print("\n\t\t\tThe Information is not Valid...Do you want to continue (Y/N) ");
			  char input=' ';  
			  input=utility.inputCharacter();
			  onlyTry++;
			  

			  if((input=='Y' || input=='y') && onlyTry<=3)
			  {
			   displayEachUserAccount();
			  }
			  else
			  {
			   System.out.println("\n\t\t\t\tYours Trying Limit is Exceed...So Program is Terminated...!");	  
			  }
			  System.exit(0);	
		}
		   
		
	}

	private boolean toCheckUserDetails(String name,String mobile) throws FileNotFoundException, IOException, ParseException 
	{
		 JSONParser parser=new JSONParser();
		 Object obj=parser.parse(new FileReader(userFile));
		 JSONObject object=(JSONObject)obj;
		 
		 JSONArray storeData=(JSONArray)object.get("User_Account");
		 JSONObject toCheck=null;
		 for(int i=0;i<storeData.size();i++)
		 {
		  toCheck=(JSONObject)storeData.get(i);	 
		  if(toCheck.get("User_Name").equals(name) && toCheck.get("User_MobileNo").equals(mobile))
		  {
		   return true;	  
		  }
		 }
		  return false;
	}

	private void displayUserByName() throws FileNotFoundException, IOException, ParseException 
	{
		 System.out.print("\n\t\t\t\tEnter Name of the User     : ");
		 String name = utility.inputString2();
		 System.out.print("\n\t\t\t\tEnter MobileNo of the User : ");
		 String mobile = utility.inputString2();
		 
		 boolean isFind=toCheckUserDetails(name,mobile);
			if(isFind)
			{
				  
			JSONParser parse = new JSONParser();
			Object obj = parse.parse(new FileReader(userFile));
			JSONObject outer = (JSONObject) obj;
			JSONArray jsonArray = (JSONArray) outer.get("User_Account");
			JSONObject compareObj;
			System.out.println();
			    System.out.println("\t\t\t                         U S E R-L I S T");
		 	    System.out.println("\t\t\t-------------------------------------------------------------------------------");
		 	    System.out.println("\t\t\tUser_Name    | User_Share  | Share_Ammount | User_Mobile_Number | Total_Ammount");
				 	    
				for(int i=0;i<jsonArray.size();i++) 
				{
				    compareObj=(JSONObject) jsonArray.get(i);
					String userName = (String) compareObj.get("User_Name");
					String userShare = Double.toString((double) compareObj.get("User_Share"));
					String shareAmmount = Double.toString((double)compareObj.get("Share_Ammount"));
					String userMobileNo = (String) compareObj.get("User_MobileNo");
					String total=Double.toString((double)compareObj.get("Ammount_Total"));
					if(userName.equals(name))
				       {
						System.out.printf("%32s %12s %15s %25s %10s ",userName,userShare,shareAmmount,userMobileNo,total);
				        System.out.println(); 
				       }	      
				}
			}
			else
			{
				 System.out.print("\n\t\t\tThe User Name is not Valid...Do you want to Continue (Y/N) ");
				  char input=' ';  
				  input=utility.inputCharacter();
				  onlyTry++;
				 
				  if((input=='Y' || input=='y') && onlyTry<=3)
				  {
					  displayUserByName();
				  }
				  else
				  {
				   System.out.println("\n\t\t\t\tYours Trying Limit is Exceed...So Program is Terminated...!");	  
				  }
				  System.exit(0);	
			}
			  
	}

}
