package streams;

import java.util.List;

//Create a stream of integers and use the limit operation to get the first 5 even numbers from the stream.
public class QStream6 {

	public static void main(String[] args) {
		List<Integer> list=List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		list.stream()
		.filter(p->p%2==0)
		.limit(5)
		.forEach(System.out::println);
	}

}
