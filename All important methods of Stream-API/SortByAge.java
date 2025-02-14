package test;

import java.util.Comparator;

//10. Sort Employees by Age:
//- Sort the employees by age in ascending order.


import java.util.List;
public class SortByAge {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {

		List<Employee> list = EmployeeAdder.addDetails();
		
		System.out.println(RED+"**********Sort the employees by age in ascending order.********"+RESET);
		
		list.stream().sorted((age1,age2) -> Integer.compare(age1.getAge(), age2.getAge())).forEach(System.out::println); 
		
		System.out.println("\n************ OR ***************\n");
		
		list.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println(RED+"**********Sort the employees by age in descending order.********"+RESET);
		
		list.stream().sorted((age1,age2) -> Integer.compare(age2.getAge(), age1.getAge())).forEach(System.out::println);
		System.out.println("\n************ OR ***************\n");
		
		list.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).forEach(System.out::println);
	}
	

}
