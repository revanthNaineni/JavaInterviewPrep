package streams;

import java.util.ArrayList;
import java.util.List;

//You have a list of Person objects, each with a name and an age. Write a Java code snippet using the Stream API to find the average age of all persons whose age is greater than 25.

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
}

public class QStream3 {

	public static void main(String[] args) {
		Person person1=new Person("Revanth1", 21);
		Person person2=new Person("Revanth2", 22);
		Person person3=new Person("Revanth3", 23);
		Person person4=new Person("Revanth4", 24);
		Person person5=new Person("Revanth5", 25);
		Person person6=new Person("Revanth5", 26);
		Person person7=new Person("Revanth5", 27);
		Person person8=new Person("Revanth5", 28);
		Person person9=new Person("Revanth5", 29);
		
		List<Person> list=new ArrayList<>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		list.add(person4);
		list.add(person5);
		list.add(person6);
		list.add(person7);
		list.add(person8);
		list.add(person9);
		
		double avg = list.stream()
		.filter(p->p.age>25)
		.mapToDouble(p->p.age)
		.average()
		.orElse(0.0);
		
		System.out.println(avg);
		
	}

}
