package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		printAllNumbersInListstructured(List.of(4, 5, 8, 10, 15, 22, 60));
	}

	private static void printAllNumbersInListstructured(List<Integer> numbers) {
		// TODO Auto-generated method stub
		for (int num : numbers) {
			System.out.println(num);
		}
	}

}
