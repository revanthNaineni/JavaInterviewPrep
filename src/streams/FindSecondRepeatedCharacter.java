package streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.PrimitiveIterator.OfInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindSecondRepeatedCharacter {

	public static void main(String[] args) {

		String name = "RevanthNaineni";

		char[] chars = name.toCharArray();

		// Create a map to store the count of each character
		Map<Character, Integer> charCountMap = new LinkedHashMap<>();

		// Count the occurrences of each character
		for (char ch : chars) {
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		}
		
		System.out.println(charCountMap);
		
		Optional<Character> first = charCountMap.entrySet().stream()
		.filter(e->e.getValue()>1)
		.map(e->e.getKey())
		.skip(1)
		.findFirst();
		
		if(first.isPresent()) {
			System.out.println(first.get());
		}
		
		
		

	}

}
