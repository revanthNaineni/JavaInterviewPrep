package streams;

import java.util.HashSet;
import java.util.Set;

public class PrintAllPossibleStringFromGivenStringOfSameLength {
	public static Set<String> set=new HashSet<String>();
	public static void permute(String str, int index) {
		if (index == str.length()) {
			//System.out.println(str);
			set.add(str);
			//return;
		}else {

		for (int i = index; i < str.length(); i++) {
			// Swap characters
			char temp = str.charAt(index);
			str = str.substring(0, index) + str.charAt(i) + str.substring(index + 1);
			str = str.substring(0, i) + temp + str.substring(i + 1);

			// Recursively permute the string with the swapped character
			permute(str, index + 1);

			// Backtrack and swap characters back
			temp = str.charAt(index);
			str = str.substring(0, index) + str.charAt(i) + str.substring(index + 1);
			str = str.substring(0, i) + temp + str.substring(i + 1);
		}
		}
	}

	public static void main(String[] args) {
		String str = "Dembele";
		permute(str, 0);
		set.forEach(System.out::println);
	}
}
