package com.bridgelabz.oop.cliniqueUsingOOP;

import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public interface SubManagerInterface
{
 void addDoctor() throws JsonParseException, JsonMappingException, IOException;
 void addPatient() throws IOException;
 ArrayList<Doctor> doctorDetails() throws IOException;
 ArrayList<Patient> patientDetails() throws IOException;
 void displayDoctor() throws IOException;
 void displayPatient() throws IOException;

}
