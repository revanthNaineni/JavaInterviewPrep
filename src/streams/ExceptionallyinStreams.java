package streams;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class ExceptionallyinStreams {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("1", "2", "3", "four", "5");

		List<Integer> numbers = strings.stream()
		    .map(s -> Integer.parseInt(s))
		    .exceptionally(e->1) // Provide a default value in case of exception
		    .collect(Collectors.toList());
	}

}
