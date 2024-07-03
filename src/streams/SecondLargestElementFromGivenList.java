package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestElementFromGivenList {

	public static void main(String[] args) {
		List<Integer> list=List.of(1,8,-11,12,6, 9,-22,-18,3,44);
		
		Optional<Integer> secondLargestElement = list.stream()
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst();
		
		if(secondLargestElement.isPresent()) {
			System.out.println(secondLargestElement.get());
		}
		 
	}

}
