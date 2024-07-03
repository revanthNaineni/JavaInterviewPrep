package DS;

/*You are given two strings: pattern and source. The first string pattern contains only the symbols 0 and 1, and the second string source contains only lowercase English letters.

Your task is to calculate the number of substrings of source that match pattern. 

We’ll say that a substring source[l..r] matches pattern if the following three conditions are met:
– The pattern and substring are equal in length.
– Where there is a 0 in the pattern, there is a vowel in the substring. 
– Where there is a 1 in the pattern, there is a consonant in the substring. 

Vowels are ‘a‘, ‘e‘, ‘i‘, ‘o‘, ‘u‘, and ‘y‘. All other letters are consonants.

Example

For pattern = "010" and source = "amazing", the output should be solution(pattern, source) = 2.
– “010” matches source[0..2] = "ama". The pattern specifies “vowel, consonant, vowel”. “ama” matches this pattern: 0 matches a, 1 matches m, and 0 matches a. 
– “010” doesn’t match source[1..3] = "maz" 
– “010” matches source[2..4] = "azi" 
– “010” doesn’t match source[3..5] = "zin" 
– “010” doesn’t match source[4..6] = "ing"

So, there are 2 matches. For a visual demonstration, see the example video. 

For pattern = "100" and source = "codesignal", the output should be solution(pattern, source) = 0.
– There are no double vowels in the string "codesignal", so it’s not possible for any of its substrings to match this pattern.*/

public class StringPatternMatch {
	

	    public static void main(String[] args) {
	        String pattern1 = "010";
	        String source1 = "amazing";
	        System.out.println(solution(pattern1, source1)); // Output: 2

	        String pattern2 = "100";
	        String source2 = "codesignal";
	        System.out.println(solution(pattern2, source2)); // Output: 0
	    }

	    public static int solution(String pattern, String source) {
	        int count = 0;
	        int patternLength = pattern.length();
	        int sourceLength = source.length();

	        for (int i = 0; i <= sourceLength - patternLength; i++) {
	            String substring = source.substring(i, i + patternLength);
	            if (isMatch(pattern, substring)) {
	                count++;
	            }
	        }

	        return count;
	    }

	    private static boolean isMatch(String pattern, String substring) {
	        for (int i = 0; i < pattern.length(); i++) {
	            char patternChar = pattern.charAt(i);
	            char sourceChar = substring.charAt(i);

	            if ((patternChar == '0' && !isVowel(sourceChar)) ||
	                (patternChar == '1' && isVowel(sourceChar))) {
	                return false;
	            }
	        }
	        return true;
	    }

	    private static boolean isVowel(char c) {
	        return "aeiouy".indexOf(c) != -1;
	    }


}
