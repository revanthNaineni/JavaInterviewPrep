package programming;

import java.util.List;
import java.util.stream.*;

public class FP03Functional {

	public static void main(String[] args) {

		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<String> str = List.of("Rev", "Dembele", "Bale", "Balde", "Vinicius", "Reus");
		List<Integer> squaresOfTheList = squaresTheList(list);
		System.out.println(squaresOfTheList);
	}

	private static List<Integer> squaresTheList(List<String> list) {
		// TODO Auto-generated method stub
		return list.stream()
				.map(n->n*n)
				.toList();
	}

}
