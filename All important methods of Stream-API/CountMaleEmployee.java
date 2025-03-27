package test;

//8. Count Male Employees:
//- Count the number of male employees.


import java.util.List;

import blc_class.Employee;
import blc_class.EmployeeAdder;
public class CountMaleEmployee {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {

		List<Employee> list = EmployeeAdder.addDetails();
		
		System.out.println(RED+"**********Count the number of male employees.*********"+RESET);	
		
		long maleCount = list.stream().filter(maleEmp -> maleEmp.getGender().equals("Male")).count();
		
		System.out.println("Total male employee in company is : "+maleCount);
		
		
		System.out.println();
		
		
		System.out.println(RED+"**********Count the number of female employees.*********"+RESET);	
		
		long femaleCount = list.stream().filter(femaleEmp -> femaleEmp.getGender().equals("Female")).count();
		
		System.out.println("Total femalmale employee in company is : "+femaleCount);
	}	

}
