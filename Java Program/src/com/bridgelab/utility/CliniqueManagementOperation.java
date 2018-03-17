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

public class CliniqueManagementOperation
{
	 private JSONObject jsonDoctorObject=new JSONObject();
	 private JSONArray jsonDoctorArray=new JSONArray();
	 private JSONObject jsonPatientObject=new JSONObject();
	 private JSONArray jsonPatientArray=new JSONArray();
	 private JSONObject jsonAppointmentObject=new JSONObject();
	 private JSONArray jsonAppointmentArray=new JSONArray();
	 private String doctorFile="/home/brideit/doctor.json";
	 private String patientFile="/home/brideit/patient.json";
	 private String appointmentFile="/home/brideit/appointment.json";
	 private  int count=0;
	 private Utility utility=new Utility();

	public void addDocotor() throws IOException, ParseException
	{
		  FileReader fr=new FileReader(doctorFile);
		  BufferedReader br=new BufferedReader(fr);
		  
		  if(br.readLine()==null)
		  { 
		   addDoctorObject(jsonDoctorArray);	  
		  }
		  else
		  {
		   jsonDoctorArray=getCurrentDoctorObject();
		   addDoctorObject(jsonDoctorArray);
		  }

		
	}

	private JSONArray getCurrentDoctorObject() throws FileNotFoundException, IOException, ParseException
	{
		JSONParser parser=new JSONParser();
		  Object obj=parser.parse(new FileReader(doctorFile));
		  JSONObject temp=(JSONObject)obj;
		  JSONArray jsonArray=(JSONArray)temp.get("Doctor_Data");
		  return jsonArray;
		 
	}

	private void addDoctorObject(JSONArray jsonDoctorArray) throws IOException
	{
		 System.out.println("\n\t\t\t\t    D O C T O R-D E T A I L S");
		  System.out.println("\t\t\t\t--------------------------------");
		  System.out.print("\n\t\t\t\tEnter Doctor Name              : ");
		  String doctorName=utility.inputString2();
		  System.out.print("\n\t\t\t\tEnter Doctor ID                : ");
		  int doctorID=utility.inputInteger();
		  System.out.print("\n\t\t\t\tEnter Doctor Specialization    : ");
		  String doctorSpecialization=utility.inputString2();
		  System.out.print("\n\t\t\t\tEnter Doctor Availability Time : ");
		  String doctorAvailability=utility.inputString2();
		  JSONObject temp=new JSONObject();
		  temp.put("Doctor_Name",doctorName);
		  temp.put("Doctor_Id"  ,doctorID);
		  temp.put("Doctor_Specialization", doctorSpecialization);
		  temp.put("Doctor_Availability", doctorAvailability);
		  jsonDoctorArray.add(temp);
		  jsonDoctorObject.put("Doctor_Data", jsonDoctorArray);
		  
		  uploadOnDoctorFile(jsonDoctorObject);
		  
	 }

	private void uploadOnDoctorFile(JSONObject jsonDoctorObject) throws IOException
	{
		FileWriter fw = new FileWriter(doctorFile);
		fw.write(jsonDoctorObject.toString());
	    fw.flush();	
		
	}

	public void addPatient() throws IOException, ParseException 
	{
		  FileReader fr=new FileReader(patientFile);
		  BufferedReader br=new BufferedReader(fr);
		  
		  if(br.readLine()==null)
		  { 
		   addPatientObject(jsonPatientArray);	  
		  }
		  else
		  {
		   jsonPatientArray=getCurrentPatientObject();
		   addPatientObject(jsonPatientArray);
		  }

	
	}

	private JSONArray getCurrentPatientObject() throws FileNotFoundException, IOException, ParseException 
	{
		JSONParser parser=new JSONParser();
		  Object obj=parser.parse(new FileReader(patientFile));
		  JSONObject temp=(JSONObject)obj;
		  JSONArray jsonArray=(JSONArray)temp.get("Patient_Data");
		  return jsonArray;
		 }

	private void addPatientObject(JSONArray jsonDoctorArray) throws IOException
	{
		 System.out.println("\n\t\t\t\t    P A T I E N T-D E T A I L S");
		  System.out.println("\t\t\t\t---------------------------------");
		  System.out.print("\n\t\t\t\tEnter Patient Name          : ");
		  String patientName=utility.inputString2();
		  System.out.print("\n\t\t\t\tEnter Patient ID            : ");
		  int patientID=utility.inputInteger();
		  System.out.print("\n\t\t\t\tEnter Patient Mobile Number : ");
		  String patientMobileNo=utility.inputString2();

		  JSONObject temp=new JSONObject();
		  temp.put("Patient_Name",patientName);
		  temp.put("Patient_Id"  ,patientID);
		  temp.put("Patient_Mobile", patientMobileNo);
		  jsonPatientArray.add(temp);
		  jsonPatientObject.put("Patient_Data", jsonPatientArray);
		  
		  uploadOnPatientFile(jsonPatientObject);
		
	}

	private void uploadOnPatientFile(JSONObject jsonPatientObject) throws IOException 
	{
		FileWriter fw = new FileWriter(patientFile);
		fw.write(jsonPatientObject.toString());
	    fw.flush();	
		
	}

	public void takeAppointment() 
	{
		// TODO Auto-generated method stub
		
	}

	public void search() {
		// TODO Auto-generated method stub
		
	}

}
