package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q1 {

	public static void main(String[] args) { // The text to search
        String text = "Java is a popular programming language. Java is widely used in enterprise applications.";
        
        // Compile the regular expression
        Pattern pattern = Pattern.compile("\\bJava");
        
        // Create a Matcher for the given input
        Matcher matcher = pattern.matcher(text);
        
        // Find all occurrences of the pattern
        while (matcher.find()) {
            System.out.println("Found Java at index " + matcher.start());
        }
        }

}
