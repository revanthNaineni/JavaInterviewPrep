package streams;

import java.util.List;

//Create a stream of integers from 1 to 10 (inclusive) and use the map operation to square each number. Then, use the forEach terminal operation to print the squared numbers.
public class QStream2 {

	public static void main(String[] args) {
		List<Integer> list=List.of(1,2,3,4,5,6,7,8,9,10);
		list.stream()
		.map(n->n*n)
		.forEach(System.out::println);

	}

}
