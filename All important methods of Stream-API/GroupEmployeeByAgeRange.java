package test;

import java.util.List;
import java.util.stream.Collectors;

import blc_class.Employee;
import blc_class.EmployeeAdder;

//23. Group Employees by Age Range:
//- Group employees into custom
//age ranges (e.g., 20-29, 30-39, etc.) and
//return a map with the age range as the key and a list of employees as the value.

public class GroupEmployeeByAgeRange {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {
		
		List<Employee> list = EmployeeAdder.addDetails();
		
		System.out.println(RED+"*********Group employees into custom age ranges (e.g., 20-29, 30-39, etc.)*********"+RESET);
		
		list.stream().collect(Collectors.groupingBy((t)->{
			int age = ((Employee) t).getAge();
			if (age>=20 && age<=29) {
				return "20-29";
			}
			else if (age>=30 && age<=39) {
				return "30-39";
			}
			else {
				return "40+";
			}
		})).forEach((k,v)->System.out.println(k+" - "+v));

		}
	}


