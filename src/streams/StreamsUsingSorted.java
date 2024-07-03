package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Employee{
	int age;
	String name;
	String department;
	Long salary;
	
	public Employee(int age, String name, String department, Long salary) {
		this.age = age;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
	
	
	
	
	
	
}

public class StreamsUsingSorted {

	public static void main(String[] args) {
		
		Stream<String> stream=Stream.of("Dembele","Messi","Lewandowski","Musiala");
		//stream.sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
		
		
		Employee employee1=new Employee(43, "Suarez", "Sports", 300000L);
		Employee employee2=new Employee(34, "John Cena", "Acting", 200000L);
		Employee employee3=new Employee(56, "Modi", "Politics", 30000L);
		Employee employee4=new Employee(23, "Red John", "Crime", 15000L);
		
		List<Employee> employees=List.of(employee1,employee2,employee3,employee4);
		employees.stream().
		sorted(Comparator.comparing(Employee::getSalary).reversed()).map(s->s.salary).forEach(System.out::println);
		
		employees.stream().map(s->s.name).
		//sorted(Comparator.comparing(Employee::getSalary)).map(s->s.salary).forEach(System.out::println);
		sorted().forEach(System.out::println);
	}

}
