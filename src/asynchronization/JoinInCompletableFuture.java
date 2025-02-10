package asynchronization;
import java.util.concurrent.CompletableFuture;

public class JoinInCompletableFuture {
    public static void main(String[] args) {
        // Create a CompletableFuture that completes normally
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000); // Simulate a delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Task completed successfully";
        });

        // Use join() to get the result
        System.out.println("Waiting for the result...");
        String result = future.join(); // Blocks until the task is complete
        System.out.println("Future result: " + result); // Output: Task completed successfully
    }
}