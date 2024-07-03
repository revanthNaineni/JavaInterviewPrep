package streams;

import java.util.Map;
import java.util.stream.Collectors;

public class CountingVowelsandConsonants {

	public static void main(String[] args) {
		String str="aaaabbbbcccaddddddddda";
		Map<Boolean, Long> collect = str.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.partitioningBy(c -> "aeiouAEIOU".indexOf(c) >= 0, Collectors.counting()));
		
		System.out.println(collect);
	}

}
