/******************************************************************************
 *  
 *  Purpose : Maintain Clinique Management System And Perform Many Operation like
 *            Add Doctor(),Add Patient(),Take Appointment(),Display(),Search().
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
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CliniqueManagementOperation {
	private JSONObject jsonDoctorObject = new JSONObject();
	private JSONArray jsonDoctorArray = new JSONArray();
	private JSONObject jsonPatientObject = new JSONObject();
	private JSONArray jsonPatientArray = new JSONArray();
	private JSONObject jsonAppointmentObject = new JSONObject();
	private JSONArray jsonAppointmentArray = new JSONArray();
	private String doctorFile = "/home/brideit/doctor.json";
	private String patientFile = "/home/brideit/patient.json";
	private String appointmentFile = "/home/brideit/appointment.json";
	private int count = 0;
	private Utility utility = new Utility();

	public void addDocotor() throws IOException, ParseException {
		FileReader fr = new FileReader(doctorFile);
		BufferedReader br = new BufferedReader(fr);

		if (br.readLine() == null) {
			addDoctorObject(jsonDoctorArray);
		} else {
			jsonDoctorArray = getCurrentDoctorObject();
			addDoctorObject(jsonDoctorArray);
		}

		br.close();
	}

	private JSONArray getCurrentDoctorObject() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(doctorFile));
		JSONObject temp = (JSONObject) obj;
		JSONArray jsonArray = (JSONArray) temp.get("Doctor_Data");
		return jsonArray;

	}

	private void addDoctorObject(JSONArray jsonDoctorArray) throws IOException {
		System.out.println("\n\t\t\t\t    D O C T O R-D E T A I L S");
		System.out.println("\t\t\t\t--------------------------------");
		System.out.print("\n\t\t\t\tEnter Doctor Name              : ");
		String doctorName = utility.inputString2();
		System.out.print("\n\t\t\t\tEnter Doctor ID                : ");
		String doctorID = utility.inputString2();
		System.out.print("\n\t\t\t\tEnter Doctor Specialization    : ");
		String doctorSpecialization = utility.inputString2();
		System.out.print("\n\t\t\t\tEnter Doctor Availability Time : ");
		String doctorAvailability = utility.inputString2();
		JSONObject temp = new JSONObject();
		temp.put("Doctor_Name", doctorName);
		temp.put("Doctor_Id", doctorID);
		temp.put("Doctor_Specialization", doctorSpecialization);
		temp.put("Doctor_Availability", doctorAvailability);
		jsonDoctorArray.add(temp);
		jsonDoctorObject.put("Doctor_Data", jsonDoctorArray);

		uploadOnDoctorFile(jsonDoctorObject);

	}

	private void uploadOnDoctorFile(JSONObject jsonDoctorObject) throws IOException {
		FileWriter fw = new FileWriter(doctorFile);
		fw.write(jsonDoctorObject.toString());
		fw.flush();
		fw.close();
	}

	public void addPatient() throws IOException, ParseException {
		FileReader fr = new FileReader(patientFile);
		BufferedReader br = new BufferedReader(fr);

		if (br.readLine() == null) {
			addPatientObject(jsonPatientArray);
		} else {
			jsonPatientArray = getCurrentPatientObject();
			addPatientObject(jsonPatientArray);
		}
		br.close();

	}

	private JSONArray getCurrentPatientObject() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(patientFile));
		JSONObject temp = (JSONObject) obj;
		JSONArray jsonArray = (JSONArray) temp.get("Patient_Data");
		return jsonArray;
	}

	private void addPatientObject(JSONArray jsonPatientArray) throws IOException {
		System.out.println("\n\t\t\t\t    P A T I E N T-D E T A I L S");
		System.out.println("\t\t\t\t---------------------------------");
		System.out.print("\n\t\t\t\tEnter Patient Name          : ");
		String patientName = utility.inputString2();
		System.out.print("\n\t\t\t\tEnter Patient ID            : ");
		String patientID = utility.inputString2();
		System.out.print("\n\t\t\t\tEnter Patient Mobile Number : ");
		String patientMobileNo = utility.inputString2();

		JSONObject temp = new JSONObject();
		temp.put("Patient_Name", patientName);
		temp.put("Patient_Id", patientID);
		temp.put("Patient_Mobile", patientMobileNo);
		jsonPatientArray.add(temp);
		jsonPatientObject.put("Patient_Data", jsonPatientArray);

		uploadOnPatientFile(jsonPatientObject);

	}

	private void uploadOnPatientFile(JSONObject jsonPatientObject) throws IOException {
		FileWriter fw = new FileWriter(patientFile);
		fw.write(jsonPatientObject.toString());
		fw.flush();
		fw.close();

	}

	public void takeAppointment() throws FileNotFoundException, IOException, ParseException {

		FileReader fr = new FileReader(appointmentFile);
		BufferedReader br = new BufferedReader(fr);

		if (br.readLine() == null) {
			addAppointmentObject(jsonAppointmentArray);
		} else {
			jsonAppointmentArray = getCurrentAppontmentObject();
			addAppointmentObject(jsonAppointmentArray);
		}
		br.close();

	}

	private JSONArray getCurrentAppontmentObject() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(appointmentFile));
		JSONObject temp = (JSONObject) obj;
		JSONArray jsonArray = (JSONArray) temp.get("Appointment_Data");
		return jsonArray;
	}

	private void addAppointmentObject(JSONArray jsonAppointmentArray)
			throws FileNotFoundException, IOException, ParseException {
		System.out.println();
		displayDoctor();

		System.out.println();
		System.out.print("\n\t\t\t\tEnter the Patient Name : ");
		String patientName = utility.inputString2();
		System.out.print("\n\t\t\t\tEnter the Doctor  Name : ");
		String doctorName = utility.inputString2();
		System.out.print("\n\t\t\t\tEnter the Availability Time Which You are to Want : ");
		String time = utility.inputString2();

		boolean isFindPatient = toCheckPatientDetails(patientName);
		boolean isFindDoctor = toCheckDoctorAvailable(doctorName, time);
		int maxLimit = toCheckDoctorAppointment(doctorName);
		if (isFindDoctor && isFindPatient && maxLimit != 0) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();
			String currentDate = simpleDateFormat.format(date);
			System.out.println("Date : " + currentDate);

			JSONObject temp = new JSONObject();
			temp.put("Doctor_Name", doctorName);
			temp.put("Doctor_Availability", time);
			temp.put("Patient_Name", patientName);
			temp.put("Appointment_Date", currentDate);

			jsonAppointmentArray.add(temp);
			jsonAppointmentObject.put("Appointment_Data", jsonAppointmentArray);

			uploadOnAppointmentFile(jsonAppointmentObject);

		} else {
			if (!isFindDoctor) {
				System.out.print("\n\t\t\t\tDoctor is not Available...Please Try Again(Y/N) ");
				char input = ' ';
				input = utility.inputCharacter();
				if (input == 'Y' || input == 'y') {
					takeAppointment();
				}
			} else if (!isFindPatient) {
				System.out
						.print("\n\t\t\t\tPatient is not Available...To Add Patient First then Take Appointment(Y/N) ");
				char input = ' ';
				input = utility.inputCharacter();
				if (input == 'Y' || input == 'y') {
					addPatient();
				}

			} else {
				System.out.print("\n\t\t\t\tDoctor is Already has 5 Appointment....To Check Another Doctor(Y/N) ");
				char input = ' ';
				input = utility.inputCharacter();
				if (input == 'Y' || input == 'y') {
					takeAppointment();
				}

			}
		}
	}

	private int toCheckDoctorAppointment(String doctorName) throws FileNotFoundException, IOException, ParseException {

		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(doctorFile));
		JSONObject object = (JSONObject) obj;

		JSONArray storeData = (JSONArray) object.get("Doctor_Data");
		JSONObject toCheck = null;
		for (int i = 0; i < storeData.size(); i++) {
			toCheck = (JSONObject) storeData.get(i);
			if (toCheck.get("Doctor_Name").equals(doctorName) && count < 5) {
				count++;
				System.out.println("Count : " + count);
				return count;
			}
		}
		count = 0;

		return count;
	}

	private void uploadOnAppointmentFile(JSONObject jsonAppointmentObject) throws IOException {
		FileWriter fw = new FileWriter(appointmentFile);
		fw.write(jsonAppointmentObject.toString());
		fw.flush();
		fw.close();

	}

	private boolean toCheckDoctorAvailable(String doctorName, String time)
			throws FileNotFoundException, IOException, ParseException {

		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(doctorFile));
		JSONObject object = (JSONObject) obj;

		JSONArray storeData = (JSONArray) object.get("Doctor_Data");
		JSONObject toCheck = null;
		for (int i = 0; i < storeData.size(); i++) {
			toCheck = (JSONObject) storeData.get(i);
			if (toCheck.get("Doctor_Name").equals(doctorName) && toCheck.get("Doctor_Availability").equals(time)) {
				return true;
			}
		}
		count = 0;
		return false;

	}

	public void search() throws FileNotFoundException, IOException, ParseException {

		System.out.print("\n\t\t\t\t       S E A R C H-D E T A I L S");
		System.out.println("\n\t\t\t\t     -----------------------------");
		System.out.println("\t\t\t\t          To Doctor  : Enter 1 ");
		System.out.println("\t\t\t\t          To Patient : Enter 2 ");
		System.out.print("\n\t\t\t       Enter the Choice Which You Want to Search : ");
		int choice = utility.inputInteger();

		switch (choice) {

		case 1:
			doctorDetails();
			break;
		case 2:
			patientDetails();
			break;
		default:
			System.out.println("Enter correct choice please...");
		}
	}

	private void patientDetails() throws FileNotFoundException, IOException, ParseException {
		System.out.println("\n\t\t\t\t        P A T I E N T-D E T A I L S");
		System.out.println("\t\t\t\t      -------------------------------");
		System.out.println("\t\t\t\t        By Name           : Enter 1");
		System.out.println("\t\t\t\t        By Id             : Enter 2");
		System.out.println("\t\t\t\t        By Mobile Number  : Enter 3");
		System.out.print("\n\t\t\t\tEnter the Choice Which You want to Serach : ");
		int choice = utility.inputInteger();
		String name = "", id = "", mobile = "", result = "";

		switch (choice) {

		case 1:
			System.out.print("\n\t\t\t\tEnter Name of the Patient     : ");
			name = utility.inputString2();
			result = name;
			break;
		case 2:
			System.out.print("\n\t\t\t\tEnter Id of the Patient       : ");
			id = utility.inputString2();
			result = id;
			break;
		case 3:
			System.out.print("\n\t\t\t\tEnter MobileNo of the Patient : ");
			mobile = utility.inputString2();
			result = mobile;
			break;
		default:
			System.out.println("\n\t\t\t\tInvalid Choice...Please Try Again!");
		}

		String patientName = "", patientId = "", patientMobileNo = "";
		boolean isFind = toCheckPatientDetails(result);

		if (isFind) {

			System.out.println();

			System.out.println("\t\t\t\t                 P A T I E N T-L I S T");
			System.out.println("\t\t\t\t----------------------------------------------------");
			System.out.println("\t\t\t\tPatient_Name | Patient_Id  | Patient_Mobile_Number");

			JSONParser parse = new JSONParser();
			Object obj = parse.parse(new FileReader(patientFile));
			JSONObject outer = (JSONObject) obj;
			JSONArray jArr = (JSONArray) outer.get("Patient_Data");
			JSONObject compareObj;
			for (int i = 0; i < jArr.size(); i++) {

				compareObj = (JSONObject) jArr.get(i);
				patientName = (String) compareObj.get("Patient_Name");
				patientId = (String) compareObj.get("Patient_Id");
				patientMobileNo = (String) compareObj.get("Patient_Mobile");

				switch (choice) {
				case 1:
					if (patientName.equals(name)) {
						System.out.printf("%40s %10s %20s ", patientName, patientId, patientMobileNo);
						System.out.println();
					}
					break;

				case 2:
					if (patientId.equals(id)) {
						System.out.printf("%40s %10s %20s", patientName, patientId, patientMobileNo);
						System.out.println();
					}

					break;

				case 3:
					if (patientMobileNo.equals(mobile)) {

						System.out.printf("%40s %10s %20s ", patientName, patientId, patientMobileNo);
						System.out.println();
					}

					break;
				default:
					System.out.println("Invalid Choice...!");

				}

			}

		} else {
			switch (choice) {
			case 1:
				if (!patientName.equals(name)) {
					System.out.print("\n\t\t\t\t   The Patient Name is not Valid...!");

				}
				break;

			case 2:
				if (!patientId.equals(id)) {
					System.out.print("\n\t\t\t\t  The Patient Id is not Valid...! ");
				}
				break;

			case 3:
				if (!patientMobileNo.equals(mobile)) {
					System.out.print("\n\t\t\t\t   The Patient Mobile Number is not Valid...! ");
				}
				break;

			default:
				System.out.println("Invalid Choice...Please Try Again!");
			}

		}

	}

	private boolean toCheckPatientDetails(String result) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(patientFile));
		JSONObject object = (JSONObject) obj;

		JSONArray storeData = (JSONArray) object.get("Patient_Data");
		JSONObject toCheck = null;
		for (int i = 0; i < storeData.size(); i++) {
			toCheck = (JSONObject) storeData.get(i);
			if (toCheck.get("Patient_Name").equals(result) || toCheck.get("Patient_Id").equals(result)
					|| toCheck.get("Patient_Mobile").equals(result)) {
				return true;
			}
		}
		return false;
	}

	private void doctorDetails() throws FileNotFoundException, IOException, ParseException {
		System.out.println("\n\t\t\t\t      D O C T O R-D E T A I L S");
		System.out.println("\t\t\t\t    -----------------------------");
		System.out.println("\t\t\t\t     By Name           : Enter 1");
		System.out.println("\t\t\t\t     By Id             : Enter 2");
		System.out.println("\t\t\t\t     By Specialization : Enter 3");
		System.out.println("\t\t\t\t     By Availability   : Enter 4");
		System.out.print("\n\t\t\t\tEnter the Choice Which You want to Serach : ");
		int choice = utility.inputInteger();
		String name = "", id = "", specialization = "", availability = "";
		String result = "";
		switch (choice) {
		case 1:
			System.out.print("\n\t\t\t\tEnter Name of the Doctor           : ");
			name = utility.inputString2();
			result = name;
			break;
		case 2:
			System.out.print("\n\t\t\t\tEnter Id of the Doctor             : ");
			id = utility.inputString2();
			result = id;
			break;
		case 3:
			System.out.print("\n\t\t\t\tEnter Specialization of the Doctor : ");
			specialization = utility.inputString2();
			result = specialization;
			break;
		case 4:
			System.out.print("\n\t\t\t\tEnter Availability of the Doctor   : ");
			availability = utility.inputString2();
			result = availability;
			break;

		default:
			System.out.print("\n\t\t\t\tInvalid Choice...!");
		}
		String doctorName = "", doctorId = "", doctorSpecialization = "", doctorAvailability = "";

		boolean isFind = toCheckDoctorDetails(result);

		if (isFind) {

			JSONParser parse = new JSONParser();
			Object obj = parse.parse(new FileReader(doctorFile));
			JSONObject outer = (JSONObject) obj;
			JSONArray jsonArray = (JSONArray) outer.get("Doctor_Data");
			JSONObject compareObj;
			System.out.println();
			System.out.println("\t\t\t\t                         D O C T O R -L I S T");
			System.out.println("\t\t\t\t----------------------------------------------------------------------");
			System.out.println("\t\t\t\tDoctor_Name    | Doctor_Id  | Doctor_Specialization | Doctor_Availability");

			for (int i = 0; i < jsonArray.size(); i++) {
				compareObj = (JSONObject) jsonArray.get(i);
				doctorName = (String) compareObj.get("Doctor_Name");
				doctorId = (String) compareObj.get("Doctor_Id");
				doctorSpecialization = (String) compareObj.get("Doctor_Specialization");
				doctorAvailability = (String) compareObj.get("Doctor_Availability");

				switch (choice) {
				case 1:
					if (doctorName.equals(name)) {
						System.out.printf("%46s %8s %20s %20s ", doctorName, doctorId, doctorSpecialization,
								doctorAvailability);
						System.out.println();
					}

					break;

				case 2:
					if (doctorId.equals(id)) {
						System.out.printf("%46s %8s %20s %20s ", doctorName, doctorId, doctorSpecialization,
								doctorAvailability);
						System.out.println();
					}

					break;

				case 3:
					if (doctorSpecialization.equals(specialization)) {

						System.out.printf("%46s %8s %20s %20s ", doctorName, doctorId, doctorSpecialization,
								doctorAvailability);
						System.out.println();
					}

					break;

				case 4:
					if (doctorAvailability.equals(availability)) {
						System.out.printf("%46s %8s %20s %20s ", doctorName, doctorId, doctorSpecialization,
								doctorAvailability);
						System.out.println();
					}

					break;

				default:
					System.out.println("Invalid Choice...Please Try Again!");

				}

			}
		} else {
			switch (choice) {
			case 1:
				if (!doctorName.equals(name)) {
					System.out.print("\n\t\t\t\t  The Doctor Name is not Valid...!");

				}
				break;

			case 2:
				if (!doctorId.equals(id)) {
					System.out.print("\n\t\t\t\t  The Doctor Id is not Valid...! ");
				}
				break;

			case 3:
				if (!doctorSpecialization.equals(specialization)) {
					System.out.print("\n\t\t\t\t  The Doctor Specialization is not Valid...! ");
				}
				break;

			case 4:
				if (!doctorAvailability.equals(availability)) {
					System.out.print("\n\t\t\t\t  The Doctor Availability is not Valid...! ");
				}
				break;

			default:
				System.out.println("Invalid Choice...Please Try Again!");
			}
		}

	}

	private boolean toCheckDoctorDetails(String result) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(doctorFile));
		JSONObject object = (JSONObject) obj;

		JSONArray storeData = (JSONArray) object.get("Doctor_Data");
		JSONObject toCheck = null;
		for (int i = 0; i < storeData.size(); i++) {
			toCheck = (JSONObject) storeData.get(i);
			if (toCheck.get("Doctor_Name").equals(result) || toCheck.get("Doctor_Id").equals(result)
					|| toCheck.get("Doctor_Specialization").equals(result)
					|| toCheck.get("Doctor_Availability").equals(result)) {
				return true;
			}
		}
		return false;
	}

	public void displayDoctor() throws FileNotFoundException, IOException, ParseException {
		JSONParser parse = new JSONParser();
		Object obj = parse.parse(new FileReader(doctorFile));
		JSONObject outer = (JSONObject) obj;
		JSONArray jsonArray = (JSONArray) outer.get("Doctor_Data");
		JSONObject compareObj;
		String doctorName = "", doctorId = "", doctorSpecialization = "", doctorAvailability = "";
		System.out.println();
		System.out.println("\t\t\t\t                          D O C T O R -L I S T ");
		System.out.println("\t\t\t\t-----------------------------------------------------------------------------");
		System.out.println("\t\t\t\tDisplay_Doctor_Name | Doctor_Id  | Doctor_Specialization | Doctor_Availability");

		for (int i = 0; i < jsonArray.size(); i++) {
			compareObj = (JSONObject) jsonArray.get(i);
			doctorName = (String) compareObj.get("Doctor_Name");
			doctorId = (String) compareObj.get("Doctor_Id");
			doctorSpecialization = (String) compareObj.get("Doctor_Specialization");
			doctorAvailability = (String) compareObj.get("Doctor_Availability");

			System.out.printf("  %45s %10s %20s %20s ", doctorName, doctorId, doctorSpecialization, doctorAvailability);
			System.out.println();
		}
	}

	public void displayPatient() throws FileNotFoundException, IOException, ParseException {
		JSONParser parse = new JSONParser();
		Object obj = parse.parse(new FileReader(patientFile));
		JSONObject outer = (JSONObject) obj;
		JSONArray jsonArray = (JSONArray) outer.get("Patient_Data");
		JSONObject compareObj;
		String patientName = "", patientId = "", patientMobileNo = "";
		System.out.println();
		System.out.println("\t\t\t\t               P A T I E N T -L I S T");
		System.out.println("\t\t\t\t--------------------------------------------------");
		System.out.println("\t\t\t\tPatient_Name | Patient_Id  | Patient_Mobile_Number");

		for (int i = 0; i < jsonArray.size(); i++) {
			compareObj = (JSONObject) jsonArray.get(i);
			patientName = (String) compareObj.get("Patient_Name");
			patientId = (String) compareObj.get("Patient_Id");
			patientMobileNo = (String) compareObj.get("Patient_Mobile");

			System.out.printf("%40s %10s %20s ", patientName, patientId, patientMobileNo);
			System.out.println();
		}

	}
}