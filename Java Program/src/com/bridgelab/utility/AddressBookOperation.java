/******************************************************************************
 *  
 *  Purpose : Maintain Address Book And Manipulate Data in the Address Book
 *            example Edit(),Update(),Display().
 *  @author   RakeshSoni
 *  @version  1.0
 *  @since    05-03-2018 
 *    
 ******************************************************************************/

package com.bridgelab.utility;

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
		for (String x : arr) {
			System.out.println("\t\t\t\t   " + x);
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
		for (String x : arr) {
			System.out.println("\t\t\t\t   " + x);
		}
		System.out.println("\t\t\t\t]");

	}

}
