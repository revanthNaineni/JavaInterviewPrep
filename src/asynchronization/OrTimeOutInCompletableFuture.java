package asynchronization;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class OrTimeOutInCompletableFuture {
    public static void main(String[] args) throws TimeoutException {
        // Create a CompletableFuture that simulates a long-running task
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000); // Simulate a task that takes 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Task completed successfully";
        });

        // Add a timeout of 2 seconds
        CompletableFuture<String> resultWithTimeout = future.orTimeout(2, TimeUnit.SECONDS);

        try {
            // Attempt to get the result
            String result = resultWithTimeout.get();
            System.out.println("Future result: " + result);
        } catch (Exception e) {
            e.printStackTrace(); // Handle other exceptions
        }
    }
}
