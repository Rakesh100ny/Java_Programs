package com.bridgelabz.oop.addressBookUsingOOP;

import java.io.IOException;
import java.util.ArrayList;

public interface PersonInterface 
{
 public ArrayList<Person> add(ArrayList<Person> arrayList) throws IOException;
 public ArrayList<Person> edit(ArrayList<Person> arrayList) throws IOException;
 public ArrayList<Person> delete(ArrayList<Person> arrayList) throws IOException;;
 public ArrayList<Person> sort(ArrayList<Person> arrayList) throws IOException;;

}
