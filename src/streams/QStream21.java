package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee2 {
    private String name;
    private String department;
    private double salary;

    public Employee2(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
//From a list of Employee objects, group them by department, and within each department, find the employees with the highest and lowest salaries.
public class QStream21 {

	public static void main(String[] args) {
		List<Employee2> employees = List.of(
                new Employee2("Alice", "HR", 50000),
                new Employee2("Bob", "IT", 60000),
                new Employee2("Charlie", "HR", 45000),
                new Employee2("David", "IT", 70000),
                new Employee2("Eve", "HR", 55000)
        );
		
		Map<String, List<Employee2>> collect = employees.stream()
		.collect(Collectors.groupingBy(s->s.getDepartment()));
		
		System.out.println(collect);
		
		Map<String, Map.Entry<Employee2, Employee2>> result = collect.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> {
                            // Get list of employees in the department
                            List<Employee2> departmentEmployees = entry.getValue();
                            // Find employee with highest salary
                            Employee2 maxSalaryEmployee = departmentEmployees.stream()
                                    .max(Comparator.comparingDouble(Employee2::getSalary))
                                    .orElse(null);
                            // Find employee with lowest salary
                            Employee2 minSalaryEmployee = departmentEmployees.stream()
                                    .min(Comparator.comparingDouble(Employee2::getSalary))
                                    .orElse(null);
                            // Create entry with highest and lowest salary employees
                            return Map.entry(maxSalaryEmployee, minSalaryEmployee);
                        }
                ));

        // Print the result
        result.forEach((department, employeesMinMax) -> {
            System.out.println("Department: " + department);
            System.out.println("Employee with highest salary: " + employeesMinMax.getKey());
            System.out.println("Employee with lowest salary: " + employeesMinMax.getValue());
            System.out.println();
        });
	}

}
