package com.bridgelabz.oop.cliniqueUsingOOP;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.utility.Utility;

public class CliniqueManager implements ManagerInterface 
{ 
	ObjectMapper mapper = new ObjectMapper();
	String doctorFile = "/home/brideit/files/Clinique/doctor.json";
	String patientFile = "/home/brideit/files/Clinique/patient.json";
	String appointmentFile = "/home/brideit/files/Clinique/appointment.json";
    ArrayList<Doctor> doctorList=new ArrayList<Doctor>();
    ArrayList<Patient> patientList=new ArrayList<Patient>(); 
	ObjectMapper objectMapper = new ObjectMapper();
    Utility utility=new Utility();
	@Override
	public void add() throws IOException {
		System.out.print("\n\t\t\t\t           A D D-D E T A I L S");
		System.out.println("\n\t\t\t\t     -----------------------------");
		System.out.println("\t\t\t\t          Add Doctor  : Enter 1 ");
		System.out.println("\t\t\t\t          Add Patient : Enter 2 ");
		System.out.print("\n\t\t\t       Enter the Choice Which You Want to Add : ");
		int choice = utility.inputInteger();

		switch (choice) {

		case 1:
			addDoctor();
			break;
		case 2:
			addPatient();
			break;
		default:
			System.out.println("Enter correct choice please...");
		}
	
		
	}

	private void addPatient() throws IOException 
	{
		FileReader fr=new FileReader(patientFile);
		BufferedReader br=new BufferedReader(fr);
		String data=br.readLine();
		if(data!=null)
		{
		 patientList = objectMapper.readValue(data, new TypeReference<ArrayList<Patient>>(){});
	    }
		else
		{
		 System.out.println("\n\t\t\t\tFile is Empty");	
		}
		
		br.close();
		
		Patient patient=new Patient();
		System.out.println("\n\t\t\t\t    P A T I E N T-D E T A I L S");
		System.out.println("\t\t\t\t---------------------------------");
		System.out.print("\n\t\t\t\tEnter Patient Name          : ");
		patient.setPatientName(utility.inputString2());
		System.out.print("\n\t\t\t\tEnter Patient ID            : ");
		patient.setPatientId(utility.inputString2());
		System.out.print("\n\t\t\t\tEnter Patient Mobile Number : ");
		patient.setPatientMobileNo(utility.inputString2());
		System.out.print("\n\t\t\t\tEnter Patient Age           : ");
		patient.setPatientAge(utility.inputString2());
		
		patientList.add(patient);
		System.out.println();
		System.out.println("Patient List : "+patientList);
		
		mapper.writeValue(new FileOutputStream(patientFile), patientList);
	}


	private void addDoctor() throws JsonParseException, JsonMappingException, IOException 
	{
		FileReader fr=new FileReader(doctorFile);
		BufferedReader br=new BufferedReader(fr);
		String data=br.readLine();
		if(data!=null)
		{
		 doctorList = objectMapper.readValue(data, new TypeReference<ArrayList<Doctor>>(){});
	    }   
		else
		{
		 System.out.println("File is Empty");	
		}
		
		br.close();

		Doctor doctor=new Doctor();
		System.out.println("\n\t\t\t\t    D O C T O R-D E T A I L S");
		System.out.println("\t\t\t\t--------------------------------");
		System.out.print("\n\t\t\t\tEnter Doctor Name              : ");
		doctor.setDoctorName(utility.inputString2());
		System.out.print("\n\t\t\t\tEnter Doctor ID                : ");
		doctor.setDoctorId(utility.inputString2());
		System.out.print("\n\t\t\t\tEnter Doctor Specialization    : ");
		doctor.setDoctorSpecialization(utility.inputString2());
		System.out.print("\n\t\t\t\tEnter Doctor Availability Time : ");
		doctor.setDoctorAvailability(utility.inputString2());
		
		doctorList.add(doctor);
		System.out.println();
		System.out.println("DoctorList : "+doctorList);

		mapper.writeValue(new FileOutputStream(doctorFile), doctorList);
		
	}

	@Override
	public void search() throws IOException 
	{
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

	private void patientDetails() throws IOException 
	{
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

		System.out.println();

		System.out.println("\t\t\t\t                 P A T I E N T-L I S T");
		System.out.println("\t\t\t\t----------------------------------------------------");
		System.out.println("\t\t\t\tPatient_Name | Patient_Id  | Patient_Mobile_Number");

		FileReader fr=new FileReader(patientFile);
		BufferedReader br=new BufferedReader(fr);
		String data=br.readLine();
		if(data!=null)
		{
		 patientList = objectMapper.readValue(data, new TypeReference<ArrayList<Patient>>(){});
		 for(int i=0;i<patientList.size();i++)
		 {
				switch (choice) {
				case 1:
					if (result.equals(patientList.get(i).getPatientName())) 
					{
						System.out.printf("%40s %10s %20s ", patientList.get(i).getPatientName(), patientList.get(i).getPatientId(), patientList.get(i).getPatientMobileNo());
						System.out.println();
					}
					break;

				case 2:
					if (result.equals(patientList.get(i).getPatientId())) {
						System.out.printf("%40s %10s %20s ", patientList.get(i).getPatientName(), patientList.get(i).getPatientId(), patientList.get(i).getPatientMobileNo());
						System.out.println();
					}

					break;

				case 3:
					if (result.equals(patientList.get(i).getPatientMobileNo())) {

						System.out.printf("%40s %10s %20s ", patientList.get(i).getPatientName(), patientList.get(i).getPatientId(), patientList.get(i).getPatientMobileNo());
						System.out.println();
					}

					break;
				default:
					System.out.println("Invalid Choice...!");

				}

		 }

		}
		else
		{
		 System.out.println("\n\t\t\t\tFile is Empty");	
		}
		

		br.close();
		

		
	}

	private void doctorDetails() throws IOException 
	{
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

		System.out.println();
		System.out.println("\t\t\t\t                         D O C T O R -L I S T");
		System.out.println("\t\t\t\t----------------------------------------------------------------------");
		System.out.println("\t\t\t\tDoctor_Name    | Doctor_Id  | Doctor_Specialization | Doctor_Availability");

		FileReader fr=new FileReader(doctorFile);
		BufferedReader br=new BufferedReader(fr);
		String data=br.readLine();
		if(data!=null)
		{
		 doctorList = objectMapper.readValue(data, new TypeReference<ArrayList<Doctor>>(){});
		 for(int i=0;i<doctorList.size();i++)
		 {
				switch (choice) {
				case 1:
					if (result.equals(doctorList.get(i).getDoctorName())) {
						System.out.printf("%46s %8s %20s %20s ", doctorList.get(i).getDoctorName(), doctorList.get(i).getDoctorId(), doctorList.get(i).getDoctorSpecialization(),
								doctorList.get(i).getDoctorAvailability());
						System.out.println();
					}

					break;

				case 2:
					if (result.equals(doctorList.get(i).getDoctorId())) {
						System.out.printf("%46s %8s %20s %20s ", doctorList.get(i).getDoctorName(), doctorList.get(i).getDoctorId(), doctorList.get(i).getDoctorSpecialization(),
								doctorList.get(i).getDoctorAvailability());
						System.out.println();
					}

					break;

				case 3:
					if (result.equals(doctorList.get(i).getDoctorSpecialization())) {

						System.out.printf("%46s %8s %20s %20s ", doctorList.get(i).getDoctorName(), doctorList.get(i).getDoctorId(), doctorList.get(i).getDoctorSpecialization(),
								doctorList.get(i).getDoctorAvailability());
						System.out.println();
					}

					break;

				case 4:
					if (result.equals(doctorList.get(i).getDoctorAvailability())) {
						System.out.printf("%46s %8s %20s %20s ", doctorList.get(i).getDoctorName(), doctorList.get(i).getDoctorId(), doctorList.get(i).getDoctorSpecialization(),
								doctorList.get(i).getDoctorAvailability());
						System.out.println();
					}

					break;

				default:
					System.out.println("Invalid Choice...Please Try Again!");

				}
	 
		 }
	    }   
		else
		{
		 System.out.println("File is Empty");	
		}
		
		br.close();

	}

	@Override
	public void display() throws IOException {
		System.out.print("\n\t\t\t\t       D I S P L A Y-D E T A I L S");
		System.out.println("\n\t\t\t\t      -----------------------------");
		System.out.println("\t\t\t\t        Dispaly Doctor  : Enter 1 ");
		System.out.println("\t\t\t\t        Display Patient : Enter 2 ");
		System.out.print("\n\t\t\t       Enter the Choice Which You Want to Display : ");
		int choice = utility.inputInteger();

		switch (choice) {

		case 1:
			displayDoctor();
			break;
		case 2:
			displayPatient();
			break;
		default:
			System.out.println("Enter correct choice please...");
		}

		
	}

	private void displayPatient() throws IOException 
	{
		System.out.println();
		System.out.println("\t\t\t\t               P A T I E N T -L I S T");
		System.out.println("\t\t\t\t--------------------------------------------------");
		System.out.println("\t\t\t\tPatient_Name | Patient_Id  | Patient_Mobile_Number");
	
		FileReader fr=new FileReader(patientFile);
		BufferedReader br=new BufferedReader(fr);
		String data=br.readLine();
		if(data!=null)
		{
		 patientList = objectMapper.readValue(data, new TypeReference<ArrayList<Patient>>(){});
		 for(int i=0;i<patientList.size();i++)
		 {
			 System.out.printf("%40s %10s %20s ", patientList.get(i).getPatientName(), patientList.get(i).getPatientId(), patientList.get(i).getPatientMobileNo());
				System.out.println();
			 
		 }	
		}
	}

	private void displayDoctor() throws IOException 
	{
		System.out.println();
		System.out.println("\t\t\t\t                          D O C T O R -L I S T ");
		System.out.println("\t\t\t\t-----------------------------------------------------------------------------");
		System.out.println("\t\t\t\tDisplay_Doctor_Name | Doctor_Id  | Doctor_Specialization | Doctor_Availability");
		FileReader fr=new FileReader(doctorFile);
		BufferedReader br=new BufferedReader(fr);
		String data=br.readLine();
		if(data!=null)
		{
		 doctorList = objectMapper.readValue(data, new TypeReference<ArrayList<Doctor>>(){});
		 for(int i=0;i<doctorList.size();i++)
		 {
			 
			 System.out.printf("%46s %8s %20s %20s ", doctorList.get(i).getDoctorName(), doctorList.get(i).getDoctorId(), doctorList.get(i).getDoctorSpecialization(),
						doctorList.get(i).getDoctorAvailability());
				System.out.println(); 
		 }
		}

	}

	@Override
	public void popularDoctor() 
	{
	
	}

	@Override
	public void takeAppointment() {
		// TODO Auto-generated method stub
		
	}

}
