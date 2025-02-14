package test;

public class Employee {
	private String name;
	private int age;
	private double salary;
	private String gender;
	
	public Employee(String name,int age,double salary,String gender)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", gender=" + gender + "]";
	}
	
	
}
