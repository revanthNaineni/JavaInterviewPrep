package javaInterviewQs;

import java.util.StringTokenizer;

public class TokenizerExample {
    public static void main(String[] args) {
        String input = "Hello, world!//This is a tokenizer example.";
        StringTokenizer tokenizer = new StringTokenizer(input, " ,!//.");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
