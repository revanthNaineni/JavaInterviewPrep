package streams;

import java.util.stream.Stream;

public class PeekMethodInStreams {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("apple", "banana", "cherry");

		// Print each element of the stream before performing any other operation
		stream.peek(System.out::println).map(String::toUpperCase).forEach(System.out::println);
	}

}
