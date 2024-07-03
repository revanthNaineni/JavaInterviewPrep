package collections;
import java.util.Iterator;
import java.util.LinkedList;

public class QLinkedList {
	public static void main(String[] args) {
		// Creating a LinkedList
		LinkedList<String> linkedList = new LinkedList<>();

		// Adding elements to the LinkedList
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Cherry");
		linkedList.add("Date");

		// Displaying the LinkedList
		System.out.println("LinkedList: " + linkedList);
		
		Iterator<String> iterator = linkedList.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Adding an element at the beginning
		linkedList.addFirst("Avocado");

		// Adding an element at the end
		linkedList.addLast("Fig");

		// Displaying the updated LinkedList
		System.out.println("Updated LinkedList: " + linkedList);

		// Getting the first and last elements
		String firstElement = linkedList.getFirst();
		String lastElement = linkedList.getLast();

		System.out.println("First Element: " + firstElement);
		System.out.println("Last Element: " + lastElement);

		// Removing an element
		linkedList.remove("Banana");

		// Displaying the LinkedList after removal
		System.out.println("LinkedList after removing 'Banana': " + linkedList);

		// Checking if an element exists in the LinkedList
		boolean containsCherry = linkedList.contains("Cherry");
		System.out.println("LinkedList contains 'Cherry': " + containsCherry);

		// Getting the size of the LinkedList
		int size = linkedList.size();
		System.out.println("Size of the LinkedList: " + size);
		System.out.println(linkedList.get(0));

		// Removing all elements
		linkedList.clear();

		// Checking if the LinkedList is empty
		boolean isEmpty = linkedList.isEmpty();
		System.out.println("Is the LinkedList empty? " + isEmpty);
		
		
	}
}
