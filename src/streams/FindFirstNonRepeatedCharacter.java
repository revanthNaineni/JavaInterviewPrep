package streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FindFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String str="aabbcddeefggh";
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
			
		}
		
		Optional<Character> first = map.entrySet().stream()
		.filter(s->s.getValue()==1)
		.map(Map.Entry::getKey)
		.findFirst();
		
		if(first.isPresent()) {
			System.out.println(first.get());
		}
		
		
	}

}
