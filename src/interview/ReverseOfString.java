package interview;

import java.util.Iterator;

public class ReverseOfString {
	
	public static void main(String[] args) {
        String originalString = "Hello, World!";

        // Converting the string to a character array
        char[] charArray = originalString.toCharArray();

        // Reversing the character array in-place
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            // Swap characters at start and end positions
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }

        // Creating a new String from the reversed character array
        String reversedString = new String(charArray);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }

}
