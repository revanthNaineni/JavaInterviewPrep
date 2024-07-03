package streams;

import java.util.stream.Collectors;

public class QStream22 {

	public static void main(String[] args) {
		
		String str = "aaaabbbbcccada";
		
		String collect=str.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
        .entrySet().stream()
        .map(entry -> entry.getKey().toString() + entry.getValue())
        .collect(Collectors.joining());
		
		System.out.println(collect);
	}

}
