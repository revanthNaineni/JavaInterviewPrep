package immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class ImmutablePerson {
    // Immutable fields
    private final String name;
    
    // Mutable field
    private final List<String> hobbies;

    // Constructor
    public ImmutablePerson(String name, List<String> hobbies) {
        // Assign immutable field directly
        this.name = name;
        
        // Create a defensive copy of the mutable list to prevent external modification
        this.hobbies = List.copyOf(hobbies); // Java 10 and above
    }

    // Getter for immutable field
    public String getName() {
        return name;
    }

    // Getter for mutable field (returns an unmodifiable view or defensive copy)
    public List<String> getHobbies() {
        // Return an unmodifiable copy to preserve immutability
        return Collections.unmodifiableList(hobbies);
    }

    // No setters to modify the state
}

public class ImmutableObjectWithMutableAndImmutableElements {

	public static void main(String[] args) {
		List<String> hobbies = new ArrayList<>();
        hobbies.add("Reading");
        hobbies.add("Cycling");

        ImmutablePerson person = new ImmutablePerson("John Doe", hobbies);

        // The name is immutable
        System.out.println("Name: " + person.getName());

        // Hobbies are returned as an unmodifiable list
        System.out.println("Hobbies: " + person.getHobbies());

        // Attempt to modify the original list does not affect the immutable person object
        hobbies.add("Swimming");
        System.out.println("Modified original list: " + hobbies);
        System.out.println("Hobbies (from person): " + person.getHobbies());

        // Attempt to modify the hobbies list from the person object will throw an UnsupportedOperationException
        person.getHobbies().add("Swimming");
	}

}
