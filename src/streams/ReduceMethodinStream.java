package streams;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceMethodinStream {

	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of(1,3,4,6,8,10,2,3);
		/*
		 * BinaryOperator<Integer> accumulator = new BinaryOperator<Integer>() {
		 * 
		 * @Override public Integer apply(Integer t, Integer u) { // TODO Auto-generated
		 * method stub return t+u; } };
		 */
		Integer reduce = stream.reduce(0,(a,b)->a+b);
		System.out.println(reduce);
	}

}
