package com.acemusicstore;
import java.util.Set;

import java.util.TreeSet;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collections;
public abstract class Employee {

// Class variables

	public String name, role, jobTitle, empPassword;
	public Byte employeeID;

	public Employee() {
		ArrayList <String> employeeRec1 = new ArrayList<String> ();
		Collections.addAll(employeeRec1, "Ben", "Martin", "Sales", "Sales Associate");
		ArrayList <String> employeeRec2 = new ArrayList<String> ();
		Collections.addAll(employeeRec2, "Will", "Hartnet", "Sales", "Sales Associate");
		ArrayList <String> employeeRec3 = new ArrayList<String> ();
		Collections.addAll(employeeRec3, "Jim", "Whittle", "Admin", "Sales Manager");
		System.out.println(employeeRec1);
		System.out.println(employeeRec2);
		System.out.println(employeeRec3);
	}
	
	public Employee(String name, String role, String jobTitle) {
		// TODO Auto-generated constructor stub
		super();
		//TreeSet <Employee> emp = new TreeSet <> ();
		//ArrayList <String> empRec = new ArrayList <String> ();
		//emp.add(new Employee ("Ben Martin", "Sales", "Sales Associate"));
	}
	

}