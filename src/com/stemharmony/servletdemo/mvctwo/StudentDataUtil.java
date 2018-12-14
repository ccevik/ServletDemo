package com.stemharmony.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudents(){
		
		// create an empty list
		List<Student> students = new ArrayList<>();
		
		// add sample data
		students.add(new Student("Marry", "Public", "mary@stemharmony.com"));
		students.add(new Student("John", "Doe", "john@stemharmony.com"));
		students.add(new Student("Ajay", "Rao", "mary@stemharmony.com"));
		
		// return the list
		return students;
	}
}
