package test;

import java.util.List;
import blc_class.Employee;
import blc_class.EmployeeAdder;

//22. Sort Employees by Name Length:
//- Sort employees by the length of their names (shortest to longest).
public class SortEmployeeByNameLength {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {
		
		List<Employee> list = EmployeeAdder.addDetails();
		
		System.out.println(RED+"***********Sort employees by the length of their names (shortest to longest).*******"+RESET);

		list.stream().sorted((o1,o2) -> (o1.getName().length() - o2.getName().length())).map(m -> m.getName()).forEach(System.out::println);
	}

}
