package regularExpressions;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatchesMethodExample {
    public static void main(String[] args) {
        String regex = "\\d+"; // Pattern to match one or more digits
        String input = "12345ed";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        
        boolean result = matcher.matches();
        System.out.println("matches(): " + result); // Output: true
    }
}