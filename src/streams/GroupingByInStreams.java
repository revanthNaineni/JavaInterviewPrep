package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingByInStreams {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple","apple", "banana", "avocado", "blueberry", "blackberry");
		
		Map<Integer, Long> collect = words.stream().
		collect(Collectors.groupingBy(String::length,Collectors.counting()));
		System.out.println(collect);
		
		Map<Integer, Long> collect2 = collect.entrySet()
		.stream().filter(s->s.getValue()>1)
		.collect(Collectors.toMap(s->s.getKey(), s->s.getValue()));
		
		System.out.println(collect2);

	}

}
