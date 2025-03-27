package test;

import java.util.Comparator;

//10. Sort Employees by Name:
//- Sort the employees by their names in alphabetical order.


import java.util.List;

import blc_class.Employee;
import blc_class.EmployeeAdder;
public class SortByName {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {

		List<Employee> list = EmployeeAdder.addDetails();
		
		System.out.println(RED+"*******Sort the employees by their names in alphabetical order.*****"+RESET);
		
		list.stream().sorted((name1,name2) -> name1.getName().compareTo(name2.getName())).forEach(System.out::println);
		
		System.out.println("\n************ OR ***************\n");
		
		list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
	}
	

}
