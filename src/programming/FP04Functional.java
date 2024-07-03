package programming;

import java.util.List;
import java.util.function.Predicate;

public class FP04Functional {

	public static void main(String[] args) {
    
		List<Integer> numbers=List.of(4,8,13,77,82,36,35,23);
		
		//extracted(numbers, n->n%2==0);
		
		//extracted(numbers, n->n%2!=0);
		
		extracted(numbers, n->n%3==0);
	}

	private static void extracted(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream()
		.filter(predicate)
		.forEach(System.out::println);
	}

}
