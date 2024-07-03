package streams;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MostRepeatedCharacterInString {

	public static void main(String[] args) {
		
		String str="aaaabbbbcccaddddddddda";
		
		Optional<Character> map = str.chars().mapToObj(s->(char)s)
		.collect(Collectors.groupingBy(s->s,Collectors.counting()))
		.entrySet().stream()
		.max(Comparator.comparing(Map.Entry::getValue))
		.map(Map.Entry::getKey);
		
		if(map.isPresent()) {
			System.out.println(map.get());
		}
		
		
		
		
	}

}
