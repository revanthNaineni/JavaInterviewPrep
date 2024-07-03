package programming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FP06Streams {

	public static void main(String[] args) {
		
		int arr []= {1,4,19,22,3,209,44,482};
		IntStream stream = Arrays.stream(arr);
		//stream.forEach(System.out::println);
		//System.out.println(IntStream.range(1, 10).sum());
		//System.out.println(IntStream.rangeClosed(1, 10).sum());
		//int sum = IntStream.iterate(2, n->n+2).limit(10).peek(System.out::println).sum();
		int sum2 = IntStream.iterate(2, n->n*2).limit(10).peek(System.out::println).sum();
		System.out.println("sum "+sum2);
		
	}

}
