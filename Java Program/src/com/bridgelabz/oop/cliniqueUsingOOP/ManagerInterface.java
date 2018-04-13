package com.bridgelabz.oop.cliniqueUsingOOP;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public interface ManagerInterface {
	void add() throws IOException;

	void search() throws IOException;

	void display() throws IOException;

	void popularDoctor() throws JsonParseException, JsonMappingException, IOException;

	void takeAppointment() throws IOException;

	
	
	
	
}
