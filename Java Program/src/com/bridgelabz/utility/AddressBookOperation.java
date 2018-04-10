/******************************************************************************
 *  
 *  Purpose : Maintain Address Book And Manipulate Data in the Address Book
 *            example Edit(),Update(),Display().
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

public class AddressBookOperation {
	private JSONObject jsonObject = new JSONObject();
	private JSONArray jsonArray = new JSONArray();
	private String file = "/home/brideit/addressbook.json";
	private int onlyTry = 0;
	private Utility utility = new Utility();

	public void add() throws ParseException, IOException {
		FileReader fr = new FileReader("/home/brideit/addressbook.json");
		BufferedReader br = new BufferedReader(fr);

		if (br.readLine() == null) {
			addObject(jsonArray);
		} else {
			jsonArray = getCurrentObject();
			addObject(jsonArray);
		}
		br.close();
	}

	private JSONArray getCurrentObject() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(file));
		JSONObject temp = (JSONObject) obj;
		JSONArray jsonArray = (JSONArray) temp.get("Book_Data");
		return jsonArray;
	}

	private void addObject(JSONArray jsonArray) throws IOException {
		System.out.println("\n\t\t\t\t    U S E R-D E T A I L S");
		System.out.println("\t\t\t\t----------------------------");
		System.out.print("\n\t\t\t\tEnter the First Name : ");
		String firstName = utility.inputString2();
		System.out.print("\n\t\t\t\tEnter the Last Name  : ");
		String lastName = utility.inputString2();
		System.out.print("\n\t\t\t\tEnter the Address    : ");
		String address = utility.inputString2();
		System.out.print("\n\t\t\t\tEnter the City       : ");
		String city = utility.inputString2();
		System.out.print("\n\t\t\t\tEnter the State      : ");
		String state = utility.inputString2();
		System.out.print("\n\t\t\t\tEnter the Zip-Code   : ");
		String zip = utility.inputString2();
		System.out.print("\n\t\t\t\tEnter the Mobile No  : ");
		String mobileNo = utility.inputString2();

		JSONObject temp = new JSONObject();
		temp.put("First_Name", firstName);
		temp.put("Last_Name", lastName);
		temp.put("User_Address", address);
		temp.put("User_City", city);
		temp.put("User_State", state);
		temp.put("User_ZipCode", zip);
		temp.put("User_Mobile", mobileNo);

		jsonArray.add(temp);
		jsonObject.put("Book_Data", jsonArray);

		uploadOnFile(jsonObject);

	}

	private void uploadOnFile(JSONObject jsonObject) throws IOException {
		FileWriter fw = new FileWriter(file);
		fw.write(jsonObject.toString());
		fw.flush();
		fw.close();
	}

	public void edit() throws FileNotFoundException, IOException, ParseException {
		displayAddressBook();
		System.out.println("\n\t\t\t\tEnter the Full-Name Which You are want to edit Details...!");
		System.out.print("\t\t\t\tEnter the First Name : ");
		String firstName = utility.inputString2();
		System.out.print("\t\t\t\tEnter the Last Name  : ");
		String lastName = utility.inputString2();

		boolean isFind = isfindDetails(firstName, lastName);

		if (isFind) {
			System.out.println("\n\t\t\t\t   E D I T-D E T A I L S");
			System.out.println("\t\t\t\t--------------------------------");
			System.out.print("\n\t\t\t\tEdit First  Name    : Enter 1");
			System.out.print("\n\t\t\t\tEdit Last   Name    : Enter 2");
			System.out.print("\n\t\t\t\tEdit User   Address : Enter 3");
			System.out.print("\n\t\t\t\tEdit User   City    : Enter 4");
			System.out.print("\n\t\t\t\tEdit User   State   : Enter 5");
			System.out.print("\n\t\t\t\tEdit Zip    Number  : Enter 6");
			System.out.print("\n\t\t\t\tEdit Mobile Number  : Enter 7");
			System.out.println();
			System.out.print("\n\t\t\t\tEnter Key Which You Want to Edit : ");
			int key = utility.inputInteger();

			String newFirstName = "", newLastName = "", newAddress = "", newCity = "", newState = "", newZip = "",
					newMobileno = "";
			String valueToReplcae = "", newValue = "";
			switch (key) {
			case 1:
				System.out.print("\n\t\t\t\tEnter New First Name     : ");
				newFirstName = utility.inputString2();
				newValue = newFirstName;
				valueToReplcae = "First_Name";
				break;

			case 2:
				System.out.print("\n\t\t\t\tEnter New Last Name      : ");
				newLastName = utility.inputString2();
				newValue = newLastName;
				valueToReplcae = "Last_Name";
				break;

			case 3:
				System.out.print("\n\t\t\t\tEnter New User Address   : ");
				newAddress = utility.inputString2();
				newValue = newAddress;
				valueToReplcae = "User_Address";
				break;

			case 4:
				System.out.print("\n\t\t\t\tEnter New User City      : ");
				newCity = utility.inputString2();
				newValue = newCity;
				valueToReplcae = "User_City";
				break;

			case 5:
				System.out.print("\n\t\t\t\tEnter New User State     : ");
				newState = utility.inputString2();
				newValue = newState;
				valueToReplcae = "User_State";
				break;

			case 6:
				System.out.print("\n\t\t\t\tEnter New Zip Code       : ");
				newZip = utility.inputString2();
				newValue = newZip;
				valueToReplcae = "User_ZipCode";
				break;

			case 7:
				System.out.print("\n\t\t\t\tEnter New User MobileNo  : ");
				newMobileno = utility.inputString2();
				newValue = newMobileno;
				valueToReplcae = "User_Mobile";
				break;

			default:
				System.out.print("\n\t\t\t\tInvalid Key ...Please Enter Valid Key");

			}

			jsonArray = getCurrentObject();
			JSONObject toCheck = null;

			for (int i = 0; i < jsonArray.size(); i++) {
				toCheck = (JSONObject) jsonArray.get(i);
				if (toCheck.get("First_Name").equals(firstName) && toCheck.get("Last_Name").equals(lastName)) {
					toCheck.put(valueToReplcae, newValue);
					System.out.println("\n\t\t\t\tUpdate is successfully...!");
				}
			}

			jsonObject.put("Book_Data", jsonArray);
			uploadOnFile(jsonObject);
		} else {
			System.out.print("\n\t\t\tThe Information is not Valid...Do you want to continue (Y/N) ");
			char input = ' ';
			input = utility.inputCharacter();
			onlyTry++;

			if ((input == 'Y' || input == 'y') && onlyTry <= 3) {
				edit();
			} else {
				System.out.println("\n\t\t\t\tYours Trying Limit is Exceed...So Program is Terminated...!");
			}
			System.exit(0);
		}
	}

	private void displayAddressBook() throws FileNotFoundException, IOException, ParseException 
	{
		JSONParser parse = new JSONParser();
		Object obj = parse.parse(new FileReader(file));
		JSONObject outer = (JSONObject) obj;
		JSONArray jsonArray = (JSONArray) outer.get("Book_Data");
		JSONObject compareObj;
		String firstName = "", lastName = "", address = "", city = "", state = "", zip = "", mobileNo = "";
		System.out.println();
		System.out.println("\t\t\t\t                          A D D R E S S -L I S T ");
		System.out.println("\t\t\t\t--------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\tDisplay_First_Name | Last_Name  | User_Address | User_City | User_State | User_Zip | User_MobileNo");

		for (int i = 0; i < jsonArray.size(); i++) {
			compareObj = (JSONObject) jsonArray.get(i);
			firstName = (String) compareObj.get("First_Name");
			lastName = (String) compareObj.get("Last_Name");
			address = (String) compareObj.get("User_Address");
			city = (String) compareObj.get("User_City");
			state = (String) compareObj.get("User_State");
			zip = (String) compareObj.get("User_ZipCode");
			mobileNo = (String) compareObj.get("User_Mobile");

			System.out.printf("  %40s %18s %13s %14s %9s %12s %15s", firstName, lastName, address, city, state, zip, mobileNo);
			System.out.println();
		}
	}


	private boolean isfindDetails(String firstName, String lastName)
			throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(file));
		JSONObject object = (JSONObject) obj;

		JSONArray storeData = (JSONArray) object.get("Book_Data");
		JSONObject toCheck = null;
		for (int i = 0; i < storeData.size(); i++) {
			toCheck = (JSONObject) storeData.get(i);
			if (toCheck.get("First_Name").equals(firstName) && toCheck.get("Last_Name").equals(lastName)) {
				return true;
			}
		}

		return false;
	}

	public void delete() throws FileNotFoundException, IOException, ParseException {
		displayAddressBook();
		System.out.print("\n\t\t\t\tEnter the Full-Name Which You are want to edit Details...!");
		System.out.print("\n\t\t\t\tEnter First Name Who's Record You Want to Delete : ");
		String firstName = utility.inputString2();
		System.out.print("\n\t\t\t\tEnter Last Name  Who's Record You Want to Delete : ");
		String lastName = utility.inputString2();
		boolean result = isfindDetails(firstName, lastName);
		if (result) {
			delete(firstName, lastName);
			System.out.println("\n\t\t\t\tUpdate is Successfully...!");
		} else {
			System.out.print("\n\t\t\tThe Information is not Valid...Do you want to continue (Y/N) ");
			char input = ' ';
			input = utility.inputCharacter();
			onlyTry++;

			if ((input == 'Y' || input == 'y') && onlyTry <= 3) {
				delete();
			} else {
				System.out.println("\n\t\t\t\tYours Trying Limit is Exceed...So Program is Terminated...!");
			}
			System.exit(0);
		}
	}

	private void delete(String firstName, String lastName) throws IOException, ParseException {
		JSONParser parse = new JSONParser();
		Object obj = parse.parse(new FileReader(file));
		JSONObject object = (JSONObject) obj;
		JSONArray storeData = (JSONArray) object.get("Book_Data");
		JSONObject toCheck = null;
		for (int i = 0; i < storeData.size(); i++) {
			toCheck = (JSONObject) storeData.get(i);
			if ((toCheck.get("First_Name").equals(firstName)) && (toCheck.get("Last_Name").equals(lastName))) {
				storeData.remove(toCheck);
				jsonObject.put("Book_Data", storeData);
				// break;
			}
		}
		uploadOnFile(jsonObject);
	}

	public void sort() throws FileNotFoundException, IOException, ParseException {
		System.out.println("\n\t\t\t\t         S O R T-M E N U");
		System.out.println("\t\t\t\t------------------------------");
		System.out.print("\n\t\t\t\tSort By Name     : Enter 1");
		System.out.print("\n\t\t\t\tSort By Zip      : Enter 2");
		System.out.println();
		System.out.print("\n\t\t\t\tEnter the Choice : ");
		int choice = utility.inputInteger();

		switch (choice) {
		case 1:
			sortByName();
			System.out.println("\n\t\t\t\tSuccessfully Sort By Name !");
			break;
		case 2:
			sortByZip();
			System.out.println("\n\t\t\t\tSuccessfully Sort By Zip  !");
			break;
		default:
			System.out.println("Invalid Choice...Please Enter the Correct Choice !");
		}
	}

	private void sortByZip() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(file));
		JSONObject object = (JSONObject) obj;
		JSONArray storeData = (JSONArray) object.get("Book_Data");
		JSONObject toCheck = null;
		String arr[] = new String[storeData.size()];
		for (int i = 0; i < storeData.size(); i++) {
			toCheck = (JSONObject) storeData.get(i);
			arr[i] = (String) toCheck.get("User_ZipCode");
		}
		System.out.println("\n\t\t\t\tBefore Apply Sorting : ");
		System.out.println("\n\t\t\t\t[ ");
		for (String x : arr) {
			System.out.println("\t\t\t\t   " + x);
		}
		System.out.println("\t\t\t\t]");

		System.out.println();

		arr = utility.bubbleSort(arr);

		System.out.println("\n\t\t\t\tAfter Apply Sorting : ");
		System.out.println("\n\t\t\t\t[ ");
		System.out.println("\t\t\t\t                                            D I S P L A Y-B Y-Z I P C O D E");
		System.out.println(
				"\t\t\t\t------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"\t\t\t\tFirst_Name | Last_Name  |   User_Mobile   |     User_Address     | User_ZipCode |  User_City  |   User_State ");

		for (int i = 0; i < arr.length; i++) {
			String zip = arr[i];
			JSONParser parser2 = new JSONParser();
			Object obj2 = parser2.parse(new FileReader(file));
			JSONObject object2 = (JSONObject) obj2;
			JSONArray storeData2 = (JSONArray) object2.get("Book_Data");
			JSONObject toCheck2 = null;
			for (int p = 0; p < storeData2.size(); p++) {
				toCheck2 = (JSONObject) storeData2.get(p);
				String zipCode = toCheck2.get("User_ZipCode").toString();
				if (zip.equals(zipCode)) {

					String firstName = (String) toCheck2.get("First_Name");
					String lastName = (String) toCheck2.get("Last_Name");
					String userMobileNo = (String) toCheck2.get("User_Mobile");
					String userAddress = (String) toCheck2.get("User_Address");
					String userCity = (String) toCheck2.get("User_City");
					String userState = (String) toCheck2.get("User_State");

					System.out.printf("%40s  %10s  %16s  %14s  %19s  %15s  %11s", firstName, lastName, userMobileNo,
							userAddress, zipCode, userCity, userState);
					System.out.println();
				}
			}

		}
		System.out.println("\t\t\t\t]");

	}

	private void sortByName() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(file));
		JSONObject object = (JSONObject) obj;
		JSONArray storeData = (JSONArray) object.get("Book_Data");
		JSONObject toCheck = null;
		String arr[] = new String[storeData.size()];

		for (int i = 0; i < storeData.size(); i++) {
			toCheck = (JSONObject) storeData.get(i);
			arr[i] = (String) toCheck.get("First_Name");

		}
		System.out.println("\n\t\t\t\tBefore Apply Sorting : ");
		System.out.println("\n\t\t\t\t[ ");
		for (String x : arr) {
			System.out.println("\t\t\t\t   " + x);
		}
		System.out.println("\t\t\t\t]");

		System.out.println();

		arr = utility.bubbleSort(arr);

		System.out.println("\n\t\t\t\tAfter Apply Sorting : ");
		System.out.println("\n\t\t\t\t[ ");
		System.out.println("\t\t\t\t                                            D I S P L A Y-B Y-N A M E");
		System.out.println(
				"\t\t\t\t------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"\t\t\t\tFirst_Name | Last_Name  |   User_Mobile   |     User_Address     | User_ZipCode |  User_City  |   User_State ");

		for (int i = 0; i < arr.length; i++) {
			String name = arr[i];
			JSONParser parser2 = new JSONParser();
			Object obj2 = parser2.parse(new FileReader(file));
			JSONObject object2 = (JSONObject) obj2;
			JSONArray storeData2 = (JSONArray) object2.get("Book_Data");
			JSONObject toCheck2 = null;
			for (int p = 0; p < storeData2.size(); p++) {
				toCheck2 = (JSONObject) storeData2.get(p);
				String userName = toCheck2.get("First_Name").toString();
				if (name.equals(userName)) {

					String lastName = (String) toCheck2.get("Last_Name");
					String userMobileNo = (String) toCheck2.get("User_Mobile");
					String userAddress = (String) toCheck2.get("User_Address");
					String userZip = (String) toCheck2.get("User_ZipCode");
					String userCity = (String) toCheck2.get("User_City");
					String userState = (String) toCheck2.get("User_State");

					System.out.printf("%40s  %10s  %16s  %14s  %19s  %15s  %11s", userName, lastName, userMobileNo,
							userAddress, userZip, userCity, userState);
					System.out.println();
				}
			}

		}
		System.out.println("\t\t\t\t]");

	}
}
