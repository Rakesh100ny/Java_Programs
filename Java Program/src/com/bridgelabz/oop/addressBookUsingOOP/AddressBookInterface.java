package com.bridgelabz.oop.addressBookUsingOOP;

import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public interface AddressBookInterface
{
	AddressBookInterface reference=null;
    void createNewAddressBook() throws IOException;
	ArrayList<Person> openAddressBook(String fileName) throws IOException;
	void save(ArrayList<Person> arrayList) throws JsonGenerationException, JsonMappingException, IOException ;
	void saveAs() throws IOException;
	void deleteFile() throws JsonGenerationException, JsonMappingException, IOException; 

}
