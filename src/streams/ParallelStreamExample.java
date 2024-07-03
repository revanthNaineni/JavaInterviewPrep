package streams;
import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Creating a parallel stream
        numbers.parallelStream().sorted()
        .forEachOrdered(number -> {
                    System.out.println(Thread.currentThread().getName() + " processing " + number);
                });
    }
}
