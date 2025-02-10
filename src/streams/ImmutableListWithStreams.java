package streams;

import java.util.List;
import java.util.stream.Stream;

public class ImmutableListWithStreams {
	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of(1,2,3,4,5,6,7,8,9,10,null);
		
		List<Integer> list = stream.toList();
		
		//list.add(12); //will get runtime exception as list is immutable
		
		System.out.println(list);
		
		
	}

}
