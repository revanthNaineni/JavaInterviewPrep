package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringInAList {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("apple", "banana", "orangettttttttt", "grape", "kiwiiiiiiii");

		//For testing
		Comparator<String> comparingInt = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				System.out.println("String 1:" + o1 + " , String 2:" + o2);
				if (o1.length() > o2.length()) {
					return 1;
				} else if (o1.length() < o2.length()) {
					return -1;
				} else {
					return 0;
				}
			}
		};
		Optional<String> longestWord = words.stream().max(Comparator.comparingInt(String::length));

		longestWord.ifPresent(word -> System.out.println("Longest word: " + word));

	}

}
