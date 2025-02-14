package test;

//9. Sum of All Salaries:
//- Calculate the total sum of salaries for all employees.

import java.util.List;
public class SumOfAllSalary {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {

		List<Employee> list = EmployeeAdder.addDetails();
		
		System.out.println(RED+"*********Calculate the total sum of salaries for all employees.**********"+RESET);
		
		double salSum = list.stream().mapToDouble(Employee::getSalary).sum();
		
		System.out.println("Sum of all Employee salary is : "+salSum);
	}
	

}
