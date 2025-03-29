package test;

//25. Find the Names of Male Employees with Salaries Over $60,000:
//- Retrieve the names of male employees with salaries over $53,000.

import java.util.List;

import blc_class.Employee;
import blc_class.EmployeeAdder;
public class FindTheNamesOfMaleEmployeesWithSalariesOver_60000 {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {

		List<Employee> list = EmployeeAdder.addDetails();
		
		System.out.println(RED+"**********Retrieve the names of male employees with salaries over $53,000.***********"+RESET);
		
		list.stream().filter(a->a.getGender().equalsIgnoreCase("male") && a.getSalary()>53000).map(m -> m.getName()).forEach(System.out::println);;
		
	}	

}
