package oOPS;

import java.util.ArrayList;
import java.util.List;

class Department{
	
	public String dept_name;
	public List<Employee> employee;
	
	public Department(String dept_name, List<Employee> employee) {
		this.dept_name = dept_name;
		this.employee = employee;
	}
	
	
	
}

class Employee{
	public String name;
	public int age;
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	
	
}

public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1= new Employee("Revanth", 26);
		Employee employee2= new Employee("Dembele", 26);
		
		List<Employee> employees=new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		
		Department department= new Department("IT", employees);
		Employee employee = department.employee.get(1);
		System.out.println(department.dept_name+ ":"+employee);
		

	}

}
