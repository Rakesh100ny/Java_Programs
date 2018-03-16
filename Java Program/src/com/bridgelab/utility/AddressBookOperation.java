package com.bridgelab.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AddressBookOperation
{
 UserInformation information=new UserInformation();
 private JSONObject jsonObject=new JSONObject();
 private JSONArray jsonArray=new JSONArray();
 private String file="/home/brideit/addressbook.json";

 public void add() throws ParseException, IOException 
 {
  JSONParser parser=new JSONParser();
  Object obj=parser.parse(new FileReader(file));
  JSONObject temp=(JSONObject)obj;
  
  if(temp==null)
  {
   addObject(jsonArray);	  
  }
  else
  {
   jsonArray=getCurrentObject();
   addObject(jsonArray);
  }
 }

 private JSONArray getCurrentObject() throws FileNotFoundException, IOException, ParseException 
 {
  JSONParser parser=new JSONParser();
  Object obj=parser.parse(new FileReader(file));
  JSONObject temp=(JSONObject)obj;
  JSONArray jsonArray=(JSONArray)temp.get("Book_Data");
  return jsonArray;
 }

private void addObject(JSONArray jsonArray) throws IOException
 {  
	 Utility utility=new Utility();
	 System.out.println("\n\t\t\t  U S E R-D E T A I L S");
	  System.out.println("\t\t\t------------------------");
	  System.out.print("\t\t\tEnter the First Name    : ");
	  String firstName=utility.inputString();
	  information.setFristName(firstName);
	  System.out.print("\t\t\tEnter the Last Name     : ");
	  String lastName=utility.inputString();
	  information.setLastname(lastName);
	  System.out.print("\t\t\tEnter the Address     : ");
	  String address=utility.inputString();
	  information.setAddress(address);
	  System.out.print("\t\t\tEnter the City     : ");
	  String city=utility.inputString();
	  information.setCity(city);
	  System.out.print("\t\t\tEnter the State     : ");
	  String state=utility.inputString();
	  information.setState(state);
	  System.out.print("\t\t\tEnter the Zip-Code     : ");
	  String zip=utility.inputString();
	  information.setZipCode(zip);
	  System.out.print("\t\t\tEnter the Mobile No     : ");
	  String mobileNo=utility.inputString();
	  information.setPhoneNum(mobileNo);

	  JSONObject temp=new JSONObject();
	  temp.put("First_Name"  , information.getFristName());
	  temp.put("Last_Name"   , information.getLastname());
	  temp.put("User_Address", information.getAddress());
	  temp.put("User_City"   , information.getCity());
	  temp.put("User_State"  , information.getState());
	  temp.put("User_ZipCode", information.getZipCode());
	  temp.put("User_Mobile" , information.getPhoneNum());
      
	  jsonArray.add(temp);
	  jsonObject.put("Book_Data", jsonArray);
	  
	  uploadOnFile(jsonObject);
	  
	  
 }


private void uploadOnFile(JSONObject jsonObject) throws IOException
{
	FileWriter fw = new FileWriter(file);
	fw.write(jsonObject.toString());
    fw.flush();	
}

public void edit() 
{
 Utility utility=new Utility();	
 System.out.println("Enter the Name which you are want to edit Details : ");
 String name=utility.inputString2();
 
 boolean isFind=isfindDetails(name);
 
 if(isFind)
 {
	 
 }
 else
 {
   System.out.println("\n\t\t\tThe Information is not Valid...Do are you want to continue (Y/N) ");
	char input=' ';  
   do
	 {
		edit();
		 System.out.print("\n\t\t\t\tDo you Want to continue (Y/N) : ");
		  input=utility.inputCharacter();
			 
	 }while(input=='Y' || input=='y');
	  
 }
}

	public void delete() {
		// TODO Auto-generated method stub
		
	}

	public void sort() {
		// TODO Auto-generated method stub
		
	}

}
