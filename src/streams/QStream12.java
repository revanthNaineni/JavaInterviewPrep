package streams;

import java.util.Comparator;
import java.util.stream.Stream;

//Implement a custom stream operation that takes a stream of integers, squares each element, filters out the even squares, and returns the result in descending order.
public class QStream12 {

	public static void main(String[] args) {
		
		Stream<Integer> stream=Stream.of(4,9,12,13,11,5);
		
		stream.map(n->n*n)
		.filter(n->n%2!=0)
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);

	}

}
