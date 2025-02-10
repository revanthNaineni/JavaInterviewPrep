package asynchronization;
import java.util.concurrent.CompletableFuture;

public class AllOfExample {
    public static void main(String[] args) {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Task 1");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "Task 2");
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "Task 3");

        CompletableFuture<Void> allFutures = CompletableFuture.allOf(future1, future2, future3);

        // Wait for all futures to complete
        allFutures.thenRun(() -> {
            System.out.println("All tasks completed!");
        }).join();
    }
}
