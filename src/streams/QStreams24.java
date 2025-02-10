package streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

//Assume we have a list, we have converted that list to HashMap by adding list values as keys and count as values. Write a code to  maintain the insertion with Map?


public class QStreams24 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 1, 3, 3, 2, 3, 3);
		
		//1st way
		LinkedHashMap<Integer, Long> linkedHashMap = numbers.stream()
		.collect(Collectors.groupingBy(n->n, Collectors.counting()))
		.entrySet().stream()
		.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (oldvalue,newValue)-> oldvalue, LinkedHashMap::new));
		
		System.out.println(linkedHashMap);
		
	}
}
