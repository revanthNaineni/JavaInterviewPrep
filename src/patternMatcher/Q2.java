package patternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q2 {

	public static void main(String[] args) {
		// The text to search
        String text = "Java is a popular programming language. Java is widely used in enterprise applications.";
        
        // Compile the regular expression
        Pattern pattern = Pattern.compile("Java");
        
        // Create a Matcher for the given input
        Matcher matcher = pattern.matcher(text);
        
        // Replace all occurrences of the pattern with "Java Programming"
        String replacedText = matcher.replaceAll("Java Programming");
        
        System.out.println(replacedText);
	}

}
