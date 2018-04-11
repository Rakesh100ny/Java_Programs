package com.bridgelabz.oop.addressBookUsingOOP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import com.bridgelabz.utility.Utility;

public class AddressManager implements AddressBookInterface {
	ObjectMapper mapper = new ObjectMapper();
	File file;
	String filePath = "/home/brideit/files/AddressBook/";
	Utility utility = new Utility();
	
	static ArrayList<Person> arrayList=new ArrayList<Person>();
	
	public static ArrayList<Person> getList()
	{
     return arrayList;		
	}
	
    public void createNewAddressBook() throws IOException {
		System.out.print("\n\t\t\t\tEnter the File Name : ");
		String fileName = utility.inputString2();
		file = new File(filePath + fileName + ".json");
		if (file.exists()) {
			System.out.println(
					"\n\t\tThe name " + fileName + " is already used in this location. Please use a different name.");
		} else {
			file.createNewFile();
			mapper.writeValue(file,arrayList);
			System.out.println("\n\t\t\t\tFile is Create Successfully...!");
		}
	}

	public ArrayList<Person> openAddressBook(String fileName) throws IOException {
		file = new File(filePath + fileName + ".json");

		if (file.exists()) {
			
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			
			if(br.readLine()!=null)
			{
			 arrayList = utility.readJsonDataConvertIntoList(file);
             System.out.println("\n\t\t\t\t\tList : "+arrayList);
			}
			else
			{
			 System.out.println("File is Empty");	
			}
			
			br.close();
			char info = ' ';
			PersonInterface mangerOperation = new PersonManger();

			char input = ' ';
			do {

				System.out.print("\n\t\t\t\t    A D D_I N F O-S Y S T E M ");
				System.out.print("\n\t\t\t\t--------------------------------");

				System.out.print("\n\t\t\t\t  Add    Adress Book : Enter 1");
				System.out.print("\n\t\t\t\t  Edit   Adress Book : Enter 2");
				System.out.print("\n\t\t\t\t  Delete Adress Book : Enter 3");
				System.out.print("\n\t\t\t\t  Sort   Adress Book : Enter 4");

				System.out.print("\n\t\t\t\t--------------------------------\n");

				System.out.print("\n\t\t\t\tEnter Choice : ");
				int choice = utility.inputInteger();
                 
				switch (choice) {
				case 1:
					arrayList = mangerOperation.add(arrayList);
					break;

				case 2:
					arrayList = mangerOperation.edit(arrayList);
					break;

				case 3:
					 arrayList = mangerOperation.delete(arrayList);
										
					break;

				case 4:
					arrayList=mangerOperation.sort(arrayList);
					break;

				default:
					System.out.println("\n\t\t\t\tInvalid Choice...!");
				}
				System.out.print("\n\t\t\t\tDo you Want to continue (Y/N) : ");
				input = utility.inputCharacter();
			} while (input == 'Y' || input == 'y');

		} else {
			System.out.println("\n\t\tFile is Not Found in this loction So Please Check Your File Name Correctly...!");
		}
		return arrayList;
	}

	public void save(ArrayList<Person> arrayList) throws JsonGenerationException, JsonMappingException, IOException {
		
		mapper.writeValue(new FileOutputStream(file), arrayList);

	}

	public void saveAs() throws IOException {
		System.out.println();
		file = new File(filePath);
		File[] fileList = file.listFiles();
		System.out.println("\t\t\t\t	 LIST_OF_FILE");
		System.out.println("\t\t\t\t-----------------------------");
		System.out.println("\t\t\t\tDisplay_FileName | File_Size");

		for (File fileName : fileList) {

			System.out.printf("%45s %8d Bytes", fileName.getName(), fileName.length());
			System.out.println();
		}
		System.out.print("\n\t\tEnter the File Name Which You want to Save As :");
		String fname = utility.inputString2();
		file =new File(filePath+fname+".json");
			
		for(File fileName : fileList)
		{
	     if(file.getName().equals(fileName.getName()))
         {
		  arrayList = utility.readJsonDataConvertIntoList(file);

          System.out.println("\n\t\t\t\tEnter the New File Name  : ");
          String newFileName=utility.inputString2();
          System.out.println("\n\t\t\t\tEnter the File Extension : ");
          String extension=utility.inputString2();
          
          file=new File(filePath+newFileName+extension);
          file.createNewFile();
          
          mapper.writeValue(new FileOutputStream(file), arrayList);
          System.out.println("File is Save As with new Name in the Directory"); 
       
         }
		}		

	}

	public void quit() {
		// TODO Auto-generated method stub

	}

	public void deleteFile() throws JsonGenerationException, JsonMappingException, IOException 
	{
		file = new File(filePath);
		File[] fileList = file.listFiles();
		System.out.println("\t\t\t\t	 LIST_OF_FILE");
		System.out.println("\t\t\t\t-----------------------------");
		System.out.println("\t\t\t\tDisplay_FileName | File_Size");

		for (File fileName : fileList) {

			System.out.printf("%45s %8d Bytes", fileName.getName(), fileName.length());
			System.out.println();
		}

		System.out.print("\n\t\t\tEnter the File Name Which you want to Delete :");
		String fname = utility.inputString2();
		file =new File(filePath+fname+".json");
			
		for(File fileName : fileList)
		{
		 if(file.getName().equals(fileName.getName()))
		 {
		  file.delete();
		  
		  System.out.println("\n\t\t\tFile is Deleted..!");
		 }
		}
		
	}

}
