package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//You have a list of Employee objects with attributes like name, department, and salary. Using Java Streams, group the employees by department and further group them by their respective roles within each department
class Employee1{
	private String name;
	private String department;																			
	private Long salary;
	
	public Employee1(String name, String department, Long salary) {
		//super();
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

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
public class GroupandPartition1 {
	
	public static void main(String[] args) {
		
	
	Employee1 employee1=new Employee1("Revanth", "Mech", 100000L);
	Employee1 employee2=new Employee1("Dembele", "Sports", 1000000L);
	Employee1 employee3=new Employee1("Messi", "Sports", 10000L);
	Employee1 employee4=new Employee1("Sachin", "Mech", 100000L);
	
	List<Employee1> list=List.of(employee1,employee2,employee3,employee4);
	
	Map<Object, List<Employee1>> collect = list.stream()
	.collect(Collectors.groupingBy(e->e.getDepartment()));
	
	System.out.println(collect);
	}
	
	

}
