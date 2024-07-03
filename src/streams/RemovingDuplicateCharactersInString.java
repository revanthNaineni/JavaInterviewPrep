package streams;

import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicateCharactersInString {

	public static void main(String[] args) {
String str="aaaabbbbcccaddddddddda";
		
		String collect = str.chars().mapToObj(s->(char)s)
		.distinct()
		.map(s->Character.toString(s))
		.collect(Collectors.joining());
		
		System.out.println(collect);
	}

}
