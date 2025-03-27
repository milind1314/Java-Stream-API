package test;


//14. Group Employees by Age:
//- Group employees into age groups (e.g., 20-30, 31-40, etc.)
//and return a map with age group as the key and a list of employees as the value.


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import blc_class.Employee;
import blc_class.EmployeeAdder;

public class GroupEmployeesbyAge {

	private static final String RED = "\033[1;31m";
	private static final String RESET = "\033[0m";
	
	public static void main(String[] args) {

		List<Employee> list = EmployeeAdder.addDetails();
		
		System.out.println(RED+"****Group employees into age groups (e.g., 20-30, 31-40, etc.)*****"+RESET);
		
		//By using Lambda.
		
		list.stream().collect(Collectors.groupingBy((t) -> {
		int age = t.getAge();
		
		if (age >= 20 && age <= 30) {
			return "20-30";
		}
		else if (age >= 31 && age <= 40) {
			return "31-40";
		} 
		else if (age >= 41 && age <= 60) {
			return "41+";
		}else{
			return "Not eligible";
		}
		})).forEach((k,v)-> System.out.println(k +" : "+v));
		
		
		System.out.println("\n--------------------------------------------------------------\n");
		
		
		//For better readability
		
		 // Using a separate method for better readability
        Map<String, List<Employee>> groupedByAge = list.stream()
                .collect(Collectors.groupingBy(GroupEmployeesbyAge::getAgeGroup));

        // Print the grouped employees
        groupedByAge.forEach((ageGroup, employees) -> {
            System.out.println(ageGroup + " : " + employees);
        });
    }

    // Helper method to determine age group
    private static String getAgeGroup(Employee employee) {
        int age = employee.getAge();

        if (age >= 20 && age <= 30) {
            return "20-30";
        } else if (age >= 31 && age <= 40) {
            return "31-40";
        } else if (age >= 41 && age <= 60) {
            return "41+";
        }
        return "Not eligible";
		
	}
	

}


