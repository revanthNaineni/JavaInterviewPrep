package streams;

import java.util.Arrays;

public class ArraysToStreams {

	public static void main(String[] args) {
		
		int[] numbers = {5, 2, 8, 1, 6,6};
		Arrays.stream(numbers).boxed()
		      .sorted()
		      .forEach(System.out::println);

		System.out.println("Distinct Numbers");
		Integer[] array = Arrays.stream(numbers)
	      .distinct().boxed()
	      .toArray(Integer []::new);
		
		for (Integer integer : array) {
			System.out.println(integer);
		}

	}

}
