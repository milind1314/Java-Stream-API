package test;

//2. Filter Employees by Age:
//- Get a list of employees older than 30 years.


import java.util.List;

public class FilterByAge {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {

		List<Employee> list = EmployeeAdder.addDetails();
		
		System.out.println(RED+"*****Get a list of employees older than 30 years.********"+RESET);
		list.stream().filter(age -> age.getAge() > 30).forEach(System.out::println);
	}

}
