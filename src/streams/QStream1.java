package streams;

// Given a list of strings, write a Java code snippet using the Stream API to filter out the strings that have length less than 5 characters and then transform the remaining strings to uppercase. Finally, collect the result into a new list.

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QStream1 {
	
	
	public static void main(String[] args) {
		List<String> list=List.of("revanth","Reus","Messi","Dembele","Ben","Tendulkar");
		List<String> collect = list.stream()
		.filter(s->s.length()>=5)
		.map(s->s.toUpperCase())
		.collect(Collectors.toList());
		
		System.out.println(collect);
		


	}

}
