/******************************************************************************
 *  
 *  Purpose : Maintain Company Share And Perform Many Operation like
 *            Add CompanyShare(),Remove CompanyShare().
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CompanyShareMaintain {
	private JSONObject jsonShareObject = new JSONObject();
	private JSONArray jsonShareArray = new JSONArray();
	UnorderList list1 = new UnorderList();
	UnorderList list2 = new UnorderList();
	UnorderList list3 = new UnorderList();
	UnorderList list4 = new UnorderList();

	private String shareFile = "/home/brideit/share.json";
	Utility utility = new Utility();
	CompanyShareDetails details = new CompanyShareDetails();

	public void addShare() throws IOException, ParseException {
		FileReader fr = new FileReader(shareFile);
		BufferedReader br = new BufferedReader(fr);

		if (br.readLine() == null) {
			details = addShareObject(jsonShareArray);
			list1.append(details.getCompanyName().toString());
			list2.append(details.getCompanyShare().toString());
			list3.append(details.getShareAmmount());
			list4.append(details.getNoOfShare());
			
			uploadOnShareFile(list1, list2, list3, list4);

		} else {
			jsonShareArray = getCurrentArrayObject();
			details = addShareObject(jsonShareArray);

			boolean isCompanyExists = isCompanyExists(details.getCompanyName(), details.getCompanyShare());

			if (isCompanyExists == false) {
				list1.append(details.getCompanyName().toString());
				list2.append(details.getCompanyShare().toString());
				list3.append(details.getShareAmmount());
				list4.append(details.getNoOfShare());

				uploadOnShareFile(list1, list2, list3, list4);

			} else {
				System.out
						.print("\n\t\t\t  User Already Registered in the Databases...Canot create Duplicate Acocunt ");
			}

		}
		br.close();
	}

	private boolean isCompanyExists(String companyName, String companyShare)
			throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(shareFile));
		JSONObject object = (JSONObject) obj;
		JSONArray storeData = (JSONArray) object.get("Share_Info");
		JSONObject toCheck = null;
		for (int i = 0; i < storeData.size(); i++) {
			toCheck = (JSONObject) storeData.get(i);
			if (toCheck.get("Company_Name").toString().equals(companyName)
					&& toCheck.get("Company_Share").toString().equals(companyShare)) {
				return true;
			}

		}
		return false;
	}

	private void uploadOnShareFile(UnorderList list1, UnorderList list2, UnorderList list3, UnorderList list4)
			throws IOException {
		int length = list1.size();

		for (int i = 0; i < length; i++) {

			JSONObject temp = new JSONObject();
			temp.put("Company_Name", list1.remove(i));
			temp.put("Company_Share", list2.remove(i));
			temp.put("Share_Ammount", list3.remove(i));
			temp.put("Number_Of_Share", list4.remove(i));

			jsonShareArray.add(temp);
		}

		jsonShareObject.put("Share_Info", jsonShareArray);

		uploadOnShare(jsonShareObject);
	}

	private void uploadOnShare(JSONObject jsonShareObject) throws IOException {
		FileWriter fw = new FileWriter(shareFile);
		fw.write(jsonShareObject.toString());
		fw.flush();
		fw.close();
	}

	private JSONArray getCurrentArrayObject() throws FileNotFoundException, IOException, ParseException {

		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(shareFile));
		JSONObject temp = (JSONObject) obj;
		JSONArray jsonArray = (JSONArray) temp.get("Share_Info");
		return jsonArray;
	}

	private CompanyShareDetails addShareObject(JSONArray jsonShareArray) {

		System.out.println("\n\t\t\t\t  C O M P A N Y-D E T A I L S");
		System.out.println("\t\t\t\t  ----------------------------");
		System.out.print("\n\t\t\t\tEnter the Company Name  : ");
		String companyName = utility.inputString2();
		details.setCompanyName(companyName);
		System.out.print("\n\t\t\t\tEnter the Comapny Share : ");
		String companyShare = utility.inputString2();
		details.setCompanyShare(companyShare);
		System.out.print("\n\t\t\t\tEnter the Amount of Each Share : ");
		int shareAmmount = utility.inputInteger();
		details.setShareAmmount(shareAmmount);
		System.out.print("\n\t\t\t\tEnter the Number of Shae : ");
		int shareCount = utility.inputInteger();
		details.setNoOfShare(shareCount);

		return details;

	}

	public void RemoveShare() throws FileNotFoundException, IOException, ParseException {
		System.out.println("\n\t\t\t\t  C O M P A N Y-D E T A I L S");
		System.out.println("\t\t\t\t  ----------------------------");
		System.out.print("\n\t\t\t\tEnter the Company Name  : ");
		String companyName = utility.inputString2();
		System.out.print("\n\t\t\t\tEnter the Comapny Share : ");
		String companyShare = utility.inputString2();
		FileReader fr=new FileReader(shareFile);
		BufferedReader br=new BufferedReader(fr);
		
		if(br.readLine()!=null)
		{
		 boolean isCompanyExists = isCompanyExists(companyName, companyShare);
         System.out.println("CompanyExists : "+isCompanyExists);

         if(isCompanyExists)
         {
            	System.out.println("List1 : "+list1);
    			System.out.println("List2 : "+list2);
    			System.out.println("List3 : "+list3);
    			System.out.println("List4 : "+list4);
    		    System.out.println();
		
    		 JSONParser parser = new JSONParser();
			 Object obj = parser.parse(new FileReader(shareFile));
			 JSONObject object = (JSONObject) obj;
			 JSONArray storeData = (JSONArray) object.get("Share_Info");
			 JSONObject toCheck = null;
			 for (int i = 0; i < storeData.size(); i++) {
				toCheck = (JSONObject) storeData.get(i);

				list1.append(toCheck.get("Company_Name"));
				list2.append(toCheck.get("Company_Share"));
				list3.append(toCheck.get("Share_Ammount"));
				list4.append(toCheck.get("Number_Of_Share"));
			}
			 System.out.println();
			System.out.println("List1 : "+list1);
			System.out.println("List2 : "+list2);
			System.out.println("List3 : "+list3);
			System.out.println("List4 : "+list4);
		

			if (list1.search(companyName) && list2.search(companyShare)) {
				/*System.out.println("CompanyName  : "+list1.search(companyName));
				System.out.println("ComapnyShare : "+list2.search(companyShare));
				*/
				list1.remove2(companyName);
				list2.remove2(companyShare);
				list3.remove2(toCheck.get("Share_Ammount"));
				list4.remove2(toCheck.get("Number_Of_Share"));
			}
			System.out.println();
			System.out.println("List1 : "+list1);
			System.out.println("List2 : "+list2);
			System.out.println("List3 : "+list3);
			System.out.println("List4 : "+list4);

			uploadOnShareFile(list1, list2, list3, list4);

            }
      	  else
		  {
		   System.out.print("\n\t\t\tThe Company Name is not Valid...Do you want to Continue (Y/N) ");
		   char input = ' ';
		   input = utility.inputCharacter();
           if ((input == 'Y' || input == 'y')) 
           {
			RemoveShare();
		   }
          }
	
			
		  }
		  else
		  {
			System.out.print("\n\t\t\tFile Is Empty So Do you want to Add Company in the File (Y/N) ");	   
			   char input = ' ';
			   input = utility.inputCharacter();
	           if ((input == 'Y' || input == 'y')) 
	           {
				addShare();
			   }

		  }	 
		br.close();
		
		
		}
		  
     

}
