package test;

//3. Filter Employees by Salary:
//- Find employees with a salary greater than $50,000.


import java.util.List;

public class FilterBySalary {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {

		List<Employee> list = EmployeeAdder.addDetails();
		
		System.out.println(RED+"*****Find employees with a salary greater than $50,000.********"+RESET);
		
		list.stream().filter(sal -> sal.getSalary() > 50000).forEach(System.out::println);
	}

}
