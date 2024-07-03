package strings;

public class PossibleSubstringsFromGivenString {

	    public static void main(String[] args) {
	        String input = "abcdef";
	        int substringLength = 4;

	        printSubstringsOfSameLength(input, substringLength);
	    }

	    static void printSubstringsOfSameLength(String input, int length) {
	        int n = input.length();

	        if (length > n) {
	            System.out.println("Invalid input: Substring length is greater than the input string length.");
	            return;
	        }

	        System.out.println("All substrings of length " + length + ":");
	        
	        for (int i = 0; i <= n - length; i++) {
	            for (int j = i; j < i + length; j++) {
	                System.out.print(input.charAt(j));
	            }
	            System.out.println();
	        }
	    }
	}

