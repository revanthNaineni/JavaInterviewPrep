package streams;

import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of(1,3,4,6,8,10,2,3);
		stream.filter(n->n%2==0).
		forEach(System.out::println);
	}

}
