package streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseTheWordsOfGivenSentence {

    public static void main(String[] args) {
        String input = "I am in capgemini";
        String reversed = Arrays.stream(input.split(" ")) // Split the string into words
                                .map(word -> new StringBuilder(word).reverse().toString()) // Reverse each word
                                .collect(Collectors.joining(" ")); // Join the words back together
        System.out.println(reversed);
    }
}
