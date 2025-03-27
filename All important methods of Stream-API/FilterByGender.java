package test;

//1. Filter Employees by Gender:
//- Retrieve a list of all female employees.


import java.util.List;

import blc_class.Employee;
import blc_class.EmployeeAdder;

public class FilterByGender {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {

		List<Employee> list = EmployeeAdder.addDetails();
		
		System.out.println(RED+"*****Retrieve a list of all female employees********"+RESET);
		list.stream().filter(f -> f.getGender().equals("Male")).forEach(System.out::println);
		
	}

}
