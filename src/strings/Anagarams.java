package strings;

import java.util.Arrays;

public class Anagarams {

	public static void main(String[] args) {
		
		System.out.println(Anagarams.class.getClassLoader());
		
		String s1="Robed";
		String s2="Bored";
		isAnagrams(s1, s2);
		
	}

	private static void isAnagrams(String s1, String s2) {
		if (s1.length() == s2.length()) {
			char[] charArray1 = s1.toLowerCase().toCharArray();
			char[] charArray2 = s2.toLowerCase().toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			if (Arrays.equals(charArray1, charArray2)) {
				System.out.println(s1 + " and " + s2 + " are anagrams");
			} else {
				System.out.println(s1 + " and " + s2 + " are not anagrams");
			}
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");

		}
	}

}
