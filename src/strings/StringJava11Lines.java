package strings;

import java.util.stream.Stream;

public class StringJava11Lines {

	public static void main(String[] args) {
		String text = "Hello\nWorld! Dembele";
		Stream<String> lines = text.lines();
		lines.forEach(System.out::println);

	}

}
