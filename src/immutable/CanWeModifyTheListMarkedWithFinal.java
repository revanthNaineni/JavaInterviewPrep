package immutable;

import java.util.ArrayList;
import java.util.List;

public class CanWeModifyTheListMarkedWithFinal {

	public static void main(String[] args) {
		final List<String> hobbies = new ArrayList<>();

		// You can modify the contents of the list (add elements)
		hobbies.add("Reading");
		hobbies.add("Cycling");

		// You can still modify the list (remove elements)
		hobbies.remove("Reading");

		System.out.println(hobbies); // Output: [Cycling]

		// However, you cannot reassign the 'hobbies' variable
		// hobbies = new ArrayList<>(); // This will cause a compilation error
	}

}
