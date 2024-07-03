package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Given a list of words, write a Java program using the Stream API to find and print the longest word from the list.
public class QStream4 {


	private static String orElse;

	public static void main(String[] args) {
		List<String> list=List.of("revanth","Reus","Messi","Ousmane Dembele","Ousmane Dembele","Ben","Tendulkar");
		orElse = list.stream()
		.max(Comparator.comparingInt(String::length)).orElse("");
		
		System.out.println(orElse);
	}

}
