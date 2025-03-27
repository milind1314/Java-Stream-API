package test;

import java.util.Comparator;

//13. Find Oldest Employee:
//- Find the oldest employee.


import java.util.List;

import blc_class.Employee;
import blc_class.EmployeeAdder;

public class FindOldestEmployee {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {

		List<Employee> list = EmployeeAdder.addDetails();
		
		//By using Lambda.
		
		System.out.println(RED+"*********Find the oldest employee.*********"+RESET);

		int maxAge = list.stream().mapToInt(age -> age.getAge()).max().orElseThrow();
		
		Employee emp = list.stream().max((e1,e2) -> e1.getAge() - e2.getAge()).orElseThrow();
		
		System.out.println("Oldest Employee: " + emp);
		System.out.println("Max age : "+maxAge);
		
		//By using Method Reference.
		
		int maxAge1 = list.stream().mapToInt(Employee::getAge).max().orElseThrow();
		
		Employee emp1 = list.stream().max(Comparator.comparing(Employee::getAge)).orElseThrow();
		
		System.out.println("Oldest Employee: " + emp1);
		System.out.println("Max age : "+maxAge1);
		
		 // Using a single pass to find the oldest employee
		
		Employee oldestEmployee  = list.stream().max(Comparator.comparingInt(Employee::getAge)).orElseThrow();
		
		System.out.println("Oldest Employee: " + oldestEmployee);
        System.out.println("Max age: " + oldestEmployee.getAge());
		
	}
	

}


