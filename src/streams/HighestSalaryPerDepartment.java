package streams;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestSalaryPerDepartment {

    public static void main(String[] args) {

        // Sample Employee data (replace with your actual data source)
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Engineering", 80000),
                new Employee("Bob", "Sales", 95000),
                new Employee("Charlie", "Engineering", 75000),
                new Employee("David", "Sales", 88000)
        );

        // Group employees by department and find the employee with the highest salary in each group
       Map<String, Employee> collect = employees.stream()
       .collect(Collectors.groupingBy(s->s.getDepartment(),Collectors.collectingAndThen(
               Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)),
               Optional::get
       )));
       
       System.out.println(collect);
    }
}

class Employee {
    private String name;
    private String department;
    private int salary;
    
    
	public Employee(String name, String department, int salary) {
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	

    
}
