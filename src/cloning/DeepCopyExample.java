package cloning;
class Address1 implements Cloneable {
    String city;
    Address1(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Address1(this.city); // Explicitly create a new instance
    }
}

class Person implements Cloneable {
    String name;
    Address1 address;

    Person(String name, Address1 address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone(); // Shallow copy of Person
        cloned.address = (Address1) this.address.clone(); // Deep copy of Address
        return cloned;
    }
}

public class DeepCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address1 address = new Address1("Hyderabad");
        Person person1 = new Person("Revanth", address);
        Person person2 = (Person) person1.clone(); // Deep copy

        person2.address.city = "Bangalore";
        System.out.println(person1.address.city); // Output: Hyderabad (independent reference)
        System.out.println(person2.address.city);
    }
}
