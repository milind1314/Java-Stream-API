package test;
import java.util.*;
import java.util.stream.Collectors;

import blc_class.*;

//20. Retrieve Distinct Age Values:
//- Get a list of distinct ages of all employees.
public class DistinctAge {

    private static final String RED = "\033[1;31m";
    private static final String RESET = "\033[0m";
    
	public static void main(String[] args) {
		List<Employee> list  = EmployeeAdder.addDetails();
		System.out.println(RED+"*********Get a list of distinct ages of all employees.*********"+RESET);
		
		Set<Integer> collect = list.stream().map(Employee::getAge).collect(Collectors.toSet());
		
		collect.stream().sorted().forEach(System.out::println);
	}
}
