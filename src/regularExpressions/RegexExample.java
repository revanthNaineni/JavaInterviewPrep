package regularExpressions;
import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        // Define a regular expression pattern
        String regex = "\\bcat\\b";
        
        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        
        // Define an input string
        String input = "The cat sat on cat the cat mat.";
        
        // Create a matcher for the input string
        Matcher matcher = pattern.matcher(input);
        
        // Check if the pattern matches
        boolean found = matcher.find();
        
        if (found) {
            System.out.println("Match found!");
        } else {
            System.out.println("No match found.");
        }
        
        // Print all matches
        matcher.reset(); // Reset matcher to start from the beginning
        while (matcher.find()) {
            System.out.println("Match: " + matcher.group());
        }
    }
}