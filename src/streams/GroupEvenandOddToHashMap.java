package streams;

import java.util.*;
import java.util.stream.*;

public class GroupEvenandOddToHashMap {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<String, List<Integer>> oddEvenMap = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));

        System.out.println(oddEvenMap);
    }
}

