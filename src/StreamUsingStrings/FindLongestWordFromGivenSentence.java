package StreamUsingStrings;

import java.util.Arrays;
import java.util.Comparator;

//Write a program to find the longest word in a sentence using streams.
public class FindLongestWordFromGivenSentence {

	public static void main(String[] args) {
		String str="Git rebase is a Git command";
		
		String orElse = Arrays.stream(str.split(" "))
		.max(Comparator.comparing(String::length)).orElse("");
		
		System.out.println(orElse);
		
	}

}
