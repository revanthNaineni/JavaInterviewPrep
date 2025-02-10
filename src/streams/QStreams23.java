package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Print the element that appears more than n/2 times in the list using Streams

public class QStreams23 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 1, 3, 3, 2, 3, 3);
		
		//1st way
		Optional<Integer> map = numbers.stream()
		.collect(Collectors.groupingBy(n->n, Collectors.counting()))
		.entrySet().stream()
		.max(Comparator.comparing(Entry::getValue))
		.map(s->s.getKey());
		
		System.out.println(map.get());
		
		//2nd way
		List<Integer> list = numbers.stream()
				.collect(Collectors.groupingBy(n->n, Collectors.counting()))
				.entrySet().stream()
				.filter(n->n.getValue()>numbers.size()/2)
				.map(s->s.getKey())
				.toList();
		
		System.out.println(list);
		
	}
	
	
	
	

}
