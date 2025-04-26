package test;

import java.util.List;
import java.util.stream.Collectors;

import blc_class.Employee;
import blc_class.EmployeeAdder;

//26. Find the Youngest Female Employee:
//- Find the youngest female employee.
public class FindYoungestFemaleEmployee {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {
		
		System.out.println(RED+"**********Find the youngest female employee.**********"+RESET);
		
		List<Employee> list = EmployeeAdder.addDetails();
		Employee emp = list.stream().filter(k -> k.getGender().equals("Female")).collect(Collectors.minBy((o1,o2)->o1.getAge()-o2.getAge())).get();

		System.out.println(emp);
	}
}
