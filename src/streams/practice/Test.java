package streams.practice;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		String str="RevanthNaineni";
		
		Optional<Character> first = str.chars().mapToObj(c-> (char)c)
		.collect(Collectors.groupingBy(s->s, Collectors.counting()))
		.entrySet().stream()
		.filter(k->k.getValue()>1)
		.map(v->v.getKey())
		.skip(1)
		.findFirst();
		
		
		System.out.println(first.get());
	}
	
	

}
