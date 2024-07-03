package streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseAStringUsingStreams {

	public static void main(String[] args) {
		String input = "Hello, World!";
        String reverse = reverse(input);
        System.out.println(reverse);
	}
	
	public static String reverse(String string) {
        return Stream.of(string)
            .map(word->new StringBuilder(word).reverse().toString())
            .collect(Collectors.joining());
    }

}
