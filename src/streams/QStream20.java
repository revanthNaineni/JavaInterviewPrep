package streams;

import java.util.Comparator;
//Given a list of Person objects with attributes such as age, name, and salary, implement a comparator to sort them based on age in ascending order, name in descending order, and salary in descending order.
import java.util.List;
import java.util.stream.Collectors;

class Person2 {
	int age;
	String name;
	double salary;

	public Person2(int age, String name, double salary) {
		this.age = age;
		this.name = name;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
public class QStream20 {

	public static void main(String[] args) {
		
		List<Person2> persons = List.of(
                new Person2(30, "Alice", 50000),
                new Person2(25, "Bob", 60000),
                new Person2(25, "Bob1", 70000),
                new Person2(30, "Bob", 60000),
                new Person2(30, "Bob", 70000),
                new Person2(35, "Charlie", 60000),
                new Person2(25, "Bob", 90000),
                new Person2(35, "Charlie", 45000)
        );
		
		List<Person2> collect = persons.stream()
				.sorted(Comparator.comparingInt(Person2::getAge)
						.thenComparing(Comparator.comparing(Person2::getName).reversed())
						.thenComparing(Comparator.comparing(Person2::getSalary).reversed()))
				        .collect(Collectors.toList());
		
		System.out.println(collect);

	}

}
