package streams;

import java.util.stream.Stream;

public class StringToStream {

	public static void main(String[] args) {
		String name = "RevanthNaineni";

		Stream<Character> mapToObj = name.chars().mapToObj(s -> (char) s);
		
		mapToObj.forEach(System.out::println);
		
	}

}
