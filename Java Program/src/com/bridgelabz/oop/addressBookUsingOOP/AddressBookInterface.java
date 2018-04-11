package com.bridgelabz.oop.addressBookUsingOOP;

import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public interface AddressBookInterface
{
	AddressBookInterface reference=null;
	public void createNewAddressBook() throws IOException;
	public ArrayList<Person> openAddressBook(String fileName) throws IOException;
	public void save(ArrayList<Person> arrayList) throws JsonGenerationException, JsonMappingException, IOException ;
	public void saveAs() throws IOException;
	public void deleteFile() throws JsonGenerationException, JsonMappingException, IOException; 

}
