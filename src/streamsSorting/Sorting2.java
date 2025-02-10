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
		map.put("Eve", 25);
        map.put("Alice", 30);
        map.put("Charlie", 30);
        map.put("David", 35);
        map.put("Bob", 25);
        
        Map<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    // First compare keys in ascending order
                    int keyComparison = e1.getKey().compareTo(e2.getKey());
                    if (keyComparison == 0) {
                        // For the same key, compare values in descending order
                        return e2.getValue().compareTo(e1.getValue());
                    }
                    return keyComparison;
                })
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, // Handle duplicates (not needed here)
                        LinkedHashMap::new // Maintain insertion order
                ));
		

        // Print the sorted map
        sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));
	}

}
