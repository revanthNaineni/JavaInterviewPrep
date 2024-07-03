package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakeWhileInStreams {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> result = numbers.stream()
		                              .takeWhile(n -> n < 5)
		                              .collect(Collectors.toList());

		System.out.println(result); // Output: [5, 6, 7, 8, 9, 10]
		
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13);
		Stream<Integer> stream = list.stream();

		Stream<Integer> droppedStream = stream.takeWhile(n -> n % 2 == 0);
		droppedStream.forEach(System.out::println);
		
		//Output:11 12 13
		
		List<String> strings = Arrays.asList(null, null, "a", "b", "c");

		List<String> results = strings.stream()
		                             .takeWhile(Objects::isNull)
		                             .collect(Collectors.toList());

		System.out.println(result); // Output: ["a", "b", "c"]

	}

}
