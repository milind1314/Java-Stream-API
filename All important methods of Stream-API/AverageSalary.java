package test;

//5. Calculate Average Salary:
//- Calculate the average salary of all employees.


import java.util.List;

import blc_class.Employee;
import blc_class.EmployeeAdder;

public class AverageSalary {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {

		List<Employee> list = EmployeeAdder.addDetails();
		
		System.out.println(RED+"*********Calculate the average salary of all employees.*******"+RESET);
		
		double avg = list.stream().mapToDouble(sal -> sal.getSalary()).average().orElseThrow();
		
		System.out.println("Employee Salary Average is : "+avg);
		
		
		//********************OR**************************
		
		double orElseThrow = list.stream()
				.mapToDouble(Employee::getSalary)
				.average()
				.orElseThrow();
		System.out.println("Average : "+orElseThrow);
	}
	

}
