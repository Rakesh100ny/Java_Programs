package com.bridgelabz.oop.cliniqueUsingOOP;

import java.io.IOException;

public interface ManagerInterface {
	void add() throws IOException;

	void search() throws IOException;

	void display() throws IOException;

	void popularDoctor();

	void takeAppointment() throws IOException;
}
