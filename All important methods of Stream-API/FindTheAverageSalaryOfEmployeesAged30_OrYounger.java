package test;

//24. Find the Average Salary of Employees Aged 30 or Younger:
//- Calculate the average salary of employees aged 30 or younger.

import java.util.List;

import blc_class.Employee;
import blc_class.EmployeeAdder;
public class FindTheAverageSalaryOfEmployeesAged30_OrYounger {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {

		List<Employee> list = EmployeeAdder.addDetails();
		
		System.out.println(RED+"********Calculate the average salary of employees aged 30 or younger.******"+RESET);
		
		double avg = list.stream().filter(a->a.getAge()<=30).mapToDouble(m -> m.getSalary()).average().orElseThrow();
		
		System.out.println("Average salary of employees aged 30 or younger : "+avg);
	}	

}
