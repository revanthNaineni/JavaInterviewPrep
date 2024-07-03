package capgeminiInterview;

import java.util.List;
import java.util.Optional;

//Given list of Integers. Find the product of those elements
public class FindTheProductofListElements {

	public static void main(String[] args) {
		List<Integer> list=List.of(1,2,3,4,5,6);
		
		//1st way
		Optional<Integer> reduce = list.stream()
		.reduce((a,b)->a*b);
		
		System.out.println(reduce.get());
		
		//2nd way
		Integer product = list.stream()
				.reduce(1,(a,b)->a*b);
				
				System.out.println(reduce);
	}

}
