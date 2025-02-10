package serialization;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Person implements Serializable {
    private static final long serialVersionUID = 2L;  // Version identifier
    String name;
    int age;
    
    Person(String name) {
        this.name = name;
    }
}

public class InvalidClassExceptionWhileSerialization {
    public static void main(String[] args) {
		
		
		
		/*
		 * Person person = new Person("John Doe");
		 * 
		 * try (FileOutputStream fileOut = new FileOutputStream("person.ser");
		 * ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
		 * 
		 * out.writeObject(person);
		 * System.out.println("Serialized data is saved in person.ser"); } catch
		 * (IOException e) { e.printStackTrace(); }
		 */
		 
		 
		 
        
		
		
		try (FileInputStream fileIn = new FileInputStream("person.ser");
				ObjectInputStream in = new ObjectInputStream(fileIn)) {

			Person person = (Person) in.readObject(); // Deserialization
			System.out.println("Deserialized Person name: " + person.name);
			System.out.println("Deserialized Person name: " + person.age);
		} catch (InvalidClassException e) {
			System.out.println("InvalidClassException caught!");
			e.printStackTrace();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		 
		 
		 
    }
}
