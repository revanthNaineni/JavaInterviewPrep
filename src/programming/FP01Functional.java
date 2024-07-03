package programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP01Functional {

	public static void main(String[] args) {
		// printAllNumbersInListFunctional(List.of(4,5,8,10,15,22,60));
		//printEvenNumbersInListFunctional(List.of(4, 5, 8, 10, 15, 22, 60));
		//printOddNumbersInListFunctional(List.of(4, 5, 8, 10, 15, 22, 60));
		printStringContainsSpringFunctional(List.of("Spring","Spring Boot","API","Microservices","PCF","Docker"));
	}

	private static void printStringContainsSpringFunctional(List<String> frameworks) {
		Predicate<? super String> predicate = framework->framework.length()>=4;
		Function<String,Integer> mapper = framework->framework.length();
		System.out.println(mapper);
		Consumer<? super Integer> action = System.out::println;
		frameworks.stream()
		.filter(predicate)
		.map(mapper)
		.forEach(action);
	}

	public static void print(int n) {
		System.out.println(n);
	}

	public static boolean isEven(int n) {
		return n % 2 == 0;
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()
		.forEach(System.out::println);
	}
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

		Consumer<? super Integer> action = System.out::println;
		numbers.stream()
		//.filter(FP01Functional::isEven)
		.filter(number->number%2==0)
		.map(number->number*number)
		.forEach(action);
	}
	private static void printOddNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()
		//.filter(FP01Functional::isEven)
		.filter(number->number%2==1)
		.forEach(System.out::println);
	}

}
