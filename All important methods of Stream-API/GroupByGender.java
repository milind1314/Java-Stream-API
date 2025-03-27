package test;

//7.Group Employees by Gender:
//- Group employees by gender and return a map with gender as the key and a list of employees as the value.


import java.util.List;
import java.util.stream.Collectors;

import blc_class.Employee;
import blc_class.EmployeeAdder;
public class GroupByGender {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {

		List<Employee> list = EmployeeAdder.addDetails();
		
		System.out.println(RED+"******Group employees by gender and return a map******"+RESET);
		
		list.stream().collect(Collectors.groupingBy(Employee::getGender)).forEach((k,v) -> System.out.println(k+" - "+v));
		
		
	}
	

}
