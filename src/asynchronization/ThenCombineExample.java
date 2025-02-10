package asynchronization;
import java.util.concurrent.CompletableFuture;

public class ThenCombineExample {
    public static void main(String[] args) {
        // First CompletableFuture
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Future1 is running..."+Thread.currentThread().getName());
            return 10;
        });

        // Second CompletableFuture
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Future2 is running..."+Thread.currentThread().getName());
            return 20;
        });

        // Combine the results of both futures
        CompletableFuture<Integer> combinedFuture = future1.thenCombine(future2, (result1, result2) -> {
            System.out.println("Combining results: " + result1 + " + " + result2+Thread.currentThread().getName());
            return result1 + result2; // Combine logic: sum of results
        });

        // Get the combined result
        combinedFuture.thenAccept(combinedResult -> 
            System.out.println("Combined Result: " + combinedResult+Thread.currentThread().getName())
        );
    }
}
