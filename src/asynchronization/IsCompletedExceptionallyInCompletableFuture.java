package asynchronization;
import java.util.concurrent.CompletableFuture;

public class IsCompletedExceptionallyInCompletableFuture {
    public static void main(String[] args) {
        // Create a CompletableFuture that throws an exception
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            if (true) {
                throw new RuntimeException("Something went wrong!");
            }
            return "Task completed successfully";
        });

        // Wait briefly to ensure the async task finishes
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if the future completed exceptionally
        if (future.isCompletedExceptionally()) {
            System.out.println("The future completed exceptionally.");
        } else {
            System.out.println("The future completed successfully: " + future.join());
        }
    }
}
