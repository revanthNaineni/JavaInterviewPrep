package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int hashCode() {
    	System.out.println("HashCode method called");
        int result = 17;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public boolean equals(Object o) {
    	System.out.println("Equals method called");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }
}

public class HashCodeAndEqualsExample {

	public static void main(String[] args) {
		Person person=new Person("Revanth", "Naineni", 27);
		Person person2=new Person("Revanth", "Naineni", 27);
		//System.out.println(person.hashCode());
		//System.out.println(person2.hashCode());
		//System.out.println(person.equals(person2));
		
		Map<Person, Integer> map=new HashMap<Person, Integer>();
		map.put(person, 1);
		map.put(person2, 2);
		
		System.out.println(map);
	}

}
