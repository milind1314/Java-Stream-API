package test;

import java.util.List;
import blc_class.Employee;
import blc_class.EmployeeAdder;

//21. Find the Three Lowest-Paid Employees:
//- Find and display the names of the three employees with the lowest salaries.
public class FindThreeLowestPaidEmployees {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {
		
		List<Employee> list = EmployeeAdder.addDetails();
		
		System.out.println(RED+"*******Find and display the names of the three employees with the lowest salaries.********"+RESET);

		list.stream().sorted((o1,o2) -> (int)(o1.getSalary() - o2.getSalary())).limit(3).map(m -> m.getName()).forEach(System.out::println);
	}

}
