package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondMostRepeatedCharactedInString {

	public static void main(String[] args) {
String str="aaaabbbbcccaddddddddda";
		
		List<Character> list = str.chars().mapToObj(s->(char)s)
		.collect(Collectors.groupingBy(s->s,Collectors.counting()))
		.entrySet().stream()
		.sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
		.skip(1)
		.limit(1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		
		System.out.println(list);
		
		

	}

}
