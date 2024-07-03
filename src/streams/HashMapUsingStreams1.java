package streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapUsingStreams1 {

	public static void main(String[] args) {
		Map<Integer, String> map=Map.of(1, "Revanth", 2, "Dembele", 3, "Messi", 4, "Kane", 5, "Reus");
		//System.out.println(map);
		
		//Given a HashMap<String, Integer>, use Java Streams to retrieve and print all the keys.
		//map.keySet().stream().forEach(System.out::println);
		
		//Given a HashMap<String, Integer>, use Java Streams to retrieve and print all values 
		//We can do it in 2 ways
		//map.keySet().stream().map(s->map.get(s)).forEach(System.out::println);
		//map.values().stream().forEach(System.out::println);
		
		//Given a HashMap<String, Integer>, use Java Streams to retrieve and print all values of length greater than 5
		//map.values().stream().filter(s->s.length()>5).forEach(System.out::println);
		
		Map<String,Integer> map1=Map.of("Revanth", 11, "Dembele", 3, "Messi", 18, "Kane", 25, "Reus", 22);
		
		//Given a HashMap<String, String>, count and print the number of occurrences of a specific value.
		int targetValue = 11;
		long count = map1.values().stream().filter(value -> value.equals(targetValue)).count();
		System.out.println("Occurrences of " + targetValue + ": " + count);
		
		
		//Given a HashMap<String, Integer>, create a new HashMap with the same keys and values incremented by 5.
		Map<Object, Object> modifiedMap = map1.entrySet().stream()
                .collect(Collectors.toMap(entry->entry.getKey(), entry -> entry.getValue() + 5));
		System.out.println(modifiedMap);
	}

}
