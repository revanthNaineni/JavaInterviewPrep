package streams;

import java.util.List;

//Write a Java code snippet using the Stream API to check if a list of strings contains at least one string that starts with the letter 'A'.
public class QStream7 {

	public static void main(String[] args) {
		List<String> list=List.of("revanth","Reus","Messi","Dembele","Ben","Tendulkar","Anderson");
		list.stream()
		.filter(p->p.startsWith("A"))
		.forEach(System.out::println);
	}

}
