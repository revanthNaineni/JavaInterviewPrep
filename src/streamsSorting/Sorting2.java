package streamsSorting;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Given a Map<String, Integer>, write code to sort this map first by its keys in ascending order, and for keys with the same value, sort them by their corresponding values in descending order using Java streams.
public class Sorting2 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 30);
        map.put("David", 35);
        map.put("Eve", 25);
        
        Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        
		/*
		 * map.entrySet().stream() .sorted(Comparator.comparing(Map.Entry::getKey)
		 * .thenComparing(Comparator.comparing(Map.Entry::getValue).reversed()))
		 * .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue ));
		 */

        // Print the sorted map
        sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));
	}

}
