package streams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortHashMapBasedOnValues {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("Apple", 3);
		map.put("Banana", 1);
		map.put("Cherry", 5);
		map.put("Date", 2);
		
		LinkedHashMap<String, Integer> collect = map.entrySet().stream()
		.sorted(Entry.comparingByValue())
		.collect(Collectors.toMap(Entry::getKey, Entry::getValue,(oldValue, newValue) -> oldValue, 
                LinkedHashMap::new));
		
		System.out.println(collect);
	
	}

}
