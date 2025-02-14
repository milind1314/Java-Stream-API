package test;

import java.util.Comparator;

//12. Sort Employees by Salary:
//- Sort the employees by salary in descending order.



import java.util.List;
public class SortBySalary {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {

		List<Employee> list = EmployeeAdder.addDetails();
		
		//By using Lambda.
		System.out.println(RED+"*********Sort the employees by salary in ascending order.******"+RESET);
		
		list.stream().sorted((sal1,sal2) -> Double.compare(sal1.getSalary(), sal2.getSalary())).forEach(System.out::println);
		
		System.out.println("\n************ OR ***************\n");
		
		list.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
		
		System.out.println("\n************ OR ***************\n");
		
		list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);
		
		System.out.println();
		
		
		//By using Method Reference.
		System.out.println(RED+"*********Sort the employees by salary in descending order.******"+RESET);
		
		list.stream().sorted((sal1,sal2) -> Double.compare(sal2.getSalary(), sal1.getSalary())).forEach(System.out::println);
		
		System.out.println("\n************ OR ***************\n");
		
		list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
	}
	

}
