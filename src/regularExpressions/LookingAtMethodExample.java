package regularExpressions;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class LookingAtMethodExample {
    public static void main(String[] args) {
        String regex = "\\d+"; // Pattern to match one or more digits
        String input = "A123abc456";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        
        boolean result = matcher.lookingAt();
        System.out.println("lookingAt(): " + result); // Output: true
    }
}