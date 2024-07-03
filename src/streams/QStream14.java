package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Given a list of integers, find the maximum value element present in it using Stream functions
public class QStream14 {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Optional<Integer> findFirst = myList.stream()
		.sorted(Comparator.reverseOrder())
		.findFirst();
		if(findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
		
		Optional<Integer> max = myList.stream()
		.max(Integer::compareTo);
		if(findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
	}

}
