package test;

//6. Find Maximum Salary:
//- Find the employee with the highest salary.


import java.util.List;
public class MaximumSalary {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {

		List<Employee> list = EmployeeAdder.addDetails();
		
		System.out.println(RED+"*********Find the employee with the highest salary.********"+RESET);
		
		double max = list.stream().mapToDouble(Employee::getSalary).max().orElseThrow();
		
		System.out.println("Maximum Salary is : "+max);
	}
	

}
