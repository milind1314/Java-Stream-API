package test;

import java.util.*;

public class EmployeeAdder {
	
	public static List<Employee> addDetails()
	{
		List<Employee> list = new ArrayList<Employee>();
		
		Employee employee1 = new Employee("Anna", 27, 50000.0, "Male");
		Employee employee2 = new Employee("Lily", 27, 51000.0, "Female"); 
		Employee employee3 = new Employee("Bob", 27, 52000.0, "Male");
		Employee employee4 = new Employee("Pranali", 28, 53000.0, "Female");
		Employee employee5 = new Employee("Mino", 29, 53000.0, "Male");
		Employee employee6 = new Employee("Lisa", 30, 55000.0, "Female");
		Employee employee7 = new Employee("Smith", 31, 56000.0, "Male");
		Employee employee8 = new Employee("Eliana", 32, 57000.0, "Female");
		Employee employee9 = new Employee("Elon", 35, 58000.0, "Male");
		Employee employee10 = new Employee("Jenny", 35, 59000.0, "Female");
		
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		list.add(employee6);
		list.add(employee7);
		list.add(employee8);
		list.add(employee9);
		list.add(employee10);
		
		return list;
	}
}
