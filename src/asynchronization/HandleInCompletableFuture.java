package asynchronization;
import java.util.concurrent.CompletableFuture;

public class HandleInCompletableFuture {
    public static void main(String[] args) {
        // Creating a CompletableFuture that may throw an exception
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            if (true) {
                throw new RuntimeException("Something went wrong!");
            }
            return "Task completed successfully";
        }).handle((result, ex) -> {
            if (ex != null) {
                System.out.println("Exception occurred: " + ex.getMessage());
                return "Fallback result";  // Return a fallback result in case of an exception
            } else {
                return result;  // Return the original result if no exception
            }
        });

        // Print the result
        System.out.println(future.join());  // Output: Exception occurred: Something went wrong!
                                           //         Fallback result
    }
}
