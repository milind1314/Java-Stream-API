package test;

/*
16. Calculate the Sum of Salaries by Gender:
- Calculate the sum of salaries for each gender (i.e., male and female) 
 * and return a map with gender as the key and the sum of salaries as the value.
*/

import java.util.List;
import java.util.stream.Collectors;

import blc_class.Employee;
import blc_class.EmployeeAdder;

public class CalculateTheSumOfSalariesByGender {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";

	public static void main(String[] args) {

		List<Employee> list = EmployeeAdder.addDetails();

		System.out.println(RED + "********* Calculate the sum of salaries for each gender**********" + RESET);

		list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.summingDouble(Employee::getSalary)))
				.forEach((k, v) -> System.out.println(k + " :: " + v));

	}

}
