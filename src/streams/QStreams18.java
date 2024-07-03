package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

//How to count each element/word from the String ArrayList in Java8?
public class QStreams18 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC","CC","CC");
		Map<Object, Long> map = names.stream()
		.collect(Collectors.groupingBy(s->s,Collectors.counting()));
		System.out.println(map);
	}

}
