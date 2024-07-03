package streams;

import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, filter out strings that contain the letter 'a', convert them to uppercase, and then concatenate them into a single string
public class QStream11 {

	public static void main(String[] args) {
		List<String> list=List.of("Revanth","Dembele","Ronaldo","Reus");
		
		String string = list.stream()
		.filter(s->!s.contains("a"))
		.map(s->s.toUpperCase())
		//.reduce((s1,s2)->s1+s2).orElse("");
		.collect(Collectors.joining());
		
		System.out.println(string);
	}

}
