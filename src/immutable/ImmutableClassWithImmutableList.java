package immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class ImmutableClass {

	private final String name;
	private final List<String> items;

	public ImmutableClass(String name, List<String> items) {
		super();
		this.name = name;
		this.items = List.copyOf(items);
	}

	public String getName() {
		return name;
	}

	public List<String> getItems() {
		return items;
	}

}

public class ImmutableClassWithImmutableList {
	public static void main(String[] args) {
		List<String> itemList = new ArrayList<>();
        itemList.add("Item1");
        itemList.add("Item2");

        ImmutableClass immutableObject = new ImmutableClass("John Doe", itemList);

        System.out.println(immutableObject);

        // Attempt to modify the original list
        itemList.add("Item3");

        // Attempt to modify the list from the immutable object
        try {
            immutableObject.getItems().add("Item4");
        } catch (UnsupportedOperationException e) {
            System.out.println("Modification not allowed: " + e.getMessage());
        }

        // The immutable object remains unchanged
        System.out.println(immutableObject.getItems());
	}

}
