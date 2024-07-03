package streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesinStream {
	public static void main(String[] args) {
		List<Integer> integers=List.of(1,2,3,4,2,5,4);
		Set<Integer> set=new HashSet<>();
		integers.stream()
		.filter(n->!set.add(n))
		.forEach(System.out::println);
	 }

}
