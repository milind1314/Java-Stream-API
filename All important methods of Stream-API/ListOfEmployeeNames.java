package test;

//4. Map Employee Names:
//- Create a list of employee names (Strings).


import java.util.List;

import blc_class.Employee;
import blc_class.EmployeeAdder;

public class ListOfEmployeeNames {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {

		List<Employee> list = EmployeeAdder.addDetails();
		
		System.out.println(RED+"*************Create a list of employee names (Strings)*************"+RESET);
		
		list.stream().map(name -> name.getName()).forEach(System.out::println);
	}

}
