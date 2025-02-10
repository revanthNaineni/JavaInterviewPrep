package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class BoxedInStreams {

	public static void main(String[] args) {
		int[] numbers = {5, 2, 8, 1, 6,6};
		Stream<Integer> boxed = Arrays.stream(numbers)
		.boxed();
		
	}

}
