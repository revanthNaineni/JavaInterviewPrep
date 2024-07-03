package StreamUsingStrings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

//find the most frequent word in a sentence using streams.
public class MostFrequentWordInGivenSentence {

	public static void main(String[] args) {
		String str="one one one one one one two two three three three four four four four";
		
		String orElse = Arrays.stream(str.split(" "))
		.collect(Collectors.groupingBy(s->s,Collectors.counting()))
		.entrySet().stream()
		.max(Comparator.comparing(Map.Entry::getValue))
		.map(Map.Entry::getKey)
		.orElse("");
		
		System.out.println(orElse);
		
		

	}

}
