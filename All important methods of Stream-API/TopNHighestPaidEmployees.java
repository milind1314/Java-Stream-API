package test;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import blc_class.Employee;
import blc_class.EmployeeAdder;

/*
 * 19. Find the Top N Highest Paid Employees:
     - Find the top N employees with the highest salaries.
 */

public class TopNHighestPaidEmployees {

    private static final String RED = "\033[1;31m";
    private static final String RESET = "\033[0m";
    
	public static void main(String[] args) {

		List<Employee> list = EmployeeAdder.addDetails();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter to find the top N Highest Paid Employees : ");
		
		int top = Integer.parseInt(sc.nextLine());
		
		System.out.println(RED+"*******Find the top "+top+" employees with the highest salaries.********"+RESET);
		
		
		list.stream().sorted((p1,p2) -> -(int)(p1.getSalary() - p2.getSalary())).limit(top).forEach(System.out::println);
		
		System.out.println("\n**********************************OR***************************************\n");
		
		list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(top).forEach(System.out::println);
		
		sc.close();
	}

}
