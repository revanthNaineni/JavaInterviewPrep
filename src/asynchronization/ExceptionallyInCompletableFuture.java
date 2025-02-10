package asynchronization;
import java.util.concurrent.CompletableFuture;

public class ExceptionallyInCompletableFuture {
    public static void main(String[] args) {
        // Creating a CompletableFuture that throws an exception
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            if (true) {
                throw new RuntimeException("Something went wrong!");
            }
            return "Task completed successfully";
        }).exceptionally(ex -> {
            // Handling the exception and providing a fallback result
            System.out.println("Exception occurred: " + ex.getMessage());
            return "Fallback result";
        });

        // Print the result
        System.out.println(future.join());  // Output: Exception occurred: Something went wrong!
                                           //         Fallback result
    }
}
