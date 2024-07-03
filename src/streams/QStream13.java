package streams;

import java.util.List;

//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
public class QStream13 {

	public static void main(String[] args) {
		List<Integer> list=List.of(10,9,11,127,88,119);
		
		list.stream()
		.map(s->s+"")
		.filter(s->s.startsWith("1"))
		.forEach(System.out::println);
	}

}
