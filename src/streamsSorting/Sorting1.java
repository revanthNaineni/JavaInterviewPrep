package streamsSorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Consider a list of Employee objects with name, department, and salary fields. Write code to sort this list based on the department field in ascending order, and for employees in the same department, sort them by salary in descending order using Java streams.

class Employee1 {
	private String name;
	private String department;
	private double salary;

	public Employee1(String name, String department, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", department='" + department + '\'' + ", salary=" + salary + '}';
	}

}

public class Sorting1 {

	public static void main(String[] args) {
		List<Employee1> employees = Arrays.asList(new Employee1("Alice", "Engineering", 60000),
				new Employee1("Bob", "Engineering", 70000), new Employee1("Charlie", "Sales", 55000),
				new Employee1("David", "HR", 50000), new Employee1("Eve", "Sales", 60000));

		List<Employee1> sortedEmployees = employees.stream()
				.sorted(Comparator.comparing(Employee1::getDepartment)
						.thenComparing(Comparator.comparingDouble(Employee1::getSalary).reversed()))
				.collect(Collectors.toList());
		
		System.out.println(sortedEmployees);

	}

}
