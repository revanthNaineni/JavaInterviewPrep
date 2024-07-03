package streams;

import java.util.Arrays;
import java.util.Comparator;

public class SortTheElementsBasedonFirstDigit {

	public static void main(String[] args) {

		int[] numbers = { 45, 2, 89, 325, 156, 54 };

		Integer[] sortedNumbers = Arrays.stream(numbers).boxed()
				.sorted(Comparator.comparingInt(n -> Integer.parseInt(String.valueOf(n).substring(0, 1))))
				.toArray(Integer[]::new);

		System.out.println(Arrays.toString(sortedNumbers));

	}

}
