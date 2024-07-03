package streams;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForEachandCollectMethod {

	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of(1,3,4,6,8,10,2,3);
		stream.forEach(System.out::println);//method reference
		
		Stream<Integer> stream2=Stream.of(1,3,4,6,8,10,2,3);
		Set<Integer> collect = stream2.collect(Collectors.toSet());
		System.out.println(collect);
	}

}
