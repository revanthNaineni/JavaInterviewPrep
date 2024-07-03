package streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Optional;

public class FirstNonRepeatedCharacterInString {

	public static void main(String[] args) {
		// Dembele
		String s="kkjDDemmbbelle";
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
			
		}
		
		Optional<Character> first = map.entrySet().stream()
		.filter(t->t.getValue()==1)
		.map(Map.Entry::getKey)
		.findFirst();
		
		if(first.isPresent()) {
			System.out.println(first.get());
		}
		
	
	}

}
