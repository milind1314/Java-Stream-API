package test;

//15. Find Employees with a Specific Age:
//- Find all employees who are exactly 35 years old.


import java.util.List;
import java.util.Scanner;

import blc_class.Employee;
import blc_class.EmployeeAdder;


public class EmployeeBySpecificAge {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		List<Employee> list = EmployeeAdder.addDetails();
		
		System.out.print("Enter age to find Employees : ");
		
		int age = Integer.parseInt(in.nextLine());
		
		System.out.println(RED+"************ Find all employees who are exactly 35 years old.***********"+RESET);
		
		
		list.stream().filter(e -> e.getAge() == age).forEach(System.out::println);
		
		in.close();
		
		
	}
	

}


