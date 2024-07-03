package streams;

import java.util.Comparator;

public class VarWithLambdaJava11 {

	public static void main(String[] args) {
		// Traditional approach (specifying type)
		Comparator<String> comparator = (String s1, String s2) -> s1.compareTo(s2);

		// Using var with lambda (type inference)
		Comparator<String> comparator2 = (var s1, var s2) -> s1.compareTo(s2);

	}

}
