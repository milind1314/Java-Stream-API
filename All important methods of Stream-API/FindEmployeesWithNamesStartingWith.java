package test;

/*
 18.Find Employees with Names Starting with "J":
- Find all employees whose names start with the letter "E."
 */

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;
import blc_class.Employee;
import blc_class.EmployeeAdder;

public class FindEmployeesWithNamesStartingWith {

    private static final String RED = "\033[1;31m";
    private static final String RESET = "\033[0m";
    
    public static void main(String[] args) {        
        
        try (Scanner sc = new Scanner(System.in)) {
            
            List<Employee> list = EmployeeAdder.addDetails();
            
            System.out.println("Enter the employee initials: ");
            String ch = sc.nextLine().toUpperCase();
            
            if (ch.isEmpty() || ch.charAt(0) < 'A' || ch.charAt(0) > 'Z') {
                throw new InputMismatchException("Invalid input! Please enter a valid alphabet initial.");
            }
        
            System.out.println(RED + "*********Employees whose names start with the letter " + ch + "*********" + RESET);
            
            Stream<Employee> filter = list.stream()
                                           .filter(employee -> employee.getName().toUpperCase().startsWith(ch));
            
            Optional<Employee> anyEmployee = filter.findAny();
            
            if (!anyEmployee.isPresent()) {
                System.err.println("No employees found with names starting with: " + ch);
            } else {
                list.stream()
                    .filter(employee -> employee.getName().toUpperCase().startsWith(ch))
                    .forEach(System.out::println);
            }
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
