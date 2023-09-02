package com.GradedProject.Question1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;

public class ProjectDeserializer {

	Map<Project, ArrayList<Employee>> employee;

	public Map<Project, ArrayList<Employee>> projectDeSeriailizer() {
		try {
			FileInputStream fileInput = new FileInputStream(
					"file1.txt");
			ObjectInputStream in = new ObjectInputStream(fileInput);
			employee = (Map<Project, ArrayList<Employee>>) in.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return employee;

	}

}
