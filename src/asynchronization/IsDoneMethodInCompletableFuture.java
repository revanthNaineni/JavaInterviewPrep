package asynchronization;
import java.util.concurrent.CompletableFuture;

public class IsDoneMethodInCompletableFuture {
    public static void main(String[] args) throws InterruptedException {
        // Create a CompletableFuture with an asynchronous task
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000); // Simulate a long-running task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Task completed successfully";
        });

        // Check the status of the future before it completes
        System.out.println("Is the future done? " + future.isDone()); // Output: false

        // Wait for a short time and check again
        Thread.sleep(2500);
        System.out.println("Is the future done? " + future.isDone()); // Output: true

        // Get the result of the future
        System.out.println("Future result: " + future.join()); // Output: Task completed successfully
    }
}
