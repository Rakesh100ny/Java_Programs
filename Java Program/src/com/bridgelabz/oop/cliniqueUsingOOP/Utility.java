package com.bridgelabz.oop.cliniqueUsingOOP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.ObjectMapper;


public class Utility 
{	private static ObjectMapper objectMapper = new ObjectMapper();

	private static Scanner scanner=new Scanner(System.in);

  private Utility(){}
 
  private static class SingletonHelper{
      private static final Utility UTILITY = new Utility();
  }
  
  public static Utility getInstance(){
      return SingletonHelper.UTILITY;
  }

  
	/**
	 * @return string input given by the user
	 */
	public String inputString() {
		try {
			return scanner.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	public String inputString2() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	/**
	 * @return float input given by the user
	 */
	public float inputFloat() {
		try {
			return scanner.nextFloat();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0.0f;
	}

	/**
	 * @return long input given by the user
	 */
	public long inputLong() {
		try {
			return scanner.nextLong();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * @return character input given by the user
	 */
	public char inputCharacter() {
		try {
			return scanner.next().charAt(0);
		} catch (Exception e) {
			System.out.println(e);
		}
		return ' ';
	}

	/**
	 * @return integer value given by the user
	 */
	public int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * @return double value given by the user
	 */
	public double inputDouble() {
		try {
			return scanner.nextDouble();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0.0;
	}

	/**
	 * @return boolean value given by the user
	 */
	public boolean inputBoolean() {
		try {
			return scanner.nextBoolean();
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
	
	public boolean checkAppointmentDate(List<Appointment> appointmentList,String date,int id,String doctorName) 
	{
     for(int i=appointmentList.size()-1;i>=0;i--)
     {
      if(id==appointmentList.get(i).getDoctorId() && doctorName.equals(appointmentList.get(i).getDoctorName()) )
      {
       
       if(date.equals(appointmentList.get(i).getDate()))
       {
    	   return false;   
       }
       else
       {
    	  return true; 
       }
       	
      }
      System.out.println("iCount : "+i);
     
     }
 	 return false;
	}
	
	public static <T>ArrayList<T> readFile(String fileName,Class<T[]>className) throws JsonParseException,IOException
	{
		List<T>list=null;
		ArrayList<T> arrayList=null;
		
		FileReader fr=new FileReader(fileName);
		BufferedReader br=new BufferedReader(fr);
		String data=br.readLine();
		list = new LinkedList<T>(Arrays.asList(objectMapper.readValue(data, className)));
		arrayList = new ArrayList<T>(list);
		br.close();
		return arrayList;
		
	}
	public boolean toCheckDoctorDetails(List<Doctor> doctorList,String result) 
	{
		for(int i=0;i<doctorList.size();i++)
	    {
	     if(doctorList.get(i).getDoctorName().equals(result) || doctorList.get(i).getDoctorAvailability().equals(result) || doctorList.get(i).getDoctorSpecialization().equals(result)|| String.valueOf(doctorList.get(i).getDoctorId()).equals(result))
	     {
	      return true; 	  
	     }
	    }
   	    return false;
	}
	
	public boolean toCheckPatientDetails(List<Patient> patientList, String result) {
		for(int i=0;i<patientList.size();i++)
		{
		 if(patientList.get(i).getPatientName().equals(result) || String.valueOf(patientList.get(i).getPatientId()).equals(result) || String.valueOf(patientList.get(i).getPatientMobileNo()).equals(result))
		 {
		  return true; 	  
		 }
		}
		return false;
	}
}
