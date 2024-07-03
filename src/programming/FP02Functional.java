package programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP02Functional {

	public static void main(String[] args) {
		//System.out.println("sum: " + printSumOfTheNumbersInListFunctional(List.of(4, 5, 8, 10, 15, 22, 60)));
		System.out.println("sum of squares: " + printSquareOfSumOfTheNumbersInListFunctional(List.of(4, 5, 8, 10, 15, 22, 60)));
		//System.out.println("sum of cubes: " + printCubesOfSumOfTheNumbersInListFunctional(List.of(4, 5, 8, 10, 15, 22, 60)));
		//System.out.println("sum of odd numbers: " + printSumOfTheOddNumbersInListFunctional(List.of(4, 5, 8, 10, 15, 22, 60)));
		//System.out.println("sum of odd numbers: " + printDistinctNumbersInListFunctional(List.of(4, 5, 8, 10, 15, 22, 60,5,54,22,4)));
		//printDistinctNumbersInListFunctional(List.of(4, 5, 8, 10, 15, 22, 60,5,54,22,4));
		//printSorttNumbersInListFunctional(List.of(4, 5, 8, 10, 15, 22, 60,5,54,22,4));
		//printSorttStringInListFunctional(List.of("Rev", "Dembele", "Bale", "Balde", "Vinicius", "Reus"));
	}

	private static void printSorttStringInListFunctional(List<String> strings) {
		// TODO Auto-generated method stub
		
		Function<String,Integer> keyExtractor = s->s.length();
		Function<String,Integer> keyExtractor2 = new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return t.length();
			}
		};
		strings.stream()
		.sorted(Comparator.comparing(keyExtractor2))
		.forEach(System.out::println);
	}

	private static void printDistinctNumbersInListFunctional(List<Integer> numbers) {
		// TODO Auto-generated method stub
		 numbers.stream()
				.distinct().forEach(System.out::println);
	}
	
	private static void printSorttNumbersInListFunctional(List<Integer> numbers) {
		// TODO Auto-generated method stub
		 numbers.stream()
				.sorted(Comparator.comparing(n->n)).distinct().forEach(System.out::println);
	}

	/*
	 * private static int sum(int a,int b) { System.out.println(a+","+b); return
	 * a+b; }
	 */

	private static int printSumOfTheNumbersInListFunctional(List<Integer> numbers) {
		return numbers.stream().reduce(0, (a, b) -> a + b);

	}
	
	@SuppressWarnings("unused")
	private static int printSquareOfSumOfTheNumbersInListFunctional(List<Integer> numbers) {
		BinaryOperator<Integer> accumulator = Integer::sum;
		BinaryOperator<Integer> accumulator2= new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return t+u;
			}
		};
		return numbers.stream()
				.map(n->n*n)
				.reduce(0, accumulator2);

	}
	
	private static int printCubesOfSumOfTheNumbersInListFunctional(List<Integer> numbers) {
		return numbers.stream()
				.map(n->n*n*n)
				.reduce(0, Integer::sum);

	}
	
	private static int printSumOfTheOddNumbersInListFunctional(List<Integer> numbers) {
		Predicate<? super Integer> predicate = n->n%2!=0;
		return numbers.stream()
				.filter(predicate)
				.reduce(0, Integer::sum);

	}

}
